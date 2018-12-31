
/*
 * This class maps daily prices for a stock. For now, only the closing price will be used
 * for historical price calculation. A map is used to determine that price as the structure
 * is key value based. Only Time Series data is being extracted.
 * 
 * "Meta Data": {
        "1. Information": "Daily Prices (open, high, low, close) and Volumes",
        "2. Symbol": "MSFT",
        "3. Last Refreshed": "2018-12-14",
        "4. Output Size": "Compact",
        "5. Time Zone": "US/Eastern"
    },
    "Time Series (Daily)": {
        "2018-12-14": {
            "1. open": "108.2500",
            "2. high": "109.2600",
            "3. low": "105.5000",
            "4. close": "106.0300",
            "5. volume": "46959680"
        },
        "2018-12-13": {
            "1. open": "109.5800",
            "2. high": "110.8700",
            "3. low": "108.6300",
            "4. close": "109.4500",
            "5. volume": "31333362"
        },
        "2018-12-12": {
            "1. open": "110.8900",
            "2. high": "111.2700",
            "3. low": "109.0400",
            "4. close": "109.0800",
            "5. volume": "36183020"
        }
        }
 */

package com.stock.historicalprices;

import java.util.LinkedHashMap;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HistPriceJSON
{
	@JsonProperty("Time Series (Daily)")
	private LinkedHashMap<String, HistPriceData> histPriceDate = new LinkedHashMap<String, HistPriceData>();

	/**
	 * @return the histPriceDate
	 */
	public LinkedHashMap<String, HistPriceData> getHistPriceDate()
	{
		return histPriceDate;
	}

	/**
	 * @param histPriceDate the histPriceDate to set
	 */
	public void setHistPriceDate(LinkedHashMap<String, HistPriceData> histPriceDate)
	{
		this.histPriceDate = histPriceDate;
	}
}
