import components.GraphicsCard;
import components.processor;
import laptop.Laptop;
/*Composition coding
Having many components for processor and graphicscard .so,composition is used there.
using of parameterized constructors for processor and Graphicscard component of class laptop.
 */
public class Main {
    public static void main(String[]args){
        Laptop laptop =new Laptop();
        System.out.println(laptop);
        System.out.println(laptop.getProcessor().getBrand());
        processor p1 = new processor();
        GraphicsCard g1 = new GraphicsCard();

        Laptop l1 = new Laptop(15.6f,p1,"16 GB","2 TB",g1,"multilayer","backlit");
        System.out.println(l1);
    }
}
