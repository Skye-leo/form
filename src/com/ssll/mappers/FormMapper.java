package com.ssll.mappers;
import java.util.List;
import com.ssll.model.*;
public interface FormMapper{
	public void insert(Form bean);
	public Form selectOne(int id);
	public void delete(int id);
	public List<Form> select();
	public void update(Form bean);
	public List<Form> selectbyid(int form_id);
}