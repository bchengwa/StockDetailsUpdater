/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This class maps the Stock table for retrieving of optionable stocks. 
* 				  Note : The stock table is manually populated because the data is relatively
* 				  static. It has a list of all stocks trading on major US exchanges and also
* 				  a column (optionsoffered) that indicates whether the security trades options or not
*/

package com.stock.stockdetails;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity	//Tells JPA to create a table with the columns below
@Table(name = "stock", schema = "main_db ")	//Tells JPA to perform data on the table "stock"

public class Stock
{
	@Id							//Tells JPA this is the primary key
	@NotBlank					//Tells JPA column cannot be blank
	@Column(name = "symbol")	//Tells JPA this is the column name
	private String symbol;
	
	@Column(name = "stockname")
	private String name;
	
	@Column(name = "sectorname")
	private String sectorname;
	
	@Column(name = "stocktype")
	private String type;
	
	@Column(name = "optionsoffered")
	private String optionsoffered;
	
	@Column(name = "lastupdatedate")
	private Date date;

	/* Define a no-argument constructor for Hibernate to create a bean */
	public Stock()
	{
	}
	
	public Stock(String symbol, String name, Date date, boolean isEnabled, String type, int iexId)
	{
		super();
		this.symbol = symbol;
		this.name = name;
		this.date = date;
		this.type = type;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol()
	{
		symbol.trim();
		return symbol.toUpperCase();
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol)
	{
		
		this.symbol = symbol;
	}

	/**
	 * @return the name
	 */
	
	public String getName()
	{
		name.trim();
		if (name.length() > 198)
			return name.substring(0, 198);
		return name;

	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the sectorname
	 */
	public String getSectorname()
	{
		return sectorname;
	}

	/**
	 * @param sectorname the sectorname to set
	 */
	public void setSectorname(String sectorname)
	{
		this.sectorname = sectorname;
	}

	/**
	 * @return the optionsoffered
	 */
	public String getOptionsoffered()
	{
		return optionsoffered;
	}

	/**
	 * @param optionsoffered the optionsoffered to set
	 */
	public void setOptionsoffered(String optionsoffered)
	{
		this.optionsoffered = optionsoffered;
	}

	/**
	 * @return the date
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		type.trim();
		return type.toUpperCase();
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}
}
