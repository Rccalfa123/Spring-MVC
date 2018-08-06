package com.cg.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.renderer.MessageRenderer;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		MessageRenderer renderer = (MessageRenderer) applicationContext.getBean("renderer");
		renderer.render();
	}

}
