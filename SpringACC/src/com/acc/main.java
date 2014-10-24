package com.acc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/*This container adds more enterprise-specific functionality such 
 * as the ability to resolve textual messages from a properties file 
 * and the ability to publish application events to interested event listeners. 
 * This container is defined by the org.springframework.context.ApplicationContext interface.
 * The ApplicationContext container includes all functionality of the BeanFactory container
 */
public class main {
	public static void main(String args[]){
		ApplicationContext context = new FileSystemXmlApplicationContext
	            ("C:/Users/Udaya Duvvuri/Eclipse J2EE/SpringACC/src/Bean.xml");
		helloacc obj = (helloacc)context.getBean("helloacc");
	      obj.getMessage();
	}
}