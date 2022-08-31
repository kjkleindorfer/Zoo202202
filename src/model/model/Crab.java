/**  
* Zachary Lawless - zglawless  
* CIS171 
* Aug, 31 2022  
*/
package model;

public class Crab {
	private String sound;
	private String color;
	private String habitat;
	
	
	public Crab() {
		super();
	}


	public Crab(String sound, String color, String habitat) {
		super();
		this.sound = sound;
		this.color = color;
		this.habitat = habitat;
	}


	public String getSound() {
		return sound;
	}


	public void setSound(String sound) {
		this.sound = sound;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String makeNoise() {
		return "money money money";
	}
	
}
