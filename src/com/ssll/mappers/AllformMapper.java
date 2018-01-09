package com.ssll.mappers;
import java.util.List;
import com.ssll.model.*;
public interface AllformMapper{
	public void insert(Allform bean);
	public Allform selectOne(int id);
	public void delete(int id);
	public List<Allform> select();
	public void update(Allform bean);
	public String selectformNamebyid(int id);
}