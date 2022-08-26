import factory.FurnitureFactory;
import factory.ModernFactory;
import factory.RusticFactory;
import factory.SimpleFactory;

public class app {

    public static void main(String[] args) {

        FurnitureFactory simpleFactory = new SimpleFactory();
        FurnitureFactory modernFactory = new ModernFactory();
        FurnitureFactory rusticFactory = new RusticFactory();


        Application simpleApp = new Application(simpleFactory);
        Application modernApp = new Application(modernFactory);
        Application rusticApp = new Application(rusticFactory);

        simpleApp.orderFurnitune();
        modernApp.orderFurnitune();
        rusticApp.orderFurnitune();
    }
}
