/* Author		: Beltus Ambe
 * Date			: Jan. 6th 2019
 * Description	: This class contains all the data that will be read at application startup. URLs, constants, etc
*/

package com.stock.params;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stockparams", schema = "main_db")
public class StockParams
{
	@Id
	@Column(name = "parametername")
	private String parameterName;
	
	@Column(name = "parametervalue")
	private String parameterValue;

	/**
	 * @return the parameterName
	 */
	public String getParameterName()
	{
		return parameterName;
	}

	/**
	 * @param parameterName the parameterName to set
	 */
	public void setParameterName(String parameterName)
	{
		this.parameterName = parameterName;
	}

	/**
	 * @return the parameterValue
	 */
	public String getParameterValue()
	{
		return parameterValue;
	}

	/**
	 * @param parameterValue the parameterValue to set
	 */
	public void setParameterValue(String parameterValue)
	{
		this.parameterValue = parameterValue;
	}
	
}
