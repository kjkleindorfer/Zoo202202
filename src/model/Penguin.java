
/**
 * @author lthor - lthornburg1
 * CIS175 - Fall 2022
 * Sep 1, 2022
 */
public class Penguin {
	private string type;
	private string diet;
	private string sound;
	
	public Penguin() {
		setType("King Penguin");
		setDiet("squid");
		setSound("bleat");
	}
	
	@Override
	public String toString() {
		return "Penguin [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public string getType() {
		return type;
	}
	
	public void setType(string type) {
		this.type = type;
	}
	
	public string getDiet() {
		return diet;
	}
	
	public void setDiet(string diet) {
		this.diet = diet;
	}
	
	public string getSound() {
		return sound;
	}
	
	public void setSound(string sound) {
		this.sound = sound;
	}
	
	public String makeSound() {
		return "Bleat, Bleat";
	}
	
	
}
