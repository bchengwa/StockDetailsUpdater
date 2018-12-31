/*Author		: Beltus Ambe
 * Date			: Dec. 30th 2018
 * Description	: This class extracts the date and the MACD data. The Service class will use this to create
 * a LinkedHashMap key/value pair to update the MACD table. Below is a sample mapping.
 * "2018-12-28": {
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
        }
 */

package com.stock.macd;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MACD_Data
{
	@JsonProperty("MACD_Hist")
	private double macdHistogram;
	
	@JsonProperty("MACD_Signal")
	private double macdSignal;
	
	@JsonProperty("MACD")
	private double macdValue;

	/**
	 * @return the macdHist
	 */
	public double getMacdHistogram()
	{
		return macdHistogram;
	}

	/**
	 * @param macdHist the macdHist to set
	 */
	public void setMacdHistogram(double macdHist)
	{
		this.macdHistogram = macdHist;
	}

	/**
	 * @return the macdSignal
	 */
	public double getMacdSignal()
	{
		return macdSignal;
	}

	/**
	 * @param macdSignal the macdSignal to set
	 */
	public void setMacdSignal(double macdSignal)
	{
		this.macdSignal = macdSignal;
	}

	/**
	 * @return the macd
	 */
	public double getMacdValue()
	{
		return macdValue;
	}

	/**
	 * @param macd the macd to set
	 */
	public void setMacdValue(double macdValue)
	{
		this.macdValue = macdValue;
	}
}
