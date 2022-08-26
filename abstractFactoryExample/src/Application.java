import chair.Chair;
import factory.FurnitureFactory;
import sofa.Sofa;
import table.Table;

public class Application {

    private Chair chair;
    private Sofa sofa;
    private Table table;

    public Application(FurnitureFactory factory){
        chair = factory.orderChair();
        sofa = factory.orderSofa();
        table = factory.orderTable();
    }

    public void orderFurnitune(){
        chair.orderChair();
        sofa.orderSofa();
        table.orderTable();
    }
}
