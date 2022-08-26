
/**
 * @author kenne-krcutkomp CIS175 - Fall 2022
 */
public class Goose {

	private String name;
	private int age;
	private String color;

	/**
	 * 
	 */
	public Goose() {

	}

	public Goose(String name, int age, String color) {
		setName(name);
		setAge(age);
		setColor(color);
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

	public String makeNoise() {
		return "Quack";
	}

}
