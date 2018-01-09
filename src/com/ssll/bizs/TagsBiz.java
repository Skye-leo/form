package com.ssll.bizs;
import com.ssll.model.*;
import com.ssll.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class TagsBiz implements ITagsBiz{
	
	@Resource
	private TagsMapper mapper;
	
	@Override
	public Tags getTags(int id) {
		Tags bean = null;
		
		bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<Tags> findTags() {
		List<Tags> beans = null;
		
		beans = mapper.select();
		
		return beans;
	}
}
