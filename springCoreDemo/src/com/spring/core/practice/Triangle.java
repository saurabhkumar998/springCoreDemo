package com.spring.core.practice;

import java.util.List;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;


	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	void draw(){
		System.out.println(this.pointA.getX() + " , " + this.getPointA().getY());
		System.out.println(this.pointB.getX() + " , " + this.getPointB().getY());
		System.out.println(this.pointC.getX() + " , " + this.getPointC().getY());
	}

}
