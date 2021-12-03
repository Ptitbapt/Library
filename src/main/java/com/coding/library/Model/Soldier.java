package com.coding.library.Model;

public class Soldier extends Army {

    private String grade;
    private int pv;

    public Soldier(String name, String grade, int pv) {
        super(name);
        this.grade = grade;
        this.pv = pv;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Soldier{" +
                "Nom" + getName() + "\n" +
                "grade='" + getGrade() + '\'' +
                ", pv=" + getPv() +
                '}';
    }
}
