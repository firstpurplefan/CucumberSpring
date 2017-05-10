package com.revit.bddtesting.webtesting;

import java.io.File;

import org.junit.runner.JUnitCore;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import com.revit.bddtesting.util.CommandLineValues;

public class App {	
	public static void main(String[] args) {
		CommandLineValues values = new CommandLineValues();
		CmdLineParser parser = new CmdLineParser(values);
		try {
			parser.parseArgument(args);
		} catch (CmdLineException e) {
			System.err.println(e.getMessage());
			parser.printUsage(System.err);
			System.exit(-1);
		}

		File webDriver = new File(values.getFileName());
		if (webDriver.exists()) {
			System.setProperty("webdriver.chrome.driver", webDriver.getAbsolutePath());
			JUnitCore.runClasses(RunTest.class);
		} else {
			System.err.println("File \"chromedriver.exe\" does not exist. ");
			System.err.println("Add your web driver file to beside jar file. ");
			System.err.println("Or specify the file name by using \"-d [FileNmae]\". ");
			System.exit(-1);
		}
	}
}