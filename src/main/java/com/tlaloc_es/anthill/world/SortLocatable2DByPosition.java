package com.tlaloc_es.anthill.world;

import java.util.Comparator;

public class SortLocatable2DByPosition implements Comparator<Locatable2D> {

    @Override
    public int compare(Locatable2D locatable2d1, Locatable2D locatable2d2) {
        return locatable2d1.compareTo(locatable2d2);
    }

}
