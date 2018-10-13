package com.milind.springDi;

import com.milind.springDi.controller.ConstructorInjectCOntroller;
import com.milind.springDi.controller.MyController;
import com.milind.springDi.controller.PropertyInjectController;
import com.milind.springDi.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {


		ApplicationContext context =SpringApplication.run(SpringDiApplication.class, args);

		MyController myController =(MyController) context.getBean("myController");
		myController.sayHello();

		System.out.println(context.getBean(PropertyInjectController.class).sayHello());

		System.out.println(context.getBean(SetterInjectionController.class).sayHello());

		System.out.println(context.getBean(ConstructorInjectCOntroller.class).sayHello());


	}
}
