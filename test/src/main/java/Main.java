import org.studyeasy.Shop;
//The outer class has a by default access of accessing the private entities of the inner class.
public class Main {
    public static void main(String[]args){
        Shop shop = new Shop();
        shop.shopstatus();
      shop.getLock().setLocking(false);
      shop.shopstatus();
    }
}
