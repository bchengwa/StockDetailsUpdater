/*
* Author		: Beltus Ambe
* Date			: Dec. 17th 2018
* Description	: This interface will inherit JpaRepository and allow use of save method in
* 				  the service class insert/update the MovingAverage table.
*/

package com.stock.movingaverage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovingAverageRepositoryInterface extends JpaRepository<MovingAverageDAO, String>
{

}
