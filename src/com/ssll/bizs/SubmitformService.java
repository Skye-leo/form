package com.ssll.bizs;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ssll.model.Allform;
import com.ssll.model.Forms;
@Service
public class SubmitformService implements ISubmitformService {

	@Resource
	private IFormsBiz formsBiz;
	@Resource
	private IAllformBiz allformBiz;
	@Resource
	private IBasetoolsBiz basetoolsBiz;
	
	@Override
	public boolean submit(HttpServletRequest request) {
		
		String form_id = request.getParameter("id");
		
		Forms forms = formsBiz.getForms(Integer.valueOf(form_id));
		Allform allform = allformBiz.getAllform(Integer.valueOf(form_id));
		
		String sql = allform.getForm_name()+"("+forms.getfields()+")  values(";
		String[] fields = forms.getfields().split(",");
		for(int i=0;i<fields.length;i++){
			String preValue = request.getParameter(fields[i]);
			if(preValue==null){
				sql += "'-1',";
			}else{
				sql += "'"+preValue+"'"+",";
			}
		}
		sql = sql.substring(0,sql.length()-1);
		sql += ")";
		System.out.println(sql);
		basetoolsBiz.insertdata(sql);
		
		return true;
	}

}
