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

		Bean beanPrototype1 = context.getBean("bean_prototype", Bean.class);
		beanPrototype1.out();
		beanPrototype1.setName("prototype1");
		Bean beanPrototype2 = context.getBean("bean_prototype", Bean.class);
		beanPrototype2.out();
	}
}
