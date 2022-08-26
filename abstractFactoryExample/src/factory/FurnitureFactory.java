package factory;

import chair.Chair;
import sofa.Sofa;
import table.Table;

public interface FurnitureFactory {
    Chair orderChair();
    Sofa orderSofa();
    Table orderTable();
}
