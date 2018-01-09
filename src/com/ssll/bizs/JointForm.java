package com.ssll.bizs;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ssll.model.Form;
import com.ssll.model.Tags;
@Service
public class JointForm implements IJointForm{
	
	@Resource
	private IFormBiz formBiz;
	@Resource
	private ITagsBiz tagBiz;
	
	@Override
	public String JointTab(int form_id) {
		
		List<Form> list = formBiz.findFormbyId(form_id);
		String formhtml = "";
		for(int i=0;i<list.size();i++){
			Tags tag = tagBiz.getTags(list.get(i).getTag_id());
			String code = tag.getCode();
			
			if(list.get(i).getTag_id()==2||list.get(i).getTag_id()==3){
				String allgrade = "";
				String grade = tag.getCode_grade();
				Map<String,Object> map = JSONObject.parseObject(list.get(i).getMulti_value());
				for(Object value:map.values()){
					allgrade +=  grade.replace("multi_value|||||",value.toString());
				}
				code = code.replace("code_grade|||||",allgrade);
			}
			
			code = code.replace("label_name|||||",list.get(i).getLabel_name()); 	//替换label提示名
			code = code.replace("name|||||",list.get(i).getTag_name()); 	//替换name的值
			code = code.replace("re|||||",list.get(i).getTag_name()); 	//替换id的值
			if(list.get(i).getDefault_value()==null){
				code = code.replace("value|||||","");
			}else{
				code = code.replace("value|||||",list.get(i).getDefault_value());
			}
			formhtml += code;
		}
		System.out.println(formhtml);
		return formhtml;
	}
		
}
