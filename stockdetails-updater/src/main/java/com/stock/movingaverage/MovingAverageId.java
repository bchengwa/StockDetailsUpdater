/* Author		: Beltus Ambe
 * Date			: Dec. 17th 2018
 * Description	: This is the ID class for mapping the composite keys to MovingAverage table.
 */

package com.stock.movingaverage;

import java.io.Serializable;
import java.util.Date;

public class MovingAverageId implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String symbol;
	private String interval;
	private String timePeriod;
	private String averageType;
	private Date movingAverageDate;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((averageType == null) ? 0 : averageType.hashCode());
		result = prime * result + ((interval == null) ? 0 : interval.hashCode());
		result = prime * result + ((movingAverageDate == null) ? 0 : movingAverageDate.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((timePeriod == null) ? 0 : timePeriod.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovingAverageId other = (MovingAverageId) obj;
		if (averageType == null)
		{
			if (other.averageType != null)
				return false;
		} else if (!averageType.equals(other.averageType))
			return false;
		if (interval == null)
		{
			if (other.interval != null)
				return false;
		} else if (!interval.equals(other.interval))
			return false;
		if (movingAverageDate == null)
		{
			if (other.movingAverageDate != null)
				return false;
		} else if (!movingAverageDate.equals(other.movingAverageDate))
			return false;
		if (symbol == null)
		{
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (timePeriod == null)
		{
			if (other.timePeriod != null)
				return false;
		} else if (!timePeriod.equals(other.timePeriod))
			return false;
		return true;
	}
}
