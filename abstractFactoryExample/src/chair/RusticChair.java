package chair;

import chair.Chair;

public class RusticChair implements Chair {

    @Override
    public void orderChair() {
        System.out.println("You have order a rustic chair!");
    }
}
