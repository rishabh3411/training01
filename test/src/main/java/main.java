public class main {
    public static void main(String []args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        Lock lock = new Lock();
        if (args[1].equals(new Lock().getCode())){
            System.out.println("door is locked");
            }else {
            System.out.println("door is not locked");
        }

    }
}
