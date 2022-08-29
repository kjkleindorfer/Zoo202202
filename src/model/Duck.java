package model;

/**
 * @author Elijah Edlund - ezedlund CIS175 - Fall 2021 Aug 29, 2022
 */

public class Duck {
	String name;
	int age;
	String color;

	// Default constructor
	public Duck() {
		super();
	}

	// Constructor
	public Duck(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	// Get name
	public String getName() {
		return name;
	}

	// Set name
	public void setName(String name) {
		this.name = name;
	}

	// Get age
	public int getAge() {
		return age;
	}

	// Set age
	public void setAge(int age) {
		this.age = age;
	}

	// Get color
	public String getColor() {
		return this.color;
	}

	// Set color
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

	// Make noise
	public String makeNoise() {
		return "Quack!";
	}
}
