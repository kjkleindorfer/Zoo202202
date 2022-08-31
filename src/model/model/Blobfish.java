package model;

/**
 * @author SSene - Suzette Senephansiri
 * CIS175 - Spring 2022
 * Jan 15, 2022
 */
public class Blobfish {
	private String habitat;
	private String name;
	private int length;

	public Blobfish() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param habitat
	 * @param name
	 * @param length
	 */
	public Blobfish(String habitat, String name, int length) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.length = length;
	}

	/**
	 * @return the habitat
	 */
	public String getHabitat() {
		return habitat;
	}

	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
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
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Blobfish [name=" + name + ", length=" + length + "inches, habitat=" + habitat + "]";
	}
	public String makeNoise() {
		return "Blrrbpf";
	}
}
