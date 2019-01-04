package com.stock.stochastic;

import org.springframework.data.jpa.repository.JpaRepository;

/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This interface will inherit JpaRepository and allow use of save method in
* 				  the service class insert/update the stochastic table.
*/
public interface SlowStochRepositoryInterface extends JpaRepository<SlowStochDAO, String>
{
}
