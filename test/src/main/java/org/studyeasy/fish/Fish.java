package org.studyeasy.fish;

import org.studyeasy.animal.Animal;

public class Fish extends Animal {
     protected boolean WaterBone;
     protected boolean gills;

     public Fish(){
         heightinfeet = 5;
         weightinfeet = 20;
         animalType ="Fish";
         bloodtype ="cold";
         this.WaterBone = true;
         this.gills = true;
     }

    @Override
    public String toString() {
        return "Fish{" +
                "waterbone=" + WaterBone +
                ", gills=" + gills +
                ", heightinfeet=" + heightinfeet +
                ", weightinfeet=" + weightinfeet +
                ", animalType='" + animalType + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                '}';
    }
}
