package org.studyeasy;

public class practiceSetStrings_03 {
    public static void main(String[] args) {

    //Question 1 (practice set)

    String name = "RISHABH";
    String lstring =name.toLowerCase();
        System.out.println(lstring);

    //Question 2 (practice set)

    String space = "R I S H A B H";
    String underscore =space.replace(' ','_');
        System.out.println(underscore);

    //Question 3 (practice set)

    String letter ="Dear vks thanks a lot";
        System.out.println(letter);
    String replace =letter.replace("vks","Rishabh");
        System.out.println(replace);

    //Question 4 (practice set)

    String dtspace = "this string  contains  double and triple strings.";
        System.out.println( dtspace.indexOf("  "));
        System.out.println( dtspace.indexOf("   "));

    //Question 5 (practice set)

    String escape = "Dear Harry,\nThis java course is nice.\n\tThanks";
        System.out.println(escape);
    }
}
