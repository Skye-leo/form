package com.ssll.bizs;
import com.ssll.model.*;
import java.util.List;
import java.util.Map;
public interface IAllformBiz{
	/**
	 * 
	 * @param map需包含form_name 数据表拼音缩写,name_paraphrase form_name的注释名称
	 * @return 返回新纪录的主键id
	 */
	public void addAllform(Allform bean);
	public boolean removeAllform(int id);
	public boolean modifyAllform(Allform allform);
	public Allform getAllform(int id);
	public List<Allform> findAllform();
	public String selectformNamebyid(int id);
}