/**
 * @author Derek Hanson - dlhanson5
 * CIS175 - Fall 2022
 * Aug 27, 2022
 */

public class Gorilla {
	private String name;
	private int age;
	private String gender;
	
	public Gorilla() {
		this.name = "Barry";
		this.age = 25;
		this.gender = "male";
	}

	public Gorilla(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	private String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private int getAge() {
		return age;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
	private String getGender() {
		return gender;
	}
	
	private void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Gorilla [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public String makeNoise() {
		return "Roar!";
	}
}
