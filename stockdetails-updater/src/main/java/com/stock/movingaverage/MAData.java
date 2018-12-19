/* Author		: Beltus Ambe
 * Date			: Dec. 17th 2018
 * Description	: This class maps the "Technical Analysis: SMA" section of the moving average JSON data
 * 				  returned by the Alpha Vantage webservice. It will be used in conjunction with the MetaData
 * 				  class to form the database message that is mapped in the MovingAverageDAO service request
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MAData
{
	@JsonProperty("SMA")
	private double movingAverageValue;

	/**
	 * @return the movingAverageValue
	 */
	public double getMovingAverageValue()
	{
		return movingAverageValue;
	}

	/**
	 * @param movingAverageValue the movingAverageValue to set
	 */
	public void setMovingAverageValue(double movingAverageValue)
	{
		this.movingAverageValue = movingAverageValue;
	}
}
