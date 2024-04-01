package org.studyeasy.Livingcreature;

public class organism {
    private int eyes;
    private int ears;
    private int legs;
    private String hairs;

    public organism(){
        eyes = 2;
        ears = 2;
        legs = 2;
        hairs = "millions";
    }

    @Override
    public String toString() {
        return "organism{" +
                "eyes=" + eyes +
                ", ears=" + ears +
                ", legs=" + legs +
                ", hairs='" + hairs + '\'' +
                '}';
    }

    public organism(int eyes, int ears, int legs, String hairs) {
        this.eyes = eyes;
        this.ears = ears;
        this.legs = legs;
        this.hairs = hairs;
    }

    public int getEyes() {
        return eyes;
    }

    public int getEars() {
        return ears;
    }

    public int getLegs() {
        return legs;
    }

    public String getHairs() {
        return hairs;
    }
}
