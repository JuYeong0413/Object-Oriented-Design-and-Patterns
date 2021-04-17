// 2016111540 ¿Ã¡÷øµ

package com.journaldev.design.composite;
import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	
	public void remove(Shape shape) {
		this.shapes.remove(shape);
	}
	
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}

	@Override
	public void draw(String color) {
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw(color);
		}
	}
}
