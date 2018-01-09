package com.ssll.bizs;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssll.mappers.BaseMapper;
import com.ssll.model.Allform;
@Service
public class BasetoolsBiz implements IBasetoolsBiz{
	@Resource
	private BaseMapper basemapper;
	@Override
	public void createSpecificTable(String tableName) {
		basemapper.createSpecificTable(tableName);
	}

	@Override
	public void insertAllform(Allform bean) {
		
		basemapper.insertAllform(bean);
		
	}

	public void createFields(Map map) {
		
		basemapper.createFields(map);
		
	}

	@Override
	public void createFields(String tableName, String columnName, String dataType, String note) {
		
		Map map = new HashMap();
		
		map.put("tableName",tableName);
		map.put("columnName",columnName);
		map.put("dataType",dataType);
		map.put("note",note);
		
		basemapper.createFields(map);
	}

	@Override
	public void insertdata(String sql) {
		
		basemapper.insertdata(sql);
		
	}

}
