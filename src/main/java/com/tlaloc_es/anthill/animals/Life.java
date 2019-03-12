package com.tlaloc_es.anthill.animals;

import com.tlaloc_es.anthill.food.Food;
import com.tlaloc_es.anthill.world.Locatable2D;

public abstract class Life extends Locatable2D {
    private float life;
    private float hydration;
    private float nutrients;

    public abstract void eat(Food food);
    
    public float getLife() {
        return life;
    }

    public void setLife(float life) {
        this.life = life;
    }

    protected float getHydration() {
        return hydration;
    }

    protected void setHydration(float hydration) {
        this.hydration = hydration;
    }

    protected float getNutrients() {
        return nutrients;
    }

    protected void setNutrients(float nutrients) {
        this.nutrients = nutrients;
    }
    
    protected abstract void onBirth();
    protected abstract void onDead();
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + getPosition().toString();
    }

}
