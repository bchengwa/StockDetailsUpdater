/*
 * MovingAverageJSON class splits the AlphaVantage moving averages JSON message into two
 * separate classes; MetaData and MAData. These two classes will then be combined in the
 * StockDetailsService class to get the MovingAverageDAO JPA entity. A map is used for
 * the Technical Analysis section because a List is not possible.
 * "Meta Data": {
        "1: Symbol": "MSFT",
        "2: Indicator": "Exponential Moving Average (SMA)",
        "3: Last Refreshed": "2018-12-10 12:27:06",
        "4: Interval": "weekly",
        "5: Time Period": 10,
        "6: Series Type": "open",
        "7: Time Zone": "US/Eastern"
    },
    "Technical Analysis: SMA": {
        "2018-12-10 12:27:06": {
            "SMA": "108.3027"
        },
        "2018-12-07": {
            "SMA": "109.0810"
        },
        "2018-11-30": {
            "SMA": "108.2101"
        },
        ,
        "2018-10-05": {
            "SMA": "110.1591"
        },
        "2018-09-28": {
            "SMA": "109.1389"
        }}
 */

package com.stock.movingaverage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MovingAverageJSON implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonProperty("Meta Data")
	private MetaData metadata;

	@JsonProperty("Technical Analysis: SMA")
	private LinkedHashMap<String, MAData> movingAverageDate = new LinkedHashMap<String, MAData>();

	/**
	 * @return the metadata
	 */
	public MetaData getMetadata()
	{
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(MetaData metadata)
	{
		this.metadata = metadata;
	}

	/**
	 * @return the movingAverageDate
	 */
	public LinkedHashMap<String, MAData> getMovingAverageDate()
	{
		return movingAverageDate;
	}

	/**
	 * @param movingAverageDate the movingAverageDate to set
	 */
	public void setMovingAverageDate(LinkedHashMap<String, MAData> movingAverageDate)
	{
		this.movingAverageDate = movingAverageDate;
	}
	
}
