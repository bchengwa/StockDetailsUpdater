/* Author		: Beltus Ambe
 * Date			: Dec. 17th 2018
 * Description	: This JPA entity class is a combination of data from MetaData and MAData classes.
 * 				  It has 5 primary keys so needs to have logic for composite key mapping.
 */

package com.stock.movingaverage;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "movingaverage", schema = "main_db")

@IdClass(value = MovingAverageId.class)
public class MovingAverageDAO
{
	/**
	 * 
	 */
	
	@Id
	@Column(name = "symbol")
	private String symbol;
	
	@Id
	@Column(name = "timeinterval")
	private String interval;
	
	@Id
	@Column(name = "timeperiod")
	private int timePeriod;
	
	@Id
	@Column(name = "averagetype")
	private String averageType;
	
	@Id
	@Column(name = "movingaveragedate")
	private Date movingAverageDate;
	
	@Column(name = "movingaveragevalue")
	private double value;
	
	@Column(name = "lastupdatedate")
	private Date lastUpdateDate;

	public MovingAverageDAO()
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
	 * @return the interval
	 */
	public String getInterval()
	{
		return interval;
	}

	/**
	 * @param interval the interval to set
	 */
	public void setInterval(String interval)
	{
		this.interval = interval;
	}

	/**
	 * @return the timePeriod
	 */
	public int getTimePeriod()
	{
		return timePeriod;
	}

	/**
	 * @param timePeriod the timePeriod to set
	 */
	public void setTimePeriod(int timePeriod)
	{
		this.timePeriod = timePeriod;
	}

	/**
	 * @return the averageType
	 */
	public String getAverageType()
	{
		return averageType;
	}

	/**
	 * @param averageType the averageType to set
	 */
	public void setAverageType(String averageType)
	{
		this.averageType = averageType;
	}

	/**
	 * @return the movingAverageDate
	 */
	public Date getMovingAverageDate()
	{
		return movingAverageDate;
	}

	/**
	 * @param movingAverageDate the movingAverageDate to set
	 */
	public void setMovingAverageDate(Date movingAverageDate)
	{
		this.movingAverageDate = movingAverageDate;
	}

	/**
	 * @return the value
	 */
	public double getValue()
	{
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value)
	{
		this.value = value;
	}

	/**
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate()
	{
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate)
	{
		this.lastUpdateDate = lastUpdateDate;
	}
}
