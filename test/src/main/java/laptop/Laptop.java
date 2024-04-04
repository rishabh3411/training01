package laptop;

import components.GraphicsCard;
import components.processor;

public class Laptop {
    private float screen;
    private processor processor;
    private String ram;
    private String harddrive;
    private GraphicsCard GraphicsCard;
    private String opticalDrive;
    private String Keyboard;

    public Laptop(){
        screen = 15.f;
        processor = new processor();
        ram ="16 GB";
        harddrive = "2 TB";
        GraphicsCard = new GraphicsCard();
        opticalDrive = "Multilayer";
        Keyboard = "backlit";
    }

    public Laptop(float screen, processor processor, String ram, String harddrive, GraphicsCard graphicsCard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.harddrive = harddrive;
        GraphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        Keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", harddrive='" + harddrive + '\'' +
                ", GraphicsCard=" + GraphicsCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", Keyboard='" + Keyboard + '\'' +
                '}';
    }
}
