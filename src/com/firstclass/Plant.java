package com.firstclass;

public class Plant{
    public String type;
    public int age;
    public int numLeaves;
    public int prevLeaves;
    public boolean grownNewLeaf = false;

    public Plant(String type, int age, int numLeaves) {
        this.type = type;
        this.age = age;
    }
    public String getType() {
        System.out.println("This plant is a " + type);
        return type;
    }
    public int getAge() {
        System.out.println("This plant is " + age + " years old.");
        return age;
    }
    public void grow() {
        age++;
        System.out.println("The plant has grown! It is now " + age + " years old.");
    }
    public void newLeaf() {
        prevLeaves = numLeaves;
        numLeaves = numLeaves + 1;
        grownNewLeaf = true;
        System.out.println("A new leaf has sprouted!");
    }



}