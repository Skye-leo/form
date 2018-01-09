package com.ssll.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssll.bizs.IFormBiz;
import com.ssll.model.Form;

@Controller
public class EditFormController {
	
	@Resource
	private IFormBiz formBiz;
	
	@RequestMapping(value="/gotoPage")
	public @ResponseBody List gotoPage(HttpServletRequest request,@RequestParam(value="form_id")String id){
//		String id = request.getParameter("form_id");
		List<Form> list = formBiz.findFormbyId(Integer.valueOf(id));
		return list;
	}
}
