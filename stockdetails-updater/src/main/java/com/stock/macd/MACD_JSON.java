
 /*Author		: Beltus Ambe
 * Date			: Dec. 30th 2018
 * Description	: This class provides MACD data for a stock. For now, only the closing price will be used
 * for MACD calculation. A map is used to determine that price as the structure is key value based.
 * Only Technical Analysis data is being extracted.
 * 
 * "Meta Data": {
        "1: Symbol": "MSFT",
        "2: Indicator": "Moving Average Convergence/Divergence (MACD)",
        "3: Last Refreshed": "2018-12-28",
        "4: Interval": "daily",
        "5.1: Fast Period": 12,
        "5.2: Slow Period": 26,
        "5.3: Signal Period": 9,
        "6: Series Type": "close",
        "7: Time Zone": "US/Eastern"
    },
    "Technical Analysis: MACD": {
        "2018-12-28": {
            "MACD_Hist": "-0.7848",
            "MACD": "-2.2688",
            "MACD_Signal": "-1.4840"
        },
        "2018-12-27": {
            "MACD_Hist": "-1.1379",
            "MACD": "-2.4257",
            "MACD_Signal": "-1.2878"
        },
        "2018-12-26": {
            "MACD_Hist": "-1.3033",
            "MACD": "-2.3066",
            "MACD_Signal": "-1.0033"
        },
        "2018-12-24": {
            "MACD_Hist": "-1.0200",
            "MACD": "-1.6974",
            "MACD_Signal": "-0.6775"
        },
        "2018-12-21": {
            "MACD_Hist": "-0.7314",
            "MACD": "-1.1539",
            "MACD_Signal": "-0.4225"
        }
 */

package com.stock.macd;

import java.util.LinkedHashMap;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MACD_JSON
{
	@JsonProperty("Technical Analysis: MACD")
	private LinkedHashMap<String, MACD_Data> macdDate = new LinkedHashMap<String, MACD_Data>();

	/**
	 * @return the macdDate
	 */
	public LinkedHashMap<String, MACD_Data> getMacdDate()
	{
		return macdDate;
	}

	/**
	 * @param macdDate the macdDate to set
	 */
	public void setMacdDate(LinkedHashMap<String, MACD_Data> macdDate)
	{
		this.macdDate = macdDate;
	}
}
