package com.coding.library.Model;

public class Soldier extends Army {

    private String grade;
    private int health;

    public Soldier(String name, String grade, int pv) {
        super(name);
        this.grade = grade;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Soldier : " + getName() + " = health : " + getHealth() +

                "";
    }
}
