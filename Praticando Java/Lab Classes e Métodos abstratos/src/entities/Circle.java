package entities;

import enums.Color;

public class Circle extends Shape {
	
private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	// getters and setters
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	/**
	 * Método sobreposto da classe Shape, calcula a area de um circulo
	 * 
	 * @return retorna areá do circulo
	 * @author Caique.Batista
	 */
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
