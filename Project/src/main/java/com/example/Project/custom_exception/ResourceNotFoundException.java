package com.example.Project.custom_exception;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
 public ResourceNotFoundException(String msg) {
	 super (msg);
 }
}
