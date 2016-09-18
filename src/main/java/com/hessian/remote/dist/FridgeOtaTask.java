package com.hessian.remote.dist;
import java.io.Serializable;


	/**
	 * 
	 * OTA 升级
	 * 
	 **/
@SuppressWarnings("serial")
public class FridgeOtaTask implements Serializable {
	
	
	 private Long taskId;
	
	 private String fridgeMac;
	
	 private String jpushId;
	
	 private Integer status;
	
	 private String model;
	
	 private String type;
	
	 private Integer pushCount;
	
	 private java.util.Date pushTime;
     
	 public final static int isend=1;
	 
	 public final static int isdownload=2;

	public void setTaskId(Long taskId){
		this.taskId = taskId;
	}

	public Long getTaskId(){
		return this.taskId;
	}

	public void setFridgeMac(String fridgeMac){
		this.fridgeMac = fridgeMac;
	}

	public String getFridgeMac(){
		return this.fridgeMac;
	}

	public void setJpushId(String jpushId){
		this.jpushId = jpushId;
	}

	public String getJpushId(){
		return this.jpushId;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return this.model;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	public void setPushCount(Integer pushCount){
		this.pushCount = pushCount;
	}

	public Integer getPushCount(){
		return this.pushCount;
	}

	public void setPushTime(java.util.Date pushTime){
		this.pushTime = pushTime;
	}

	public java.util.Date getPushTime(){
		return this.pushTime;
	}

}
