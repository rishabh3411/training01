package org.studyeasy.animal;

public class Animal {
    protected float heightinfeet;
    protected float weightinfeet;
    protected String animalType;
    protected String bloodtype;

    public Animal(){
        this.heightinfeet = 0;
        this.weightinfeet = 0;
        this.animalType = "unknown";
        this.bloodtype = "unknown";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "heightinfeet=" + heightinfeet +
                ", weightinfeet=" + weightinfeet +
                ", animalType='" + animalType + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                '}';
    }
}
