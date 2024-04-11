import org.studyeasy.Iphone;
import org.studyeasy.Samsungphone;
import org.studyeasy.phone;

public class Main {
    public static void main(String[]args){
        Samsungphone phone1 = new Samsungphone();
        String p =phone1.processor();
            System.out.println(p);
        System.out.println(phone1.SpaceInGb());
        System.out.println(phone1.whatsapp());


        Iphone phone2 = new Iphone();
        String s;
        s = phone2.processor();
        System.out.println(s);
        System.out.println(phone2.SpaceInGb());
        System.out.println(phone2.Airdrop());
        System.out.println(phone2.processor());

        }
    }

