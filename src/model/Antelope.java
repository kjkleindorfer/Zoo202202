/**
 Almassijv
 Java II - 2022
 Sep 5, 2022
 **/

package model;

public class Antelope {
    //initialize variables
    private String name;
    private boolean hasHorns;
    private int age;

    //no params  constructor
    public Antelope() {
        super();
    }

    //constructor with parameters for name color age
    public Antelope(String name, String color, int age) {
        super();
        this.name = name;
        this.hasHorns = true;
        this.age = age;
    }

    //getters and setters
    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //color
    public boolean getHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean has_horns) {
        this.hasHorns = has_horns;
    }
    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //make noise method
    public String makeNoise() {
        return "Snort!";
    }
}
