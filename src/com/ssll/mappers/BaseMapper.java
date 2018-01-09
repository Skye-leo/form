package com.ssll.mappers;

import java.util.Map;

import com.ssll.model.Allform;

public interface BaseMapper {
	public void insertAllform(Allform allform);
	public void createSpecificTable(String tableName);
	public void createFields(Map map);
	public void insertdata(String sql);
}
