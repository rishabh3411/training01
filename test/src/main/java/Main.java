public class Main {
    public static void main(String []args) {
        System.out.println(Toyotacars.brand.brandname);
        Toyotacars.brand.tagline();

        Toyotacars toyotacars = new Toyotacars();
        toyotacars.nonStaticinner.model("FORTUNER");
    }

}
