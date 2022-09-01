/**
 * @author Gabriel Lanphier - glanphier
 * CIS175 - Fall 2022
 * Sep 1, 2022
 */
public class Mouse {
	private String color;
	private String name;
	private boolean hasWheel;
	
	public Mouse() {
		super();
	}
	
	public Mouse(String color, String name, boolean hasWheel) {
		super();
		this.color = color;
		this.name = name;
		this.hasWheel = hasWheel;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHasWheel(boolean hasWheel) {
		this.hasWheel = hasWheel;
	}
	public boolean getHasWheel() {
		return hasWheel;
	}
	
	public String makeNoise() {
		return "squeak";
	}
}
