package model;

/**
 * @Charlie Dolphin charl - cpdolphin
 * CIS175 - Fall 2021
 * Aug 28, 2022
 */
public class Dolphin {
	private String name;
	private String mood;
	private int age;

	public Dolphin() {
		super();
	}

	public Dolphin(String name, String mood, int age) {
		super();
		this.name = name;
		this.mood = mood;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dolphin [name=" + name + ", mood=" + mood + ", age=" + age + "]";
	}

	public String speak() {
		return "Feed me your soul!";
	}
}

