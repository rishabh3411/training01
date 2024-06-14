public class Main {
    public static void main(String[]args){

        System.out.println("staticvar = "+TestStatic.getStaticvar());
        TestStatic.setStaticvar(25);
        System.out.println("staticvar = "+TestStatic.getStaticvar());


        System.out.println("staticvar = "+TestStatic.getStaticvar());
        TestStatic.setStaticvar(12);
        System.out.println("staticvar = "+TestStatic.getStaticvar());


        System.out.println("obj3 staticvar = "+TestStatic.getStaticvar());
    }
}
