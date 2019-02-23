package com.stock.historicalprices;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

 /*Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This class maps the historical prices table
*/

@Entity
@Table(name = "historicalprices", schema = "main_db")
@IdClass(value = HistPriceId.class)
public class HistPriceDAO
{
	@Id
	@Column(name = "symbol")
	private String symbol;
	
	@Id
	@Column(name = "closingdate")
	private Date closingDate;
	
	@Column(name = "closingprice")
	private double closingPrice;
	
	@Column(name = "openingprice")
	private double openingPrice;
	
	@Column(name = "highprice")
	private double highPrice;
	
	@Column(name = "lowprice")
	private double lowPrice;
	
	@Column(name = "volume")
	private long volume;
	
	@Column (name = "lastupdatedate")
	private Date lastupdatedate;

	public HistPriceDAO()
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
	 * @return the closingDate
	 */
	public Date getClosingDate()
	{
		return closingDate;
	}

	/**
	 * @param closingDate the closingDate to set
	 */
	public void setClosingDate(Date closingDate)
	{
		this.closingDate = closingDate;
	}

	/**
	 * @return the closingPrice
	 */
	public double getClosingPrice()
	{
		return closingPrice;
	}

	/**
	 * @param closingPrice the closingPrice to set
	 */
	public void setClosingPrice(double closingPrice)
	{
		this.closingPrice = closingPrice;
	}

	/**
	 * @return the openingPrice
	 */
	public double getOpeningPrice()
	{
		return openingPrice;
	}

	/**
	 * @param openingPrice the openingPrice to set
	 */
	public void setOpeningPrice(double openingPrice)
	{
		this.openingPrice = openingPrice;
	}

	/**
	 * @return the highPrice
	 */
	public double getHighPrice()
	{
		return highPrice;
	}

	/**
	 * @param highPrice the highPrice to set
	 */
	public void setHighPrice(double highPrice)
	{
		this.highPrice = highPrice;
	}

	/**
	 * @return the lowPrice
	 */
	public double getLowPrice()
	{
		return lowPrice;
	}

	/**
	 * @param lowPrice the lowPrice to set
	 */
	public void setLowPrice(double lowPrice)
	{
		this.lowPrice = lowPrice;
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
}
