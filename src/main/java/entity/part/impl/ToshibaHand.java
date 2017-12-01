package entity.part.impl;

import entity.part.Hand;

public class ToshibaHand implements Hand{
    @Override
    public void catchSomething() {
        System.out.println("Catched from Toshiba");
    }
}
