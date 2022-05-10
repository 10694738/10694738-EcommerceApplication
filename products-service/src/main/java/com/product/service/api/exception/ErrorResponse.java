package com.product.service.api.exception;

import java.util.List;

import org.springframework.stereotype.Component;


@Component

public class ErrorResponse{
	
	public ErrorResponse() {
		// TODO Auto-generated constructor stub
	}
    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
  
    private String message;
    private List<String> details;
 
    //getters and setters
}
