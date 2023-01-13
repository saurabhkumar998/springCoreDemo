package com.spring.core.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	
	
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
		System.out.println(this.messageSource.getMessage("circle.draw", null, "Default Message", null));
		System.out.println(this.messageSource.getMessage("circle.point", new Object[] {center.getX(), center.getY()}, "Default Point Message", null));		
		//System.out.println(this.messageSource.getMessage("greetings", null, "Default Message", null));
		
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	

}
