package com.spring.Mavenspringdemo;
public class vodafone implements sim{
	@Override
	public void call() {
		System.out.println("Calling from airtel.");
	}

	@Override
	public void data() {
		System.out.println("Data available:100mb!!");
		
		
	}

}
