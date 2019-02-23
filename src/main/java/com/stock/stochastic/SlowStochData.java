/*Author		: Beltus Ambe
 * Date			: Dec. 30th 2018
 * Description	: This class extracts the date and slow stochastic data. The Service class will use this to create
 * a LinkedHashMap key/value pair to update the stochastic table. Below is a sample mapping.
 * "2018-12-31": {
            "SlowK": "76.9820",
            "SlowD": "60.5468"
        },
        "2018-12-28": {
            "SlowK": "63.9901",
            "SlowD": "41.5995"
        },
        "2018-12-27": {
            "SlowK": "40.6683",
            "SlowD": "24.2013"
        }
 */

package com.stock.stochastic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlowStochData
{
	@JsonProperty("SlowK")
	private double slowKValue;
	
	@JsonProperty("SlowD")
	private double slowDValue;

	/**
	 * @return the slowKValue
	 */
	public double getSlowKValue()
	{
		return slowKValue;
	}

	/**
	 * @param slowKValue the slowKValue to set
	 */
	public void setSlowKValue(double slowKValue)
	{
		this.slowKValue = slowKValue;
	}

	/**
	 * @return the slowDValue
	 */
	public double getSlowDValue()
	{
		return slowDValue;
	}

	/**
	 * @param slowDValue the slowDValue to set
	 */
	public void setSlowDValue(double slowDValue)
	{
		this.slowDValue = slowDValue;
	}

}
