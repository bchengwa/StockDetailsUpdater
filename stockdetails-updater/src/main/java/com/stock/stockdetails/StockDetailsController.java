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
import com.stock.macd.MACD_DAO;
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
		logger.info(">>> BEGIN >>> StockDetailsController::retrieveOptionalbleSymbols");

		/*Get an array of stock symbols from the database. Than loop
		 * through each and get the stock details from IEX*/
		
		try
		{
			/* Get all optionable stocks from the database. Then loop through and fetch each stock */
			for (Stock stock : stockDetailsService.getOptionableStocks("Y"))
			{
				logger.debug("Symbol = " + stock.getSymbol());
				logger.debug("name = " + stock.getName());
				
				/* Retrieve stock details information from IEX */
				StockDetails stockDetails = stockDetailsService.getIEXStockDetails(stock.getSymbol());
				stockDetails.setLastupdatedate(MiscFunctions.getCurrentDateTime());
				
				logger.debug("symbol = " + stockDetails.getSymbol());
				logger.debug("price = " + stockDetails.getPrice());
				logger.debug("volume = " + stockDetails.getVolume());
				logger.debug("float = " + stockDetails.getFloatshares());
				logger.debug("shares OS = " + stockDetails.getSharesoutstanding());
				logger.debug("shares short = " + stockDetails.getSharesshort());
				logger.debug("short ratio = " + stockDetails. getShortratio());
				logger.debug("EPR MRQ = " + stockDetails. getEpsmrq());
				logger.debug("EPS TTM = " + stockDetails. getEpsttm());
				logger.debug("resistance = " + stockDetails.getResistance());
				logger.debug("support = " + stockDetails.getSupport());
				logger.debug("Inst. pct = " + stockDetails.getInstitutionpct()); 
				logger.debug("50 DMA " + stockDetails.getMovingAvg50Day()); 
				logger.debug("200 DMA " + stockDetails.getMovingAvg200Day()); 
				logger.debug("5 day pct change = " + stockDetails.getPctchange5day()); 
				logger.debug("1 mon pct change = " + stockDetails.getPctchange1month());
				logger.debug("3 mon pct change = " + stockDetails.getPctchange3month());
				logger.debug("6 mon pct change = " + stockDetails.getPctchange6month());
				logger.debug("1 yr pct change = " + stockDetails.getPctchange1year());
				logger.debug("2 yr pct change = " + stockDetails.getPctchange2year());
				logger.debug("5 yr pct change = " + stockDetails.getPctchange5year());
				logger.debug("ytd pct change = " + stockDetails.getYtdpctchange());
				logger.debug("52 week low = " + stockDetails.getLow52week());
				logger.debug("52 week high = " + stockDetails.getHigh52week());
				logger.debug("earnings date = " + stockDetails.getEarningsdate().toString());
				logger.debug("lastupdatedate = " + stockDetails.getLastupdatedate().toString());
				
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
				
				/*Get MACD data from Alpha Vantage*/
				stockDetailsService.setFunction("MACD");
				stockDetailsService.setInterval("daily");
				stockDetailsService.setSeriesType("close");

				MACD_DAO [] macdData = stockDetailsService.getMACD_Data();
				for (int i = 0; i < macdData.length; i++)
				{
					/*load the MACD data into the database*/
					stockDetailsService.addMACD_Data(macdData[i]);
				}
			}
		}
		catch(Exception e)
		{
			logger.info("<<< END <<< StockDetailsController::retrieveOptionalbleSymbols : An error occurred inserting a record in the database");
			e.printStackTrace();
		}
		
		logger.info("<<< END <<< StockDetailsController::retrieveOptionalbleSymbols");
	}
}