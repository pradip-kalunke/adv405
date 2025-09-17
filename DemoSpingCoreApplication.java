package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpingCoreApplication {

	public static void main(String[] args) {

		ApplicationContext AppnContext = SpringApplication.run(DemoSpingCoreApplication.class, args);

		MyAppn objMy = AppnContext.getBean(MyAppn.class); // springFW
		objMy.getProduct();
		objMy.shop();
		objMy.pay();
	}

}
