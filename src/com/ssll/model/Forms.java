package com.ssll.model;
public class Forms{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String form_name;
	public void setForm_name(String form_name){
		this.form_name=form_name;
	}
	public String getForm_name(){
		return this.form_name;
	}
	private String fields;
	public void setfields(String fields){
		this.fields=fields;
	}
	public String getfields(){
		return this.fields;
	}
	private Integer status;
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getStatus(){
		return this.status;
	}
	
	private Integer form_id;
	public Integer getForm_id() {
		return form_id;
	}

	public void setForm_id(Integer form_id) {
		this.form_id = form_id;
	}
}