
 /*Author		: Beltus Ambe
* Date			: Dec. 30th 2018
* Description	: This class maps the MACD table. It used an ID class because of composite primary keys.
*/

package com.stock.macd;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "macd", schema = "main_db")
@IdClass(value = MACD_Id.class)
public class MACD_DAO
{
	@Id
	@Column(name = "symbol")
	private String symbol;
	
	@Id
	@Column(name = "macddate")
	private Date macdDate;
	
	@Column(name = "macdHistogram")
	private double macdHistogram;
	
	@Column(name = "macdSignal")
	private double macdSignal;
	
	@Column(name = "macdvalue")
	private double macdValue;
	
	@Column (name = "lastupdatedate")
	private Date lastupdatedate;

	public MACD_DAO()
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
	 * @return the macdDate
	 */
	public Date getMacdDate()
	{
		return macdDate;
	}

	/**
	 * @param macdDate the macdDate to set
	 */
	public void setMacdDate(Date macdDate)
	{
		this.macdDate = macdDate;
	}

	/**
	 * @return the macdHistogram
	 */
	public double getMacdHistogram()
	{
		return macdHistogram;
	}

	/**
	 * @param macdHistogram the macdHistogram to set
	 */
	public void setMacdHistogram(double macdHistogram)
	{
		this.macdHistogram = macdHistogram;
	}

	/**
	 * @return the macdSignal
	 */
	public double getMacdSignal()
	{
		return macdSignal;
	}

	/**
	 * @param macdSignal the macdSignal to set
	 */
	public void setMacdSignal(double macdSignal)
	{
		this.macdSignal = macdSignal;
	}

	/**
	 * @return the macdValue
	 */
	public double getMacdValue()
	{
		return macdValue;
	}

	/**
	 * @param macdValue the macdValue to set
	 */
	public void setMacdValue(double macdValue)
	{
		this.macdValue = macdValue;
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
