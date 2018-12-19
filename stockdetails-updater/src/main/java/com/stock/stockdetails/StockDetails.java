
/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This class is a straightforward mapping if IEX data to StockDetails table.
* 
*/

package com.stock.stockdetails;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table (name = "StockDetails", schema = "main_db")

public class StockDetails
{
	@Id
	@Column (name = "symbol")
	@JsonProperty("symbol")		//key stats
	private String symbol;
	
	@Column (name = "price")
	@JsonProperty("close")	//Quote
	private double price;
	
	@Column (name = "volume")
	@JsonProperty("latestVolume")	//Quote
	private long volume;
	
	@Column (name = "sharesfloat")
	@JsonProperty("float")		//key stats
	private long floatshares;
	
	@Column (name = "sharesoutstanding")
	@JsonProperty("sharesOutstanding")		//key stats
	private long sharesoutstanding;
	
	@Column (name = "sharesshort")
	@JsonProperty("shortInterest")		//key stats
	private long sharesshort;
	
	@Column (name = "shortratio")
	@JsonProperty("shortRatio")		//key stats
	private double shortratio;
	
	@Column (name = "epsmrq")
	@JsonProperty("latestEPS")		//key stats
	private double epsmrq;
	
	@Column (name = "epsttm")
	@JsonProperty("ttmEPS")		//key stats
	private double epsttm;
	
	@Column (name = "resistance")
	@JsonProperty("resistance")
	private double resistance;
	
	@Column (name = "support")
	@JsonProperty("support")
	private double support;
	
	@Column (name = "institutionpct")
	@JsonProperty("institutionPercent")		//key stats
	private double institutionpct; 
	
	@Column (name = "50daymovingaverage")
	@JsonProperty("day50MovingAvg")		//key stats
	private double movingAvg50Day;
	
	@Column (name = "200daymovingaverage")
	@JsonProperty("day200MovingAvg")		//key stats
	private double movingAvg200Day;
	
	@Column (name = "5daypctchange")
	@JsonProperty("day5ChangePercent")		//key stats
	private double pctchange5day; 
	
	@Column (name = "1monthpctchange")
	@JsonProperty("month1ChangePercent")		//key stats
	private double pctchange1month;
	
	@Column (name = "3monthpctchange")
	@JsonProperty("month3ChangePercent")		//key stats
	private double pctchange3month;
	
	@Column (name = "6monthpctchange")
	@JsonProperty("month6ChangePercent")		//key stats
	private double pctchange6month;
	
	@Column (name = "1yearpctchange")
	@JsonProperty("year1ChangePercent")		//key stats
	private double pctchange1year;
	
	@Column (name = "2yearpctchange")
	@JsonProperty("year2ChangePercent")		//key stats
	private double pctchange2year;
	
	@Column (name = "5yearpctchange")
	@JsonProperty("year5ChangePercent")		//key stats
	private double pctchange5year;
	
	@Column (name = "ytdpctchange")
	@JsonProperty("ytdChangePercent")		//key stats
	private double ytdpctchange;
	
	@Column (name = "52weeklow")
	@JsonProperty("week52low")		//key stats
	private double low52week;
	
	@Column (name = "52weekhigh")
	@JsonProperty("week52high")		//key stats
	private double high52week;
	
	@Column (name = "earningsdate")
	@JsonProperty("latestEPSDate")		//key stats
	private Date earningsdate;
	
	@Column (name = "lastupdatedate")
	private Date lastupdatedate;
		
	public StockDetails()
	{
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol()
	{
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * @return the volume
	 */
	public long getVolume()
	{
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(long volume)
	{
		this.volume = volume;
	}

	/**
	 * @return the floatshares
	 */
	public long getFloatshares()
	{
		return floatshares;
	}

	/**
	 * @param floatshares the floatshares to set
	 */
	public void setFloatshares(long floatshares)
	{
		this.floatshares = floatshares;
	}

	/**
	 * @return the sharesoutstanding
	 */
	public long getSharesoutstanding()
	{
		return sharesoutstanding;
	}

	/**
	 * @param sharesoutstanding the sharesoutstanding to set
	 */
	public void setSharesoutstanding(long sharesoutstanding)
	{
		this.sharesoutstanding = sharesoutstanding;
	}

	/**
	 * @return the shoaresshort
	 */
	public long getSharesshort()
	{
		return sharesshort;
	}

	/**
	 * @param shoaresshort the shoaresshort to set
	 */
	public void setSharesshort(long shoaresshort)
	{
		this.sharesshort = shoaresshort;
	}

	/**
	 * @return the shortratio
	 */
	public double getShortratio()
	{
		return shortratio;
	}

	/**
	 * @param shortratio the shortratio to set
	 */
	public void setShortratio(double shortratio)
	{
		this.shortratio = Double.valueOf(String.format("%2f", shortratio));
	}

	/**
	 * @return the epsmrq
	 */
	public double getEpsmrq()
	{
		return epsmrq;
	}

	/**
	 * @param epsmrq the epsmrq to set
	 */
	public void setEpsmrq(double epsmrq)
	{
		this.epsmrq = Double.valueOf(String.format("%2f", epsmrq));
	}

	/**
	 * @return the epsttm
	 */
	public double getEpsttm()
	{
		return epsttm;
	}

	/**
	 * @param epsttm the epsttm to set
	 */
	public void setEpsttm(double epsttm)
	{
		this.epsttm = Double.valueOf(String.format("%2f", epsttm));
	}

	/**
	 * @return the resistance
	 */
	public double getResistance()
	{
		return resistance;
	}

	/**
	 * @param resistance the resistance to set
	 */
	public void setResistance(double resistance)
	{
		this.resistance = Double.valueOf(String.format("%2f", resistance));
	}

	/**
	 * @return the support
	 */
	public double getSupport()
	{
		return support;
	}

	/**
	 * @param support the support to set
	 */
	public void setSupport(double support)
	{
		this.support = Double.valueOf(String.format("%2f", support));;
	}

	/**
	 * @return the institutionpct
	 */
	public double getInstitutionpct()
	{
		return institutionpct;
	}

	/**
	 * @param institutionpct the institutionpct to set
	 */
	public void setInstitutionpct(double institutionpct)
	{
		this.institutionpct = Double.valueOf(String.format("%2f", institutionpct));
	}

	/**
	 * @return the movingAvg50Day
	 */
	public double getMovingAvg50Day()
	{
		return movingAvg50Day;
	}

	/**
	 * @param movingAvg50Day the movingAvg50Day to set
	 */
	public void setMovingAvg50Day(double movingAvg50Day)
	{
		this.movingAvg50Day = Double.valueOf(String.format("%2f", movingAvg50Day));
	}

	/**
	 * @return the movingAvg200Day
	 */
	public double getMovingAvg200Day()
	{
		return movingAvg200Day;
	}

	/**
	 * @param movingAvg200Day the movingAvg200Day to set
	 */
	public void setMovingAvg200Day(double movingAvg200Day)
	{
		this.movingAvg200Day = Double.valueOf(String.format("%2f", movingAvg200Day));
	}

	/**
	 * @return the pctchange5day
	 */
	public double getPctchange5day()
	{
		return pctchange5day;
	}

	/**
	 * @param pctchange5day the pctchange5day to set
	 */
	public void setPctchange5day(double pctchange5day)
	{
		this.pctchange5day = Double.valueOf(String.format("%2f", pctchange5day));
	}

	/**
	 * @return the pctchange1month
	 */
	public double getPctchange1month()
	{
		return pctchange1month;
	}

	/**
	 * @param pctchange1month the pctchange1month to set
	 */
	public void setPctchange1month(double pctchange1month)
	{
		this.pctchange1month = Double.valueOf(String.format("%2f", pctchange1month));
	}

	/**
	 * @return the pctchange3month
	 */
	public double getPctchange3month()
	{
		return pctchange3month;
	}

	/**
	 * @param pctchange3month the pctchange3month to set
	 */
	public void setPctchange3month(double pctchange3month)
	{
		this.pctchange3month = Double.valueOf(String.format("%2f", pctchange3month));
	}

	/**
	 * @return the pctchange6month
	 */
	public double getPctchange6month()
	{
		return pctchange6month;
	}

	/**
	 * @param pctchange6month the pctchange6month to set
	 */
	public void setPctchange6month(double pctchange6month)
	{
		this.pctchange6month = Double.valueOf(String.format("%2f", pctchange6month));
	}

	/**
	 * @return the pctchange1year
	 */
	public double getPctchange1year()
	{
		return pctchange1year;
	}

	/**
	 * @param pctchange1year the pctchange1year to set
	 */
	public void setPctchange1year(double pctchange1year)
	{
		this.pctchange1year = Double.valueOf(String.format("%2f", pctchange1year));
	}

	/**
	 * @return the pctchange2year
	 */
	public double getPctchange2year()
	{
		return pctchange2year;
	}

	/**
	 * @param pctchange2year the pctchange2year to set
	 */
	public void setPctchange2year(double pctchange2year)
	{
		this.pctchange2year = Double.valueOf(String.format("%2f", pctchange2year));
	}

	/**
	 * @return the pctchange5year
	 */
	public double getPctchange5year()
	{
		return pctchange5year;
	}

	/**
	 * @param pctchange5year the pctchange5year to set
	 */
	public void setPctchange5year(double pctchange5year)
	{
		this.pctchange5year = Double.valueOf(String.format("%2f", pctchange5year));
	}

	/**
	 * @return the ytdpctchange
	 */
	public double getYtdpctchange()
	{
		return ytdpctchange;
	}

	/**
	 * @param ytdpctchange the ytdpctchange to set
	 */
	public void setYtdpctchange(double ytdpctchange)
	{
		this.ytdpctchange = Double.valueOf(String.format("%2f", ytdpctchange));
	}

	/**
	 * @return the low52week
	 */
	public double getLow52week()
	{
		return low52week;
	}

	/**
	 * @param low52week the low52week to set
	 */
	public void setLow52week(double low52week)
	{
		this.low52week = Double.valueOf(String.format("%2f", low52week));
	}

	/**
	 * @return the high52week
	 */
	public double getHigh52week()
	{
		return high52week;
	}

	/**
	 * @param high52week the high52week to set
	 */
	public void setHigh52week(double high52week)
	{
		this.high52week = Double.valueOf(String.format("%2f", high52week));
	}

	/**
	 * @return the earningsdate
	 */
	public Date getEarningsdate()
	{
		return earningsdate;
	}

	/**
	 * @param earningsdate the earningsdate to set
	 */
	public void setEarningsdate(Date earningsdate)
	{
		this.earningsdate = earningsdate;
	}

	/**
	 * @return the lastupdatedate
	 */
	public Date getLastupdatedate()
	{
		return lastupdatedate;
	}

	/**
	 * @param lastupdatedate the lastupdatedate to set
	 */
	public void setLastupdatedate(Date lastupdatedate)
	{
		this.lastupdatedate = lastupdatedate;
	}
	
	public void setCurrentDate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/DD/YYYY HH:MI:SS");
		LocalDateTime currentDate = LocalDateTime.now();
		//String currentDateStr = dtf.format(currentDate);
		System.out.println("Date = " + dtf.format(currentDate));
	}
}
