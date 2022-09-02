/**
 * @author Adell - amrogers5
 * CIS175 - Fall 2022
 * Sep 1, 2022
 */

public class Basilisk {

	private String name;
	private String color;
	private int age;
	
	public Basilisk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Basilisk(String name, String color, int age) {
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
		return "Basilisk [name=" + name + ", color= " + color + ", age= " + age + "]";
	}
	
	public String speak() {
		return "Ssss!";
	}
}
