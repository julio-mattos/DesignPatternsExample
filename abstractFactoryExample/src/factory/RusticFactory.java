package factory;

import chair.Chair;
import chair.RusticChair;
import factory.FurnitureFactory;
import sofa.RusticSofa;
import sofa.Sofa;
import table.RusticTable;
import table.Table;

public class RusticFactory implements FurnitureFactory {
    @Override
    public Chair orderChair() {
        return new RusticChair();
    }

    @Override
    public Sofa orderSofa() {
        return new RusticSofa();
    }

    @Override
    public Table orderTable() {
        return new RusticTable();
    }
}
