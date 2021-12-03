package com.coding.library.Model;

public class Army {
    private String name;

    public Army(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
