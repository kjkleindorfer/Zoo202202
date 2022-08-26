package model;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 25, 2022
 */
public class Meerkat {

	private String name;
	private int age;
	private double weight;
	
	// default no arg constructor
	public Meerkat () {
		super();
	}
	
	// 3 arg constructor
	public Meerkat (String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String speak() {
		return "Pumba!!!";
	}

	@Override
	public String toString() {
		return "Meerkat [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
