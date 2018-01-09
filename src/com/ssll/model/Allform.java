package com.ssll.model;
public class Allform{
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
	private Integer version;
	public void setVersion(Integer version){
		this.version=version;
	}
	public Integer getVersion(){
		return this.version;
	}
	private String creation_date;
	public void setCreation_date(String creation_date){
		this.creation_date=creation_date;
	}
	public String getCreation_date(){
		return this.creation_date;
	}
	
	private String name_paraphrase;
	public String getName_paraphrase() {
		return name_paraphrase;
	}

	public void setName_paraphrase(String name_paraphrase) {
		this.name_paraphrase = name_paraphrase;
	}
}