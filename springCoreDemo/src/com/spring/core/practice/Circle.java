package com.spring.core.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape{
	
	public Point center;
	
	
	
	public Point getCenter() {
		return center;
	}


	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}



	@Override
	public void draw() {
		System.out.println("Drawing Circle : ");
		System.out.println("Center : (" + center.getX() + ", " + center.getY() + ")");		
	}
	

}
