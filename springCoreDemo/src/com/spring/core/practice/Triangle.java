package com.spring.core.practice;

public class Triangle {
	String type;
	int height;
	
	Triangle(String type){
		this.type = type;
	}
	
	Triangle(int height){
		this.height = height;
	}
	
	Triangle(String type, int height){
		this.type = type;
		this.height = height;
	}
	
	
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

	void draw(){
		System.out.println(getType() +" Triangle Drawn of height " + getHeight());
	}

}
