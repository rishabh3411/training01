import jdk.swing.interop.LightweightContentWrapper;

public class door {
    public static void main(String[]args) {
        Lock lock = new Lock() {
            @Override
            public void isunlocked(String key) {
                if (key.equals("querty")) {
                    System.out.println("shop is open come here sir ;)");
                } else
                    System.out.println("sorry try after sometime");
                }
            };
            lock.isunlocked("01125532553");
        }
    }



