package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyAppn {

	@Autowired
	MyAppPrechecks checks;

	@Autowired
	User user; // null

	@Autowired
	Cart cart; //

	public void getProduct() {
		System.out.println("open -- ");
	}
	
	// ("/shop")
	public void shop() {
	//	checks.beforeCode();// before code runs
		System.out.println("  shop () method ");
		System.out.println("** shopping done..");
	//	checks.afterCode();// after code
	}

	public void pay() {
	//	checks.beforeCode();// before code runs
		System.out.println("  pay () method ");
		System.out.println("** payment done ");
	//	checks.afterCode();// after code
	}

}