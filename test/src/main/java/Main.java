import org.studyeasy.cersielannister;
import org.studyeasy.jonsnow;
import org.studyeasy.person;

public class Main {
    public static void main(String[]args){
        person jonsnow = new jonsnow();
        jonsnow.eat();
        jonsnow.speak();

        person person =new cersielannister();
        person.eat();
        person.speak();

        person p1 = new person() {
            @Override
            public void eat() {
                System.out.println("want to rule the world and also marry her");
            }
        };
        p1.eat();
        p1.speak();
            }
}
