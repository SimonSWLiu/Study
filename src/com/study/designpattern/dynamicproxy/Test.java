package com.study.designpattern.dynamicproxy;

public class Test {
	public static void main(String[] args) throws Exception {
		Tank tank = new Tank();
		Moveable m = TankProxy.getBean(tank);
		m.move();

	}

}