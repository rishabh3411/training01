package org.studyeasy.insect;

import org.studyeasy.Livingcreature.organism;

public class Bee extends organism {
    public String wings;
    public String bodytype;
    public Bee(){
        wings ="yes";
        bodytype ="slim";
    }

    @Override
    public String toString() {
        return "Bee{" +
                "wings='" + wings + '\'' +
                ", bodytype='" + bodytype + '\'' +
                "} " + super.toString();
    }

    public Bee(int eyes, int ears, int legs, String hairs, String wings, String bodytype) {
        super(eyes, ears, legs, hairs);
        this.wings = wings;
        this.bodytype = bodytype;
    }

    public String getWings() {
        return wings;
    }

    public String getBodytype() {
        return bodytype;
    }
}
