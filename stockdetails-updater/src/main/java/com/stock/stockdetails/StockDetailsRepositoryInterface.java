/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This interface will inherit JpaRepository and allow use of save method in
* 				  the service class insert/update the StockDetails table.
*/

package com.stock.stockdetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDetailsRepositoryInterface extends JpaRepository<StockDetails, String>
{
}