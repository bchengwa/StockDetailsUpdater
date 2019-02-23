/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This interface will return a list of stocks from Stock table with
* 				  OptionsOffered column value of "Y". The main goal of this stock
* 				  screener is to find opportunities in stock options trading.
*/

package com.stock.stockdetails;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepositoryInterface extends JpaRepository<Stock, String>
{
	List<Stock> findByOptionsoffered(String optionsoffered);
}