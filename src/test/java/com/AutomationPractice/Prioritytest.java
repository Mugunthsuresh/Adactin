package com.AutomationPractice;

import org.testng.annotations.Test;

public class Prioritytest {
@Test(priority = 4)
	private void unlockthedoor() {
		System.out.println("open the door");

	}@Test(priority = 5)
	private void getintothecar() {
		System.out.println("getintothe car");

	}@Test(priority=0)
	private void lockthedoor() {
		System.out.println("lockthedoor");

	}@Test(priority=1)
	private void startthecar() {
		System.out.println("start");

	}@Test(priority=3)
	private void firstgear() {
		System.out.println("firstgear");

	}@Test(priority=2)
	private void acclerator() {
		System.out.println("accelerator");

	}
	
	
	
	
	
}
