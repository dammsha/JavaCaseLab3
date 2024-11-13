package org.example.transport;

import org.example.Color;
import org.example.engine.Engine;
import org.example.fuel.Fuel;

public class Car extends Transport{

    public Car(Color color, Engine engine, Fuel fuel) {
        super(color, engine, fuel);
        this.type = "Машина";
    }
}
