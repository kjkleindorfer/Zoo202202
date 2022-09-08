/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Sep 7, 2022
*/
package model;

/**
 * @author krazy
 *
 */
public class Hyena {
	private int spots; // every hyena has a unique amount of spots!
	private String diet;
	private String noise;

	public Hyena() {
		super();
	}
	
	public Hyena(int spots, String diet, String noise) {
		this.setSpots(spots);
		this.setDiet(diet);
		this.setNoise(noise);
	}

	/**
	 * @return the spots
	 */
	public int getSpots() {
		return spots;
	}

	/**
	 * @param spots the spots to set
	 */
	public void setSpots(int spots) {
		this.spots = spots;
	}

	/**
	 * @return the diet
	 */
	public String getDiet() {
		return diet;
	}

	/**
	 * @param diet the diet to set
	 */
	public void setDiet(String diet) {
		this.diet = diet;
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
	
	public String makeNoise() {
		return "HAHAHAH";
	}
}
