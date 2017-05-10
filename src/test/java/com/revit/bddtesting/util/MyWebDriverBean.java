package com.revit.bddtesting.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class MyWebDriverBean extends ChromeDriver implements DisposableBean {

	@Override
	public void destroy() throws Exception {
		super.quit();
	}

	public MyWebDriverBean() {
		super();
		super.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
