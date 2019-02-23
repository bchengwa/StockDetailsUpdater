
 /*Author		: Beltus Ambe
 * Date			: Dec. 30th 2018
 * Description	: This class provides slow stochastic data for a stock. A map is used to
 * determine that price as the structure is key value based. Only Technical Analysis data
 * is being extracted. Below is a sample message.
 * 
 * "Meta Data": {
        "1: Symbol": "MSFT",
        "2: Indicator": "Stochastic (STOCH)",
        "3: Last Refreshed": "2018-12-31",
        "4: Interval": "daily",
        "5.1: FastK Period": 5,
        "5.2: SlowK Period": 3,
        "5.3: SlowK MA Type": 0,
        "5.4: SlowD Period": 3,
        "5.5: SlowD MA Type": 0,
        "6: Time Zone": "US/Eastern Time"
    },
    "Technical Analysis: STOCH": {
        "2018-12-31": {
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
        },
        "2018-12-26": {
            "SlowK": "20.1402",
            "SlowD": "17.1789"
        }
 */

package com.stock.stochastic;

import java.util.LinkedHashMap;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SlowStochJSON
{
	@JsonProperty("Technical Analysis: STOCH")
	private LinkedHashMap<String, SlowStochData> stochDate = new LinkedHashMap<String, SlowStochData>();

	/**
	 * @return the stochDate
	 */
	public LinkedHashMap<String, SlowStochData> getStochDate()
	{
		return stochDate;
	}

	/**
	 * @param macdDate the stochDate to set
	 */
	public void setStochDate(LinkedHashMap<String, SlowStochData> stochDate)
	{
		this.stochDate = stochDate;
	}
}
