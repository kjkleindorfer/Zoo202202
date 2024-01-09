
/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Jan 8, 2024
 */
public class Lion {
	private String name;
	private String noise;
	private String maneColor;
	
	public Lion() {
		this.setName("Alex");
		this.setNoise("Wroarrrr!");
		this.setManeColor("Brown");
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
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}

	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}

	/**
	 * @return the maneColor
	 */
	public String getManeColor() {
		return maneColor;
	}

	/**
	 * @param maneColor the maneColor to set
	 */
	public void setManeColor(String maneColor) {
		this.maneColor = maneColor;
	}
	
	public String makeNoise() {
		return this.noise;
	}
}
