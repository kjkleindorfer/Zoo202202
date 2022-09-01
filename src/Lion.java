package model;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175 - Fall 2022
 * August 28, 2022
 */

public class Lion {

	private String name;
	private String color;
	private int age;
	
	
	public Lion() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lion(String name, String color, int age) {
		
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Lion [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	public String speak() {
		return "Roar";
	}	
	
}
