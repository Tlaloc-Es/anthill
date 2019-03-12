package com.tlaloc_es.anthill.animals;

import com.tlaloc_es.anthill.food.Food;
import com.tlaloc_es.anthill.math.Vector2D;
import com.tlaloc_es.anthill.world.Collisionable2D;
import com.tlaloc_es.anthill.world.Movible;

public class Ant extends Life implements Collisionable2D, Movible{

    private Ant(Vector2D vector2d) {
        setPosition(vector2d);
    }

    public static Ant getAntAt(double x, double y) {
        return new Ant(new Vector2D(x, y));
    }

    public static Ant getAntAt(Vector2D position) {
        return new Ant(position);
    }
    
    @Override
    public void moveTo(double direction) {
        this.setX(getX() + (getStepSize() * Math.cos(direction)));
        this.setY(getY() + (getStepSize() * Math.sin(direction)));
    }

    @Override
    public void move() {
        this.setX(getX() + (getStepSize() * Math.cos(getDirection())));
        this.setY(getY() + (getStepSize() * Math.sin(getDirection())));
    }

    @Override
    public void eat(Food food) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void onBirth() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void onDead() {
        // TODO Auto-generated method stub
        
    }

}
