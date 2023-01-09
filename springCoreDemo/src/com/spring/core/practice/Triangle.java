package com.spring.core.practice;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

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


	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
		
	}


	@Override
	public void setBeanName(String beanName) {
//		System.out.println("Bean Name is : "+ beanName);
		
	}
/*
	public void myInit() {
		System.out.println("myInit method is called for triangle.");
	}
	
	public void cleanUp() {
		System.out.println("cleanUp method is called.");
	}
	*/

}
