package com.ssll.controller;



import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.ssll.bizs.IFormBiz;

@Controller
public class AddTags {
	
	@Resource
	private IFormBiz formBiz;
	
	@RequestMapping(value="/addtag")
	public String addtag(HttpServletRequest request) throws JSONException{

		boolean flag = formBiz.addForm(request);

		return "redirect:addTags.jsp?flag="+flag+"&form_id="+request.getParameter("form_id");
	}
}
