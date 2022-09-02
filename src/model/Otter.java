package model;
/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Sep 1, 2022
 */
public class Otter {
	// instance variables
	String name;
	int age;
	String color;
	
	Otter() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param color
	 */
	public Otter(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	// toString() method
	@Override
	public String toString() {
		return "Otter [name=" + name + ", age=" + age + ", color=" + color + "]";
	}

	//speak() method
	public String speak() {
		return "Squeal";
	}
	
	
	
	
}
