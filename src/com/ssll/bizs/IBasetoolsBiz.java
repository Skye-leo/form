/**
 * 
 */
package com.ssll.bizs;

import java.util.Map;

import com.ssll.model.Allform;

/**
 * @author LLZG
 *
 */
public interface IBasetoolsBiz {
	public void createSpecificTable(String tableName);
	public void insertAllform(Allform bean);
	/**
	 * 
	 * @param map -- tableName \ columnName \ dataType \ note
	 */
	public void createFields(String tableName,String columnName,String dataType,String note);
	public void insertdata(String sql);
}
