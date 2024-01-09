package model;
/**  
* @author Jonah Hummel - jdhummel2 
* CIS175 - Spring 2024
* Jan 9, 2024  
*/
public class Leopard {
	private String name; //leopard family i.e snow, sinai, arabian
	private String gender; 
	private int weight;
	
	
	public Leopard(String name, String gender, int weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.weight = weight; 
	}


	public Leopard() {
		super();
		this.name = "Arabian";
		this.gender = "male";
		this.weight = 60;
				
	}
	
	public String speak() {
		if(gender.equals("male")){
			return "*growl*";
		}
		else {
			return "*purrr*";
		}
	}
	
	
	
	
	
	
}
