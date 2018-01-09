package com.ssll.bizs;
import com.ssll.model.*;
import com.ssll.mappers.*;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class FormsBiz implements IFormsBiz{
	@Resource
	private FormsMapper mapper;
	@Override
	public boolean addForms(Forms bean) {
		
		mapper.insert(bean);
		return true;

	}
	@Override
	public boolean removeForms(int id) {
		
		mapper.delete(id);
	
		return true;

	}
	@Override
	public boolean modifyForms(Forms bean) {
		
		mapper.update(bean);
		
		return true;
		
	}
	@Override
	public Forms getForms(int id) {
		
		Forms bean = null;
		bean = mapper.selectOne(id);
		return bean;
	
	}
	@Override
	public List<Forms> findForms() {
	
		List<Forms> beans = null;
		beans = mapper.select();
		return beans;
	
	}
}
