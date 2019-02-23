package com.stock.historicalprices;

import java.io.Serializable;
import java.util.Date;

/*Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: ID class for historical prices table. The instance variables must be
* 				  exactly the same as in the DAO class.
*/

public class HistPriceId implements Serializable
{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private String symbol;
	private Date closingDate;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((closingDate == null) ? 0 : closingDate.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
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
		HistPriceId other = (HistPriceId) obj;
		if (closingDate == null)
		{
			if (other.closingDate != null)
				return false;
		} else if (!closingDate.equals(other.closingDate))
			return false;
		if (symbol == null)
		{
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
}
