public class Toyotacars {

NonStaticinner nonStaticinner = new NonStaticinner();



    public static class brand{
        public static String  brandname="TOYOTA";

        public static void tagline(){
        System.out.println("Let's go places");
        }
    }

    public class NonStaticinner{
        public void model(String model){
            System.out.println("Make of the car :"+model);
        }

        public NonStaticinner getNonStaticinner() {
            return nonStaticinner;
        }
        }
    }

