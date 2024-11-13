package org.example.engine;

public abstract sealed class Engine permits PetrolEngine, DieselEngine, BioFuelEngine {

    protected String type;

    protected Engine() {
        this.type = "";
    }

    public String getType() {
        return type;
    }

}
