package entity.part.impl;

import entity.part.Hand;

public class SonyHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Catched from Sony");
    }


}
