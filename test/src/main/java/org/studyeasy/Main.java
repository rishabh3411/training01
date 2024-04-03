package org.studyeasy;

import org.studyeasy.animal.Animal;
import org.studyeasy.bird.Bird;
import org.studyeasy.bird.Eagle;
import org.studyeasy.fish.Eel;
import org.studyeasy.fish.Fish;
import org.studyeasy.reptile.Crocodile;
import org.studyeasy.reptile.Reptile;

public class Main {
    public static void main(String[] args) {
        Animal animal =new Animal();
       System.out.println(animal.toString());
       Reptile reptile =new Reptile();
       System.out.println(reptile.toString());
       Crocodile crocodile =new Crocodile();
       System.out.println(crocodile.toString());
       Bird bird = new Bird();
       System.out.println(bird.toString());
       Eagle eagle = new Eagle();
       System.out.println(eagle.toString());
       Fish fish = new Fish();
       System.out.println(fish.toString());
       Eel eel=new Eel();
       System.out.println(eel.toString());
    }
}