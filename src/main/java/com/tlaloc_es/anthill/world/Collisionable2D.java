package com.tlaloc_es.anthill.world;

import com.tlaloc_es.anthill.math.Vector2D;

public interface Collisionable2D {
    public Vector2D getPosition();
    
    public double getX();

    public double getY();

    default public boolean isColliding(Collisionable2D collisionable2D) {
        return getPosition().distanceFrom(collisionable2D.getPosition()) == 0;
    }
}
