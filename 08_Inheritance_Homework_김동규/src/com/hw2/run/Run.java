package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {
	
	public static void main(String[] args) {
		
	
	Circle[] c = new Circle[2];
	
	c[0] = new Circle(1, 2, 3);
	c[1] = new Circle(3, 3, 4);
	
	Rectangle[] r = new Rectangle[2];
	
	r[0] = new Rectangle(-1, -2, 5, 2);
	r[1] = new Rectangle(-2, 5, 2, 8);
	
	for(Circle c1 : c) {
		c1.draw();
	}
	
	System.out.println("===================");
	
	for(Rectangle r1 : r) {
		r1.draw();
	}

}
	
}
