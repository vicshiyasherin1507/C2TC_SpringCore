package com.tnsif.springdemo;

public class Airtel implements Mobile{

	@Override
	public void call() {
		System.out.println("call using Airtel");
	}

	@Override
	public void data() {
		System.out.println("share using Airtel");
	}

}
