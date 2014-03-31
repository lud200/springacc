package com.acc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class main {
	public static void main(String args[]){
		ApplicationContext context = new FileSystemXmlApplicationContext
	            ("C:/Users/Udaya Duvvuri/Eclipse J2EE/SpringACC/src/Bean.xml");
		helloacc obj = (helloacc)context.getBean("helloacc");
	      obj.getMessage();
	}
}