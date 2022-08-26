

/**  
* @author Zach Meyer - zjmeyer  
* CIS175 - Spring 2022
* Aug 26, 2022  
*/

public class wolf {
	private String name;
	private String color;
	private String age;
	
	
	public wolf(String name, String color, String age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}


	public wolf() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}
	
	public String speak() {
		return "Hoooowlllllllll";
	}
}
