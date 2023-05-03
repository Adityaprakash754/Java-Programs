package com.rnsit.facade;

public class ShapeMaker {

	private Shape square;
	private Shape rectangle;
	private Shape circle;
	
	public ShapeMaker() {
		square= new Square();
		rectangle= new Rectangle();
		circle= new Circle();
	}
	public void drawAll()
	{
		square.draw();
		rectangle.draw();
		circle.draw();
	}

}
