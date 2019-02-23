
 /*Author		: Beltus Ambe
* Date			: Dec. 30th 2018
* Description	: This class maps the stochastic table. It used an ID class because of composite primary keys.
*/

package com.stock.stochastic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "stochastic", schema = "main_db")
@IdClass(value = SlowStochId.class)
public class SlowStochDAO
{
	@Id
	@Column(name = "symbol")
	private String symbol;
	
	@Id
	@Column(name = "stochastictype")
	private String stochType;
	
	@Id
	@Column(name = "stochasticdate")
	private Date stochDate;
	
	@Column(name = "stochdvalue")
	private double stochDValue;
	
	@Column(name = "stochkvalue")
	private double stochKValue;
	
	@Column (name = "lastupdatedate")
	private Date lastupdatedate;

	public SlowStochDAO()
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
	 * @return the stochType
	 */
	public String getStochType()
	{
		return stochType;
	}

	/**
	 * @param stochType the stochType to set
	 */
	public void setStochType(String stochType)
	{
		this.stochType = stochType;
	}

	/**
	 * @return the stochDate
	 */
	public Date getStochDate()
	{
		return stochDate;
	}

	/**
	 * @param stochDate the stochDate to set
	 */
	public void setStochDate(Date stochDate)
	{
		this.stochDate = stochDate;
	}

	/**
	 * @return the stochDValue
	 */
	public double getStochDValue()
	{
		return stochDValue;
	}

	/**
	 * @param stochDValue the stochDValue to set
	 */
	public void setStochDValue(double stochDValue)
	{
		this.stochDValue = stochDValue;
	}

	/**
	 * @return the stochKValue
	 */
	public double getStochKValue()
	{
		return stochKValue;
	}

	/**
	 * @param stochKValue the stochKValue to set
	 */
	public void setStochKValue(double stochKValue)
	{
		this.stochKValue = stochKValue;
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
