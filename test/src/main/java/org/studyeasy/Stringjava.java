package org.studyeasy;

import java.util.Scanner;

public class Stringjava {
    public static void main(String[] args) {
        String name = new String("Rishabh");
//        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your caste");
        String caste = sc.next();
        System.out.println(name+" caste is "+caste );

      /*  String name ="harry";
        int count = name.length();//name.length() (to find the length of the string.)
        System.out.println(count);

        String weight = "OVERWEIGHTED";
        String lString = weight.toLowerCase();//weight.toLowerCase() (to convert uppercase string literals to lowercase.)
        System.out.println(lString);

        String Height ="6feettall";
        String uString =Height.toUpperCase();//Height.toUpperCase() (to convert lowercase string literals to uppercase.)
        System.out.println(uString);

        String NonTrimmedString ="    HARRY    ";//NonTrimmedString.trim() (to trim the string and gives the trimmed output.)
        String TrimmedString = NonTrimmedString.trim();
        System.out.println(TrimmedString);

        String friend ="JAGDISH";//friend.substring(starting index , closing index)(it cann be done by both only starting index or by both the indexes)
        String sString = friend.substring(0,7);
        System.out.println(sString);

        String dost ="rishabh";//dost.replace('oldchar' , 'newchar') (it replaces the oldchar from the string into newchar given ,this method also replaces the
        // string to a new string.)
        System.out.println(dost.replace('a','i'));
        System.out.println(dost.replace("abh","u baby"));

        System.out.println(name.startsWith("ha"));//name.startwith("ha") (returns true or false [boolean] if name starts with String
       // "ha" or not, true in this case.

        System.out.println(name.endsWith("ri"));//name.endwith("ri") (returns true or false [boolean] if name ends with String
        // "ri" or not, false in this case.

        System.out.println(name.charAt(4));//name.cahrat(indexno.) (returns the char literal of their indexno.)

        System.out.println(name.indexOf('r'));//name.indexof('char') (returns the index of the char literal, it returns the index of first occurence.)

        System.out.println(name.indexOf('r',3));// you can also give the starting point or formindex in the name.indexof() METHOD.

        System.out.println(name.lastIndexOf('r',2));

        System.out.println(name.equals("harry"));//gives true when the given string is equals to the "harry".in this case it is true
        //it is also case sensetive.


        System.out.println(name.equalsIgnoreCase("HArRy"));//it is similar to as name.equals() but it is not case sensetive.
*/

    }
}
