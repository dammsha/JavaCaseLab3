package org.example.transport;

import org.example.Color;
import org.example.engine.Engine;
import org.example.fuel.Fuel;

public abstract class Transport {

    String type;
    Color color;
    String engine;
    String fuel;


    public Transport(Color color, Engine engine, Fuel fuel) {
        this.type = "Транспорт";
        this.color = color;
        this.engine = engine.getType();
        this.fuel = fuel.getType();
    }

    public String getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel() {
        return fuel;
    }
}
