package com.firstclass;

public class Main {
    public static void main(String[] args) {
        Plant myPlant = new Plant("Fern", 2, 5);
        myPlant.getType();
        myPlant.getAge();
        myPlant.grow();
        myPlant.newLeaf();

        Leaf myLeaf = new Leaf("Green", true, myPlant);
        myLeaf.getColor();
        myLeaf.getHasWater();
        myLeaf.getNumLeaves();
    }
}