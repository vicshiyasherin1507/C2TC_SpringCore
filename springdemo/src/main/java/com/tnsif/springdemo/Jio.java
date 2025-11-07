package com.tnsif.springdemo;

public class Jio implements Mobile{

	@Override
	public void call() {
		System.out.println("call using Jio");
	}

	@Override
	public void data() {
		System.out.println("share using Jio");
	}

}
