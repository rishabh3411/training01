import org.studyeasy.person;

public class Main {
    public static void main(String[]args){
        person person = new person("Rishabh",50,"male");
        System.out.println(person);
        person.setName("Rishu");
        System.out.println(person);
        person.setAge(149.5);
        System.out.println(person);
    }
}
