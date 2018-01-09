package com.ssll.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssll.bizs.AllformService;
import com.ssll.bizs.IFormsBiz;
import com.ssll.dto.AllFormsObject;
import com.ssll.model.Forms;

@Controller
public class AllFormsController {
	@Resource
	private IFormsBiz formsBiz;
	@Resource
	private AllformService allformservice;
	
	@RequestMapping(value="/addform")
	public String addForm(@RequestParam(value="form_name")String form_name){
		
		Boolean flag;
		try {
			flag = allformservice.addForm(form_name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag=false;
		}
		return "redirect:allforms.jsp?flag="+flag;
	}
	
	@RequestMapping(value="/getbasedata")
	public @ResponseBody AllFormsObject getBaseData(){
		
		AllFormsObject afo = new AllFormsObject();
		
		List<Forms> list = formsBiz.findForms();
		afo.setForms(list); 
		
		return afo;
	}
	

}
