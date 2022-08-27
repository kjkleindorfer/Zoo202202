/*Alexander Kelly
 * CIS175 - Java II
 * 8/27/2022*/

public class Otter {

	String sound;
	int size;
	int weight;
	
	public Otter() {
		super();
	}

	public Otter(String sound, int size, int weight) {
		super();
		this.sound = sound;
		this.size = size;
		this.weight = ageweight;
	}

	public String getSound() {
		return sound;
	}

	public void setsound(String sound) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Otter [sound=" + sound + ", size=" + size + ", weight=" + weight + "]";
	}

	public String otterNoise() {
		return "squee!";
	}
		
}
