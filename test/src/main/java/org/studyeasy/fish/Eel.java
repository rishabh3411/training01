package org.studyeasy.fish;

public class Eel extends Fish{
    private String special;

    public Eel(){
        super();
        this.special ="Releases electric shock";
    }

    @Override
    public String toString() {
        return "Eel{" +
                "special='" + special + '\'' +
                ", WaterBone=" + WaterBone +
                ", gills=" + gills +
                ", heightinfeet=" + heightinfeet +
                ", weightinfeet=" + weightinfeet +
                ", animalType='" + animalType + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                '}';
    }
}
