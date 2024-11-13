package org.example.transport;

import org.example.Color;
import org.example.engine.Engine;
import org.example.fuel.Fuel;

public class Plane extends Transport {

    public Plane(Color color, Engine engine, Fuel fuel) {
        super(color, engine, fuel);
        this.type = "Самолет";
    }
}
