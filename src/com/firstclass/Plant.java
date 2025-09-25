package com.firstclass;

public class Plant{
    private String type;
    private int age;
    public int numLeaves;
    public int prevLeaves;
    public boolean grownNewLeaf = false;

    public Plant(String type, int age, int numLeaves) {
        this.type = type;
        this.age = age;
    }
    public String getType() {
        print("This plant is a " + type);
        return type;
    }
    public int getAge() {
        print("This plant is " + age + " years old.");
        return age;
    }
    public void grow() {
        age++;
        print("The plant has grown! It is now " + age + " years old.");
    }
    public void newLeaf() {
        prevLeaves = numLeaves;
        numLeaves++;
        print("A new leaf has sprouted!");
    }



}