package org.studyeasy.bird;
/* It is a code of Hierarchical inheritance .
It has a class named Animal and three more classes named follows Reptile,Fish,Bird which are inherited by animal class.
Again there are three more class which are inherited or extends by these second level inherited class or inherited class
they are crocodile class which is inherited by reptile ,Eel class which is inherited by Fish and the last one is Eagle
class which is inherited by Bird.
 */
public class Eagle extends Bird {
    @Override
    public String toString() {
        return "Eagle{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                ", heightinfeet=" + heightinfeet +
                ", weightinfeet=" + weightinfeet +
                ", animalType='" + animalType + '\'' +
                ", bloodtype='" + bloodtype + '\'' +
                '}';
    }
}
