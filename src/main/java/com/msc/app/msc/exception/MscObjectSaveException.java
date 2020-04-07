package com.msc.app.msc.exception;

public class MscObjectSaveException extends RuntimeException {
	
	private Object obj;
	public MscObjectSaveException(String message,Object obj) {
		super(message);
		this.obj=obj;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	

}
