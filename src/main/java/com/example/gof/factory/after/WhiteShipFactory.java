package com.example.gof.factory.after;

import com.example.gof.factory.before.Ship;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public com.example.gof.factory.after.Ship createShip() {
        return new WhiteShip();
    }

}
