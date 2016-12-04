package com.example;

import com.example.beans.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
		Bean bean = context.getBean("bean", Bean.class);
		bean.out(); //the name is injected Name
		bean.setName("name1"); //name is changed

		Bean bean1 = context.getBean("bean", Bean.class);
		bean1.out();//name is name1

		ApplicationContext context1 = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
		Bean bean2 = context1.getBean("bean", Bean.class);
		bean2.out();//the name is injected Name,because this is a new context.
	}
}
