package org.utility;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String json) {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
		Configuration con= new Configuration(f, "Flipkart");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("BrowserVersion", "102");
		con.addClassifications("OS", "Windows");

		List<String> jsonFiles=new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r= new ReportBuilder(jsonFiles, con);
		r.generateReports();	}
}
