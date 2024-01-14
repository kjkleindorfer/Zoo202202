
/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Jan 14, 2024
 */
public class Caracal {
	
	private String name;
	private int age;
	private String furColor;
	
	
	public Caracal() 
	{
		this.name = name;
		this.age = age;
		this.furColor = furColor;
		
	}
	
	public String makeNoise(){
		
		return "Hiss";
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	}

