package model;

/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Sep 1, 2022
 */

public class Horse{
	private String breed;
	private String coatPattern;
	private int weight;
	
	//Constructors
	public Horse() {
		super();
		this.breed = "";
		this.coatPattern = "";
		this.weight = 0;
	}
	public Horse(String breed, String coatPattern, int weight) {
		super();
		this.breed = breed;
		this.coatPattern = coatPattern;
		this.weight = weight;
	}
	//Get and Set
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getCoatPattern() {
		return coatPattern;
	}
	public void setCoatPattern(String coatPattern) {
		this.coatPattern = coatPattern;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//Methods
	public String makeNoise() {
		String noise = "Neigh!";
		return noise;
	}
}