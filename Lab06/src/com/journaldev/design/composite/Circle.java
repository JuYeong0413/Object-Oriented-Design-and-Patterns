// 2016111540 ���ֿ�

package com.journaldev.design.composite;

public class Circle implements Shape {
	
	@Override
	public void draw(String color) {
		System.out.println("Drawing Circle with color " + color);
	}
}
