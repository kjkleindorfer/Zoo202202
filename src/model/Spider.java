
/**  
* @author Logan Kennebeck - ljkennebeck1  
* CIS175 - Fall 2021
* Aug 26, 2022  
*/
public class Spider {
	private String breed;
	private String color;
	private int numOfEyes;
	
	public Spider() {
		super();
		setBreed("Tarantula");
		setColor("Brown");
		setNumOfEyes(8);
	}

	public Spider(String breed, String color, int numOfEyes) {
		super();
		this.breed = breed;
		this.color = color;
		this.numOfEyes = numOfEyes;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumOfEyes() {
		return numOfEyes;
	}

	public void setNumOfEyes(int numOfEyes) {
		this.numOfEyes = numOfEyes;
	}
	
	public String makeNoise() {
		return ("Hiss");
	}
	
	
}
