/*Author		: Beltus Ambe
* Date			: Dec. 30th 2018
* Description	: ID class for MACD table. The instance variables must be
* 				  exactly the same as in the DAO class.
*/

package com.stock.macd;

import java.io.Serializable;
import java.util.Date;

public class MACD_Id implements Serializable
{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private String symbol;
	private Date macdDate;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((macdDate == null) ? 0 : macdDate.hashCode());
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
		MACD_Id other = (MACD_Id) obj;
		if (macdDate == null)
		{
			if (other.macdDate != null)
				return false;
		} else if (!macdDate.equals(other.macdDate))
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
