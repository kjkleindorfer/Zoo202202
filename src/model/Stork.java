/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Aug 27, 2022
 */

public class Stork {
	private String diet;
	private String color;
	private double length;
	
	//This is the default, no argument constructor
	public Stork() {
	}
	
	//This is the non-default constructor
	public Stork(String storkDiet, String storkColor, double storkLength) {
		this.diet = storkDiet;
		this.color = storkColor;
		this.length = storkLength;
	}
	
	//Declaring the accessors and mutators for each field of this class
	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * This method represents the noise that the stork makes.
	 * @return a string, representing the noise that the stork makes
	 */
	public String makeNoise() {
		return "Bill-clattering noise";
	}
}
