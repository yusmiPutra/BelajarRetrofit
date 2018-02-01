package com.putra.mobile.belajarretrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class RssBerita {

	@SerializedName("result")
	private String result;

	@SerializedName("msg")
	private String msg;

	@SerializedName("data")
	private List<DataBerita> data;

	public void setResult(String result){
		this.result = result;
	}

	public String getResult(){
		return result;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setData(List<DataBerita> data){
		this.data = data;
	}

	public List<DataBerita> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"RssBerita{" +
			"result = '" + result + '\'' + 
			",msg = '" + msg + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}