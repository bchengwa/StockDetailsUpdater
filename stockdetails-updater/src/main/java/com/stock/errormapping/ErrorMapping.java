/*
* Author		: Beltus Ambe
* Date			: Jan. 5th 2019
* Description	: This class captures error messages returned from Alpha Vantage. Sample format shown below.
*     				"Note": "Thank you for using Alpha Vantage! Our standard API call frequency is 5 calls
*     				per minute and 500 calls per day. Please visit https://www.alphavantage.co/premium/ if
*     				you would like to target a higher API call frequency."
*/

package com.stock.errormapping;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMapping
{
	@JsonProperty("Note")
	private String errorMessage;

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage()
	{
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}