package com.ssll.model;
public class Form{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private Integer form_id;
	public void setForm_id(Integer form_id){
		this.form_id=form_id;
	}
	public Integer getForm_id(){
		return this.form_id;
	}
	private Integer tag_id;
	public void setTag_id(Integer tag_id){
		this.tag_id=tag_id;
	}
	public Integer getTag_id(){
		return this.tag_id;
	}
	private String tag_name;
	public void setTag_name(String tag_name){
		this.tag_name=tag_name;
	}
	public String getTag_name(){
		return this.tag_name;
	}
	private String label_name;
	public void setLabel_name(String label_name){
		this.label_name=label_name;
	}
	public String getLabel_name(){
		return this.label_name;
	}
	private String multi_value;
	public void setMulti_value(String multi_value){
		this.multi_value=multi_value;
	}
	public String getMulti_value(){
		return this.multi_value;
	}
	private Integer paixu;
	public void setpaixu(Integer paixu){
		this.paixu=paixu;
	}
	public Integer getpaixu(){
		return this.paixu;
	}
	private String default_value;
	public void setDefault_value(String default_value){
		this.default_value=default_value;
	}
	public String getDefault_value(){
		return this.default_value;
	}
	private Integer check_rule;
	public void setCheck_rule(Integer check_rule){
		this.check_rule=check_rule;
	}
	public Integer getCheck_rule(){
		return this.check_rule;
	}
	private Integer status;
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getStatus(){
		return this.status;
	}
}