package com.stock.macd;

import org.springframework.data.jpa.repository.JpaRepository;

/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This interface will inherit JpaRepository and allow use of save method in
* 				  the service class insert/update the MACD table.
*/
public interface MACDRepositoryInterface extends JpaRepository<MACD_DAO, String>
{
}
