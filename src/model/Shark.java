package model;

/**
 * @author Sabina Johnson - skaramuja
 * CIS175 - Fall 2022
 * Aug 25, 2022
 */
public class Shark {
	private String name;
	private String species;
	private int age;
	
	public Shark() {
		super();
	}
	public Shark(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
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
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
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
	
	@Override
	public String toString() {
		return "Shark [name=" + name + ", species=" + species + ", age=" + age + "]";
	}
	
	public String makeNoise() {
		return "splash--crunch--splash";
	}

}
