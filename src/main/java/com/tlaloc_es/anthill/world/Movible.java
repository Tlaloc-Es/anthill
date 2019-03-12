package com.tlaloc_es.anthill.world;

public interface Movible {
    public void moveTo(double direction);

    public void move();
    
    default public double getStepSize() {
        return 1;
    }
}
