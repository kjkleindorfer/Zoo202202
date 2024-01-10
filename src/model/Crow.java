/**
 * @author Daniel Lebedev - dalebedev 
 * CIS 175 - Spring 2024
 * Jan 10, 2024
 */
package model;

public class Crow {
	private String name;
	private String color;
	private int wingspan;

	public Crow() {
		super();
	}
	
	public Crow(String name, String color, int wingspan) {
		super();
		this.name = "Carl";
		this.color = "Black";
		this.wingspan = 2;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor() {
		this.color = color;
	}
	
	public int getWingspan() {
		return wingspan;
	}
	
	public void setWingspan() {
		this.wingspan = wingspan;
	}
	
	public String makeNoise() {
		return "Caw Caw";
	}
}

