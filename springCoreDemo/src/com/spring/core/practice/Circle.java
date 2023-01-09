package com.spring.core.practice;

public class Circle implements Shape{
	
	public Point center;
	
	
	
	public Point getCenter() {
		return center;
	}



	public void setCenter(Point center) {
		this.center = center;
	}



	@Override
	public void draw() {
		System.out.println("Drawing Circle : ");
		System.out.println("Center : (" + center.getX() + ", " + center.getY() + ")");		
	}
	

}
