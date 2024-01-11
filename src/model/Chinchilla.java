
/**
 * @author christophersaid - csaid
 * CIS175 - Fall 2023
 * Jan 11, 2024
 */
public class Chinchilla {
	
	private String name;
	private int age;
	private boolean hasDust;
	
	/**
	 * default constructor
	 */
	public Chinchilla() {
		
	}

	/**
	 * @param name, name of the Chinchilla
	 * @param age, age of the Chinchilla
	 * @param hasDust, does the Chinchilla have sufficient dust to bathe in
	 */
	public Chinchilla(String name, int age, boolean hasDust) {
		super();
		this.name = name;
		this.age = age;
		this.hasDust = hasDust;
	}

	/**
	 * @return the name of the Chinchilla
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name, the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age of the Chinchilla
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age, the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return whether the Chinchilla has sufficient dust to bathe in
	 */
	public boolean isHasDust() {
		return hasDust;
	}

	/**
	 * @param hasDust, the state of dust level to set
	 */
	public void setHasDust(boolean hasDust) {
		this.hasDust = hasDust;
	}

	/**
	 * @return String, the current values of the Chinchilla object
	 */
	@Override
	public String toString() {
		return "Chinchilla [name=" + name + ", age=" + age + ", hasDust=" + hasDust + "]";
	}
	
	/**
	 * @return String, the sound of a Chinchilla
	 */
	public String makeNoise() {
		return "* squeak, sniffle, squeak *";
	}
	
	
	
	
	
	
	
}