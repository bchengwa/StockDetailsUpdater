/*Author		: Beltus Ambe
* Date			: Dec. 30th 2018
* Description	: ID class for the stochastic table. The instance variables must be
* 				  exactly the same as in the DAO class.
*/

package com.stock.stochastic;

import java.io.Serializable;
import java.util.Date;

public class SlowStochId implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String symbol;
	private String stochType;
	private Date stochDate;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stochDate == null) ? 0 : stochDate.hashCode());
		result = prime * result + ((stochType == null) ? 0 : stochType.hashCode());
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
		SlowStochId other = (SlowStochId) obj;
		if (stochDate == null)
		{
			if (other.stochDate != null)
				return false;
		} else if (!stochDate.equals(other.stochDate))
			return false;
		if (stochType == null)
		{
			if (other.stochType != null)
				return false;
		} else if (!stochType.equals(other.stochType))
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