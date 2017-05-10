package com.revit.bddtesting.util;

import org.kohsuke.args4j.Option;

public class CommandLineValues {
	@Option(required = false, name = "-d", aliases = { "--driver" }, usage = "WebDriver Executable File Name")
	private String fileName = "chromedriver.exe";
	
	public String getFileName() {
		return fileName;
	}

}
