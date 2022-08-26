package factory;

import chair.Chair;
import chair.SimpleChair;
import factory.FurnitureFactory;
import sofa.SimpleSofa;
import sofa.Sofa;
import table.SimpleTable;
import table.Table;

public class SimpleFactory implements FurnitureFactory {
    @Override
    public Chair orderChair() {
        return new SimpleChair();
    }

    @Override
    public Sofa orderSofa() {
        return new SimpleSofa();
    }

    @Override
    public Table orderTable() {
        return new SimpleTable();
    }
}
