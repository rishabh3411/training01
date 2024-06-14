public class outer {
    public static class inner{
        public static int x =10;
        public static void staticmessage(){
            System.out.println("Hello Static");
        }
    }

    public class noninner{
        public void nonstaticmessage(){
            System.out.println("Hello non Static");
        }
    }
}
