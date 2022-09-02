/**
 * @author chadrobbins - cerobbins@dmacc.edu
 * CIS 175 - Spring 2022
 * Sep 1, 2022
 */
package model;

/**
 * @author Chad Robbins - cerobbins
 * CIS175 - Fall 2021
 * Sep 1, 2022
 */
public class Giraffe {
	private String height; 
	private String diet;
	private String sound;
	
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
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}
	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String makeNoise() {
		return "Hmmmmmmmmmmm";
	}
	
	
}
