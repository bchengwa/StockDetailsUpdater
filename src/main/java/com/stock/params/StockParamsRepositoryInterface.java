/* Author		: Beltus Ambe
 * Date			: Jan. 7th 2019
 * Description	: This interface will return a list of all entries in the stock params table.
*/
package com.stock.params;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockParamsRepositoryInterface extends JpaRepository<StockParams, String>
{
	StockParams findByParameterName(String paramName);
}