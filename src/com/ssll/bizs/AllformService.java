package com.ssll.bizs;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssll.model.Allform;
import com.ssll.model.Forms;
import com.ssll.tools.TransportPinyin;

@Service
public class AllformService {
	
	@Resource
	private IFormsBiz formsBiz;
	@Resource
	private IAllformBiz allformBiz;
	@Resource
	private IBasetoolsBiz basetoolsBiz;
	
	@Transactional
	public boolean addForm(String form_name) throws Exception {
		//form_name 汉字表名  tableName 拼音缩写对应的数据库表名
		TransportPinyin pytool = new TransportPinyin();
		Forms forms = new Forms();
		forms.setForm_name(form_name);
		String tableName = pytool.pinyin(form_name);
		Allform allform = new Allform();
		allform.setForm_name(tableName);
		allform.setName_paraphrase(form_name);
		
		allformBiz.addAllform(allform); //向总表中加入增加表单的记录
		basetoolsBiz.createSpecificTable(tableName); //创建对应于表单的数据库表
		forms.setForm_id(allform.getId());   
		forms.setfields("allform_id,sole_id,writer_id");
		formsBiz.addForms(forms);   //增加前台表单的表单记录
		
		return true;
	}
}
