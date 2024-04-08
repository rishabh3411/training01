import org.studyeasy.person;

public class Main {
    public static void main(String[]args){
        person calling =new person("rishu",19,"male");
        System.out.println(calling);
        calling.setName("mickey");
        System.out.println(calling);
        calling.setAge(111);
        System.out.println(calling);
        calling.setName("mickey");
        System.out.println(calling);
       calling.setGender("female");
        System.out.println(calling);
    }
}
