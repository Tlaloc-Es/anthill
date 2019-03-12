package com.tlaloc_es.anthill.world;

import java.util.ArrayList;

import com.tlaloc_es.anthill.math.Vector2D;

public class World {
    private static final World INSTANCE = new World();
    public static final Vector2D ORIGIN = new Vector2D(0, 0);
    private ArrayList<Locatable2D> objectsInMap;

    private World() {
        objectsInMap = new ArrayList<Locatable2D>();
    }

    public static World getInstance() {
        return INSTANCE;
    }

    public void add(Locatable2D locatable2d) {
        objectsInMap.add(locatable2d);
    }

    private void sort() {
        objectsInMap.sort(new SortLocatable2DByPosition());
    }
}
