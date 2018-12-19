/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: Controller class has functions to call web services and update MySql database
* 				  with the data. Below is the basic functioning of this controller.
* 				  - Retrieve a list of stocks from the Stock MySql table.
* 				  - Loop through the list and for each stock retrieve stock details and store in
* 				    StockDetails table; retrieve moving averages and store in MovingAverages table;
* 					retrieve historical prices and store in HistoricalPrices table.
*/

package com.stock.stockdetails;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stock.historicalprices.HistPriceDAO;
import com.stock.miscfunctions.MiscFunctions;
import com.stock.movingaverage.MovingAverageDAO;

@RestController
@RequestMapping(value = "/rest/symbols")
public class StockDetailsController
{
	@Autowired
	StockDetailsService stockDetailsService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private final String alphaAPIKey = "58A2OIAHS4N54O2F2";

	/*This mapping denotes the Tomcat endpoint. Enter this value in Postman to test the remote web service*/
	
	@GetMapping(value =  "/stockdetails")
	public void retrieveOptionalbleSymbols()
	{
		logger.info(">>>>> StockDetailsController::retrieveOptionalbleSymbols");

		/*Get an array of stock symbols from the database. Than loop
		 * through each and get the stock details from IEX*/
		
		try
		{
			/* Get all optionable stocks from the database. Then loop through and fetch each stock */
			for (Stock stock : stockDetailsService.getOptionableStocks("Y"))
			{
				/*
				System.out.println("Symbol = " + stock.getSymbol());
				System.out.println("name = " + stock.getName());
				System.out.println("Type = " + stock.getType());
				*/
				
				/* Retrieve stock details information from IEX */
				StockDetails stockDetails = stockDetailsService.getIEXStockDetails(stock.getSymbol());
				
				/*
				System.out.println("symbol = " + stockDetails.getSymbol());
				System.out.println("price = " + stockDetails.getPrice());
				System.out.println("volume = " + stockDetails.getVolume());
				System.out.println("float = " + stockDetails.getFloatshares());
				System.out.println("shares OS = " + stockDetails.getSharesoutstanding());
				System.out.println("shares short = " + stockDetails.getSharesshort());
				System.out.println("short ratio = " + stockDetails. getShortratio());
				System.out.println("EPR MRQ = " + stockDetails. getEpsmrq());
				System.out.println("EPS TTM = " + stockDetails. getEpsttm());
				System.out.println("resistance = " + stockDetails.getResistance());
				System.out.println("support = " + stockDetails.getSupport());
				System.out.println("Inst. pct = " + stockDetails.getInstitutionpct()); 
				System.out.println("50 DMA " + stockDetails.getMovingAvg50Day()); 
				System.out.println("200 DMA " + stockDetails.getMovingAvg200Day()); 
				System.out.println("5 day pct change = " + stockDetails.getPctchange5day()); 
				System.out.println("1 mon pct change = " + stockDetails.getPctchange1month());
				System.out.println("3 mon pct change = " + stockDetails.getPctchange3month());
				System.out.println("6 mon pct change = " + stockDetails.getPctchange6month());
				System.out.println("1 yr pct change = " + stockDetails.getPctchange1year());
				System.out.println("2 yr pct change = " + stockDetails.getPctchange2year());
				System.out.println("5 yr pct change = " + stockDetails.getPctchange5year());
				System.out.println("ytd pct change = " + stockDetails.getYtdpctchange());
				System.out.println("52 week low = " + stockDetails.getLow52week());
				System.out.println("52 week high = " + stockDetails.getHigh52week());
				System.out.println("earnings date = " + stockDetails.getEarningsdate());
				System.out.println("lastupdatedate = " + stockDetails.getLastupdatedate());
				*/
				stockDetails.setLastupdatedate(MiscFunctions.getCurrentDateTime());
				stockDetailsService.updateStockDetails(stockDetails);
				
				stockDetailsService.setSymbol(stock.getSymbol());
				stockDetailsService.setApiKey(alphaAPIKey);
				stockDetailsService.setFunction("SMA");
				stockDetailsService.setInterval("daily");
				stockDetailsService.setPeriod(20);

				/*Get moving average data from Alpha Vantage. Only SMA for now */
				MovingAverageDAO [] movingAverage = stockDetailsService.getMovingAverageData();
				for (int i = 0; i < movingAverage.length; i++)
				{
					/*load moving average data into the database*/
					stockDetailsService.addMovingAverageData(movingAverage[i]);
				}
				
				/*Get historical price data from Alpha Vantage*/
				stockDetailsService.setFunction("TIME_SERIES_DAILY");
				HistPriceDAO [] histPrice = stockDetailsService.getHistoricalPrices();
				for (int i = 0; i< histPrice.length; i++)
				{
					/*load historical price data in the database*/
					stockDetailsService.addHistoricalPriceData(histPrice[i]);
				}
			}
		}
		catch(Exception e)
		{
			logger.info("<<<<< StockDetailsController::retrieveOptionalbleSymbols : An error occurred inserting a record in the database");
			e.printStackTrace();
		}
		
		logger.info("<<<<< StockDetailsController::retrieveOptionalbleSymbols");
	}
}