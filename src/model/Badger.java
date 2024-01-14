/**
 * @author Karin Brun - KarinBrun
 * CIS175 - Spring 2024
 * Jan 13, 2024
 */

package model;

public class Badger {
    private String name;
    private String color;
    private int age;

    public Badger() {
    }

    public Badger(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak() {
        return "MUSHROOM MUSHROOM";
    }
}
