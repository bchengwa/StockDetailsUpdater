package com.stock.historicalprices;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * This class extracts the date and the historical price. The Service class will use this to create
 * a LinkedHashMap key/value pair to update the historical prices table. Below is a sample mapping.
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
	@JsonProperty("1. open")
	private double openPrice;
	
	@JsonProperty("2. high")
	private double highPrice;
	
	@JsonProperty("3. low")
	private double lowPrice;
	
	@JsonProperty("4. close")
	private double closingPrice;

	@JsonProperty("5. volume")
	private long volume;
	
	/**
	 * @return the openPrice
	 */
	public double getOpenPrice()
	{
		return openPrice;
	}

	/**
	 * @param openPrice the openPrice to set
	 */
	public void setOpenPrice(double openPrice)
	{
		this.openPrice = openPrice;
	}

	/**
	 * @return the highPrice
	 */
	public double getHighPrice()
	{
		return highPrice;
	}

	/**
	 * @param highPrice the highPrice to set
	 */
	public void setHighPrice(double highPrice)
	{
		this.highPrice = highPrice;
	}

	/**
	 * @return the lowPrice
	 */
	public double getLowPrice()
	{
		return lowPrice;
	}

	/**
	 * @param lowPrice the lowPrice to set
	 */
	public void setLowPrice(double lowPrice)
	{
		this.lowPrice = lowPrice;
	}

	/**
	 * @return the volume
	 */
	public long getVolume()
	{
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(long volume)
	{
		this.volume = volume;
	}

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
