package com.tlaloc_es.anthill.world;

import static com.tlaloc_es.anthill.world.World.ORIGIN;

import com.tlaloc_es.anthill.math.Vector2D;

public abstract class Locatable2D implements Comparable<Locatable2D> {
    private Vector2D position;

    public double getX() {
        return position.getX();
    }

    public void setX(double x) {
        position.setX(x);
    }

    public double getY() {
        return position.getY();
    }

    public void setY(double y) {
        position.setY(y);
    }

    public double getDirection() {
    	return this.position.getDirection();
    }
    
    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public Vector2D getPosition() {
        return position;
    }

    public Vector2D toVector() {
        return position;
    }

    public double distanceFrom(Vector2D position) {
        return getPosition().distanceFrom(position);
    }

    public double distanceFrom(Locatable2D locatable) {
        return distanceFrom(locatable.toVector());
    }

    public double distanceFrom(double x, double y) {
        return distanceFrom(new Vector2D(x, y));
    }

    public int compareTo(Locatable2D locatable2d) {
        int returnValue = 0;

        double currentDistance = distanceFrom(ORIGIN);
        double locatableDistance = locatable2d.distanceFrom(ORIGIN);

        if (currentDistance > locatableDistance) {
            returnValue = 1;
        } else if (currentDistance == locatableDistance) {
            returnValue = 0;
        } else if (currentDistance < locatableDistance) {
            returnValue = -1;
        }

        return returnValue;
    }

}
