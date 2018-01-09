package com.ssll.bizs;
import com.ssll.model.*;
import com.ssll.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class AllformBiz implements IAllformBiz{
	@Resource
	private AllformMapper mapper;
	@Resource
	private BaseMapper basemapper;
	
	@Override
	public void addAllform(Allform bean) {
		
		basemapper.insertAllform(bean);
		
	}
	@Override
	public boolean removeAllform(int id) {
		
			mapper.delete(id);
		
			return true;
		
	}
	@Override
	public boolean modifyAllform(Allform bean) {
		
			mapper.update(bean);
		
			return true;
		
	}
	@Override
	public Allform getAllform(int id) {
		
		Allform bean = null;
		
		bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<Allform> findAllform() {
		List<Allform> beans = null;
		
		beans = mapper.select();
		
		return beans;
	}
	@Override
	public String selectformNamebyid(int id) {
		
		String form_name = mapper.selectformNamebyid(id);
		
		return form_name;
		
	}
	
	
}
