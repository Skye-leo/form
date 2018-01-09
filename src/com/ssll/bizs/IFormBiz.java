package com.ssll.bizs;
import com.ssll.model.*;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
public interface IFormBiz{
	public boolean addForm(Form form);
	public boolean removeForm(int id);
	public boolean modifyForm(Form form);
	public Form getForm(int id);
	public List<Form> findForm();
	public boolean addForm(HttpServletRequest request);
	public List<Form> findFormbyId(int id);
}