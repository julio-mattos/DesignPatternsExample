package chair;

import chair.Chair;

public class SimpleChair implements Chair {

    @Override
    public void orderChair() {
        System.out.println("You have order a simple chair!");
    }
}
