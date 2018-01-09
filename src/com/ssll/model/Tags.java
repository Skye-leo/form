package com.ssll.model;
public class Tags{
	
	private String code_grade;
	
	public String getCode_grade() {
		return code_grade;
	}

	public void setCode_grade(String code_grade) {
		this.code_grade = code_grade;
	}
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String type;
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return this.type;
	}
	private String code;
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return this.code;
	}
	private String css;
	public void setCss(String css){
		this.css=css;
	}
	public String getCss(){
		return this.css;
	}
}