package org.tyss.sms001;

import org.testng.annotations.Test;

public class MavenPractice2Test {
	@Test
	public String getProperty(String string) {
		//Get data from property file
		   String browser =System.getProperty("BROWSER");
		String username =System.getProperty("UN");
		String password = System.getProperty("PWD");
		String url =System.getProperty("URL");
		System.out.println(username+password+url+browser);
		System.out.println(username+password+url+browser);

		return string;
	}

}
