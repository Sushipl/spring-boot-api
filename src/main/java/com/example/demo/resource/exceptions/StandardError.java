package com.example.demo.resource.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private String timestamp;
	private String status;
	private String error;
	private String message;
	private String path;
	
	
	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public StandardError() {
		
	}
	
	
	

}
