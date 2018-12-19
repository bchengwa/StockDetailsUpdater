package com.stock.historicalprices;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * This class extracts the date and the historical price. The Service class will use this to create
 * a LinkedHashMap key/value pair to update the historicalprices table. Below is a sample mapping.
 * "2018-12-14": {
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
 */

public class HistPriceData
{
	@JsonProperty("4. close")
	private double closingPrice;

	/**
	 * @return the closingPrice
	 */
	public double getClosingPrice()
	{
		return closingPrice;
	}

	/**
	 * @param closingPrice the closingPrice to set
	 */
	public void setClosingPrice(double closingPrice)
	{
		this.closingPrice = closingPrice;
	}
}
