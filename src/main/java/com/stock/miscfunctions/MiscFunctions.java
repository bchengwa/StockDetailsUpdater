/* Author		: Beltus Ambe
 * Date			: Dec. 17th 2018
 * Description	: This class provides miscellaneous functions for translations and conversions.
 * 
 */

package com.stock.miscfunctions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MiscFunctions
{	
	public static Date getDateFromString(String date) throws ParseException
	{

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date stringDate = format.parse(date);
		return stringDate;
	}
	
	public static Date getCurrentDateTime() throws ParseException
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
		Date date = new Date();
		Date stringDate = dateFormat.parse(dateFormat.format(date));
		return stringDate;
	}
}
