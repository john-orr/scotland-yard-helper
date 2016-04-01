package com.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YouthfulDrake on 31/03/2016.
 */
public class Route {

    List<Location> stops;

    public Route() {
        stops = new ArrayList<>();
    }

    public Route(Route source) {
        this();
        for (Location location : source.stops) {
            stops.add(location);
        }
    }

    private Location getFinalPosition() {
        return stops.get(stops.size() - 1);
    }

    public void addStop(Location location) {
        stops.add(location);
    }

    public void removeLastStop() {
        stops.remove(stops.size() - 1);
    }

    @Override
    public String toString() {
        if (stops.isEmpty()) {
            return "Empty route";
        }
        StringBuilder stringBuilder = new StringBuilder(getFinalPosition().toString()).append(": ");
        for (int i = 0; i < stops.size(); i++) {
            stringBuilder.append(stops.get(i));
            if (i != stops.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
