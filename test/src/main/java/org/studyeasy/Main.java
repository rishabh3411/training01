package org.studyeasy;

import org.studyeasy.insect.Bee;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
        }
        Bee bee = new Bee(2,2,2,"millions","yes","slim");
        System.out.println(bee);
    }
}