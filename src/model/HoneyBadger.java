/**
 * @author Mike Cordon - mrcordon@dmacc.com * 
 * CIS175 - Spring 2024
 * Jan 9, 2024
 */

 package model
/**
 * A class Representing the honey badger, aka the Chuck Norris of the animal kingdom
 */
public class HoneyBadger {
	// attributes
	private int fsToGive = 0;  // honey badger don't give a f&(%
	private int ssToGive = 0;  // honey badger don't give a s*(&
	private String speed;
	private String food;
	private String enemy;
	/**
	 * Constructors
	 */
	public HoneyBadger() {  // default (no args)
		super();
		this.fsToGive = 0;  // honey badger never give a f@($
		this.ssToGive = 0;  // honey badger never gives a s$&^
	}
	
	// constructor with all args
	public HoneyBadger(int fsToGive, int ssToGive, String speed, String food, String enemy) {
		super();
		this.fsToGive = 0;  // please see previous notes
		this.ssToGive = 0;  // don't forget honey badger is a badass
		this.speed = speed;
		this.food = food;
		this.enemy = enemy;
	}
	
	
	// getters
	public int getFsToGive() {
		return fsToGive;
	}
	
	public int getSsToGive() {
		return ssToGive;
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public String getFood() {
		return food;
	}
	
	public String getEnemy() {
		return enemy;
	}


	// setters
	public void setFsToGive(int fsToGive) {
		this.fsToGive = 0;  // don't even try
	}
	
	public void setSsToGive(int ssToGive) {
		this.ssToGive = 0;  // same story here
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}
	
	// helper function to say what the honey badger thinks
	public String speak() {
		return "Honey Badger don't give a @^$#";
	}
	@Override
	public String toString() {
		return "HoneyBadger [fsToGive=" + fsToGive + ", ssToGive=" + ssToGive + ", speed=" + speed + ", food=" + food
				+ ", enemy=" + enemy + "]";
	}
	
	
}

