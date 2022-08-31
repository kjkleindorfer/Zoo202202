package model;

/**
 * @author Alex Waters - Awaters6
 * CIS175 - Fall 2021
 * Aug 31, 2022
 */
public class Giraffe {

	private String name;
	private int age;
	private String height;
	
	public Giraffe() {
		super();
		
	}
	public Giraffe(String name, int age, String height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
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
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String makeNoise() {
		return "ahhh";
	}
	
	
}
