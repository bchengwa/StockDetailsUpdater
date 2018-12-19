/* Author		: Beltus Ambe
 * Date			: Dec. 17th 2018
 * Description	: This class maps the "Meta Data" section of the moving average JSON data returned by
 * 				  the Alpha Vantage webservice. It will be used in conjunction with the MAData class
 * 				  to form the database message that is mapped in the MovingAverageDAO service request
 * 				  to update moving average information. Below is a sample of the complete message.
 * 				  "Meta Data": {
        		  "1: Symbol": "GOOG",
        	  	  "2: Indicator": "Simple Moving Average (SMA)",
        		  "3: Last Refreshed": "2018-12-19 10:58:40",
        		  "4: Interval": "daily",
        		  "5: Time Period": 20,
        		  "6: Series Type": "open",
        		  "7: Time Zone": "US/Eastern"
    			  },
    			  "Technical Analysis: SMA": {
        		  "2018-12-19 10:58:40": {
            			"SMA": "1052.7865"
        		  },
        		  "2018-12-18": {
            			"SMA": "1053.9470"
        		  },
        		  "2018-12-17": {
            			"SMA": "1055.6130"
        		  },
        		  "2018-12-14": {
            			"SMA": "1055.9730"
        		  },
        		  "2018-12-13": {
            			"SMA": "1055.9740"
        		  },
        		  "2018-12-12": {
            			"SMA": "1054.7350"
          		  },
        		  "2018-12-11": {
            			"SMA": "1054.4045"
        		  }
        		  }
 */

package com.stock.movingaverage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData
{	
	@JsonProperty("1: Symbol")
	private String symbol;

	@JsonProperty("2: Indicator")
	private String averageType;

	@JsonProperty("4: Interval")
	private String interval;
	
	@JsonProperty("5: Time Period")
	private String timePeriod;
	
	/**
	 * @return the symbol
	 */
	public String getSymbol()
	{
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol)
	{
		this.symbol = symbol;
	}

	/**
	 * @return the interval
	 */
	public String getInterval()
	{
		return interval;
	}

	/**
	 * @param interval the interval to set
	 */
	public void setInterval(String interval)
	{
		this.interval = interval.toUpperCase();
	}

	/**
	 * @return the timePeriod
	 */
	public String getTimePeriod()
	{
		return timePeriod;
	}

	/**
	 * @param timePeriod the timePeriod to set
	 */
	public void setTimePeriod(String timePeriod)
	{
		this.timePeriod = timePeriod;
	}

	/**
	 * @return the averageType
	 */
	public String getAverageType()
	{
		return averageType;
	}

	/**
	 * @param averageType the averageType to set
	 */
	public void setAverageType(String averageType)
	{
		this.averageType = averageType.substring(averageType.indexOf("(") + 1, averageType.indexOf(")"));
	}
}
