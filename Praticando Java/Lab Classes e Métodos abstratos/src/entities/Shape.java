package entities;

import enums.Color;

/**
 * Classe Abstrata e genérica Shape
 * 
 * @author Caique.Batista
 */
public abstract class Shape {

	private Color color;

	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	/**
	 * Classe abstrata
	 * 
	 * @author Caique.Batista
	 */
	public abstract double area();

}
