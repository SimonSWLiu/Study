package com.study.designpattern.dynamicproxy;

import java.util.Random;

public class Tank implements Moveable {

	public void move() {
		System.out.println("Tank moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}