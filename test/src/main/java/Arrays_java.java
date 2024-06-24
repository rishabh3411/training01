public class Arrays_java {
    public static void main(String[] args) {
        /*
        classroom of 500 students-you have to store marks of 500 students
        you have two options
        1.) create 500 variables
        2.) use arrays(recommended)
         */
        /*
        //1st way - (declaration + memory allocation) declaration and memory allocation

        int[]marks = new int[5];
        //(initialization)
        marks[0] = 90;
        marks[1] = 95;
        marks[2] = 56;
        marks[3] = 65;
        marks[4] = 58;
        marks[4] = 85;
        System.out.println(marks[4]);
        */

       /*
       //2nd way -(declaration before memory allocation) declaration and then memory allocation
        int[]marks;
        //(initialization)
        marks =new int[5];
        marks[0] = 90;
        marks[1] = 95;
        marks[2] = 56;
        marks[3] = 65;
        marks[4] = 58;
        marks[4] = 85;
        System.out.println(marks[4]);
       */


        //3rd way -(declaration + initialization) declaration memory allocation and initialization together
        //int[]marks = {92,45,65,85,74};
          //float[]marks={92.f,45.5f,65.5f,85.5f,74.5f};
       // System.out.println(marks.length); // (variable.length - is used to get the no. of data present in the string)
       // System.out.println(marks[0]);
//          String[]names = {"Rishabh","shiva","tanishk","sinha","ashish"};
//        System.out.println(names[0]);
//        System.out.println(names.length);


        //Displaying of the ARRAY using NAIVE Way
        int[]markss = {45,58,96,85,74};
        System.out.println("Printing using NAIVE way");
        System.out.println(markss[0]);
        System.out.println(markss[1]);
        System.out.println(markss[2]);
        System.out.println(markss[3]);
        System.out.println(markss[4]);

        // Displaying of the ARRAY using for LOOP
        int[]marks = {45,58,96,85,74};
//        System.out.println("printing of array using for loop");
//        for (int i = 0 ; i<marks.length ; i++){
//            System.out.println(marks[i]);  // this process is known as array traversal.

        System.out.println("Printing the elements of the array in reversed order");
       for (int i = marks.length-1;i>=0;i--){
           System.out.println(marks[i]);
       }
       //For-Each loop in java
        System.out.println("printing of elements in a easy way using for each loop");
        for (int element:marks){
            System.out.println(element);
        }
    }

    }

