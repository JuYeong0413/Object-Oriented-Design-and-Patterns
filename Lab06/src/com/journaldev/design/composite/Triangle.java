// 2016111540 ¿Ã¡÷øµ

package com.journaldev.design.composite;

public class Triangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing Triangle with color " + color);
	}
}
