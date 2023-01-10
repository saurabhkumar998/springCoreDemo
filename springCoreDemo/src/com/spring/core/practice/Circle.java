package com.spring.core.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
	
	public Point center;
	
	
	
	public Point getCenter() {
		return center;
	}


	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}



	@Override
	public void draw() {
		System.out.println("Drawing Circle : ");
		System.out.println("Center : (" + center.getX() + ", " + center.getY() + ")");		
	}
	

}
