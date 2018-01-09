package com.ssll.bizs;
import com.ssll.model.*;
import com.ssll.tools.TransportPinyin;
import com.alibaba.fastjson.JSON;
import com.ssll.mappers.*;

import java.io.UnsupportedEncodingException;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.stereotype.Service;
@Service
public class FormBiz implements IFormBiz{
	@Resource
	private FormMapper mapper;
	@Resource
	private IBasetoolsBiz BasetoolsBiz;
	@Resource
	private IAllformBiz AllformBiz;
	@Resource
	private IFormsBiz formsBiz;
	@Override
	public boolean addForm(Form bean) {
		
			mapper.insert(bean);
		
			return true;
		
	}
	@Override
	public boolean removeForm(int id) {
		
			mapper.delete(id);
		
			return true;
		
	}
	@Override
	public boolean modifyForm(Form bean) {
		
			mapper.update(bean);
		
			return true;
		
	}
	@Override
	public Form getForm(int id) {
		Form bean = null;
		
		bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<Form> findForm() {
		List<Form> beans = null;
		
		beans = mapper.select();
		
		return beans;
	}
	@Override
	public boolean addForm(HttpServletRequest request) {
		
		String form_id = request.getParameter("form_id");
		String[] tag_ids = request.getParameterValues("tag_id");
		String[] label_names = request.getParameterValues("label_name");
		String[] default_values = request.getParameterValues("default_value");
		String[] multi_values = request.getParameterValues("multi_value");
		String[] check_rules = request.getParameterValues("check_rule");
		
		Forms forms = formsBiz.getForms(Integer.valueOf(form_id));
		
		int ruleNum = 0;
		int multiNum = 0;
		String fieldstr = forms.getfields();
		for(int i=0;i<tag_ids.length;i++){
			Form form = new Form();
			form.setTag_id(Integer.valueOf(tag_ids[i]));  		//放入标签id
			if("1".equals(tag_ids[i])){
				form.setCheck_rule(Integer.valueOf(check_rules[ruleNum]));   //放入数检规则
				ruleNum++;
			}else{
				form.setCheck_rule(0);
			}
			if("2".equals(tag_ids[i])||"3".equals(tag_ids[i])){
				String muls = multi_values[multiNum];
				form.setMulti_value(muls); 		//放入select或checkbox的value们
				/*Map map = JSON.parseObject(muls,Map.class);
				for (Object obj : map.keySet()){  
					
		            System.out.println("key为："+obj+"值为："+map.get(obj));  
		        }*/  
				multiNum++;
			}else{
				form.setMulti_value("");
			}
			form.setLabel_name(label_names[i]); 		//放入面板名称
			form.setTag_name(TransportPinyin.pinyin(label_names[i])); 	//放入字段名
			form.setForm_id(Integer.valueOf(form_id)); 	//放入表单form的id
			form.setDefault_value(default_values[i]);  //放入默认值
			form.setpaixu(0); 		//默认无排序为0
			mapper.insert(form);
			
			String form_name = AllformBiz.selectformNamebyid(Integer.valueOf(form_id));
			String datatype = null;
			switch(tag_ids[i]) 
			{ 
				case "1": 
				datatype="varchar(100)";
				break; 
				case "2": 
				datatype="varchar(20)"; 
				break;   
				case "3": 
				datatype="varchar(50)"; 
				break;
				case "4": 
				datatype="Text"; 
				break;
			} 
			fieldstr += ","+ TransportPinyin.pinyin(label_names[i]);
			BasetoolsBiz.createFields(form_name, TransportPinyin.pinyin(label_names[i]), datatype, label_names[i]);
		}
		forms.setfields(fieldstr);
		formsBiz.modifyForms(forms);
		return true;
	}
	@Override
	public List<Form> findFormbyId(int id) {
		
		List<Form> alllist = mapper.selectbyid(id);
		
		return alllist;
	}
}
