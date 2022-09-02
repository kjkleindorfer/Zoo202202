/**
 * @author lexer - lemarshall1
 * CIS175 - Fall 2022
 * Sep 1, 2022
 */
package model;
/**
 * @author lexer
 *
 */
public class Aardvark {
	private double weight;
	private String name;
	private int age;

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

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

public Aardvark() {
	this.weight = 1.0;
	this.name = "Gilbert";
	this.age = 0;
}

public Aardvark(double weight, String name, int age) {
	super();
	this.weight = weight;
	this.name = name;
	this.age = age;
}


@Override
public String toString() {
	return "Aardvark [weight=" + weight + ", name=" + name + ", age=" + age + "]";
}
public String speak() {
	return "Lick!";
}

}
