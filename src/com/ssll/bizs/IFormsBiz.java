package com.ssll.bizs;
import com.ssll.model.*;
import java.util.List;
public interface IFormsBiz{
	public boolean addForms(Forms forms);
	public boolean removeForms(int id);
	public boolean modifyForms(Forms forms);
	public Forms getForms(int id);
	public List<Forms> findForms();
	
}