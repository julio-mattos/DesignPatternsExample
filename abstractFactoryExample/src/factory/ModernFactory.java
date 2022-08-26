package factory;

import chair.Chair;
import chair.ModernChair;
import factory.FurnitureFactory;
import sofa.ModernSofa;
import sofa.Sofa;
import table.ModernTable;
import table.Table;

public class ModernFactory implements FurnitureFactory {

    @Override
    public Chair orderChair() {
        return new ModernChair();
    }

    @Override
    public Sofa orderSofa() {
        return new ModernSofa();
    }

    @Override
    public Table orderTable() {
        return new ModernTable();
    }
}
