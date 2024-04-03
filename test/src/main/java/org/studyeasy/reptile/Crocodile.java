package org.studyeasy.reptile;

public class Crocodile extends Reptile{
    public Crocodile(){
        super();
        egg ="Hard shelled";
    }

    @Override
    public String toString() {
        return "Crocodile{" +
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
