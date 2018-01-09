package com.ssll.mappers;
import java.util.List;
import com.ssll.model.*;
public interface FormsMapper{
	public void insert(Forms bean);
	public Forms selectOne(int id);
	public void delete(int id);
	public List<Forms> select();
	public void update(Forms bean);
}