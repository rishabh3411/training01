import java.util.Scanner;

public class practriceSetConditionals_04 {
    public static void main(String[] args) {

        //Question 1 (practice set)

        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }

        //Question 2 (practice set)

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of Accountancy :");
        int Accountancy = sc.nextInt();
        System.out.println("Enter your marks of BusinessStudies :");
        int BusinessStudies = sc.nextInt();
        System.out.println("Enter your marks of Economics :");
        int Economics = sc.nextInt();

        float avg = (Accountancy+BusinessStudies+Economics)/3.0f;
        System.out.println("your overall all percentage of all the subjects is " +avg);
        if (avg > 40 && Accountancy >= 33 && BusinessStudies >= 33 && Economics >= 33){
            System.out.println("student is passed");
        }else {
            System.out.println("student is failed");
        }
        */

        //Question 3 (practice set)
     /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income in lakhs:");
        float tax = 0 ;
        float income =sc.nextFloat();
        if (income<=2.5f){
            tax = tax + 0;
        }
        if (income > 2.5f && income <= 5.0f){
            tax = tax + 0.05f *(income - 2.5f);


        } else if (income > 5.0f && income <=10.0f) {
            tax = tax + 0.05f *(5.0f - 2.5f);
            tax =tax +0.2f *(income - 5.0f);


        } else if (income >10.0f) {
            tax = tax + 0.05f *(5.0f - 2.5f);
            tax =tax + 0.2f *(10.0f - 5.0f);
            tax = tax + 0.3f *(income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is "+tax);
      */

        //Question 4 (practice set)

       /* Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the index number of the days:");
        int x = sc.nextInt();
        switch (x){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
      */

        // Question 5
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of days of the year:");
        int year = sc.nextInt();
        if (year % 4 == 0){
            System.out.println("This is a leap year !");
        }else{
            System.out.println("This is not a leap year !");
        }

     */
      // Question 6:
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url of the website:");
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("This a commercial website.");
        } else if (website.endsWith(".org")){
            System.out.println("This is a Organization website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is a indian website");
        }
        else {
            System.out.println("It is not a website.");
        }

        */


    }
}