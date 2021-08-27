package com.AutomationPractice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Myretry implements IRetryAnalyzer {
	
	int count=1;
	int limit=5;
	
public boolean retry(ITestResult result) {
		if (count<limit) {
			count++;
			return true;
		}
		return false;
	}

}
