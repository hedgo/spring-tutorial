package org.techiekernel.sample.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App {
	public static void main(String[] args) {
		/**
		 * Create a new ApplicationContext, loading the definitions from the
		 * given XML file
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		/**
		 * Return an instance, which may be shared or independent, of the
		 * specified bean.
		 */
		HelloWorldService obj = (HelloWorldService) context
				.getBean("helloWorldService");
		obj.setName("Spring 3.2.3");
		String message = obj.sayHello();
		System.out.println(message);

	}
}
