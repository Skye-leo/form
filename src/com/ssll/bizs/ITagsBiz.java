package com.ssll.bizs;
import com.ssll.model.*;
import java.util.List;
public interface ITagsBiz{
	public Tags getTags(int id);
	public List<Tags> findTags();
}