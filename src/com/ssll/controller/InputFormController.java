package com.ssll.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssll.bizs.IAllformBiz;
import com.ssll.bizs.IJointForm;
import com.ssll.bizs.ISubmitformService;
import com.ssll.bizs.SubmitformService;
import com.ssll.model.Allform;

import jdk.nashorn.internal.objects.annotations.Constructor;

@Controller
public class InputFormController {
	
	@Resource
	private IJointForm jointformBiz;
	@Resource
	private IAllformBiz allformBiz;
	@Resource
	private ISubmitformService submitformService;
	
	@RequestMapping(value="/getformsList")
	public @ResponseBody List getforms(){
		
		List<Allform> list = allformBiz.findAllform();
		
		return list;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/showinputform", produces = "text/html;charset=UTF-8")
	public @ResponseBody String showinputform(@RequestParam(value="id")int id){
		
		/*Map map = new HashMap();
		
		map.put("html",jointformBiz.JointTab(id));*/
				
		return jointformBiz.JointTab(id);
		
	}
	
	@RequestMapping(value="/submitform")
	public String submitform(HttpServletRequest request){
		
		boolean flag = submitformService.submit(request);
		
		return "redirect:inputform.jsp?flag="+flag;
		
	}
	
}
