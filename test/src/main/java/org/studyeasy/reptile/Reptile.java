package org.studyeasy.reptile;

import org.studyeasy.animal.Animal;

public class Reptile extends Animal {
    protected String skin, egg;
    protected boolean backbone;

    public Reptile() {
        heightinfeet = 5;
        weightinfeet = 20;
        animalType ="Reptile";
        bloodtype ="cold";
        this.skin = "Dry skin";
        this.backbone =true;
        this.egg ="soft shelled";
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", heightinfeet=" + heightinfeet +
                ", weightinfeet=" + weightinfeet +
                ", animalType='" + animalType + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                '}';
    }
}
