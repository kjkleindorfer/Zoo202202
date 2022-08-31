package model;

/**
 * @author Kilian Wehde - kewehde
 * CIS175 - Fall 2022
 * Aug 30, 2022
 */

public class Crow {
    //Variables
    private String name;
    private float weight; // in lbs
    private int age; // in years

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Constructors
    public Crow() {
    }
    public Crow(String name, float weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    //Methods
    public String speak(){
        return "Caw";
    }
}
