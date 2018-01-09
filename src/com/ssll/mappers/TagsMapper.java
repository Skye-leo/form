package com.ssll.mappers;
import java.util.List;
import com.ssll.model.*;
public interface TagsMapper{
	public Tags selectOne(int id);
	public List<Tags> select();
}