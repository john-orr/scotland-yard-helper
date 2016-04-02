package com.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by YouthfulDrake on 31/03/2016.
 */
public class Tracker {

    private static List<Route> possibleRoutes;
    private static Route currentRoute;

    public static void track(Location startingLocation, List<Move> moves) {
        possibleRoutes = new ArrayList<>();
        currentRoute = new Route();
        findPossibleRoutes(startingLocation, moves, 0);
        printResult();
    }

    private static void findPossibleRoutes(Location currentLocation, List<Move> moves, int moveNum) {
        currentRoute.addStop(currentLocation);
        if (moveNum == moves.size()) {
            // Route is complete
            possibleRoutes.add(currentRoute);
            currentRoute = new Route(currentRoute);
            currentRoute.removeLastStop();
            return;
        }
        List<Location> nextLocations = currentLocation.move(moves.get(moveNum));
        if (nextLocations.isEmpty()) {
            // Route cannot complete
            currentRoute.removeLastStop();
            return;
        }
        for (Location nextLocation : nextLocations) {
            findPossibleRoutes(nextLocation, moves, moveNum + 1);
        }
        currentRoute.removeLastStop();
    }

    public static void printResult() {
        if (possibleRoutes.isEmpty()) {
            System.out.println("No possible routes");
        } else {
            Collections.sort(possibleRoutes);
            Location prevLocation = null;
            int locationCount = 0;
            for (Route route : possibleRoutes) {
                if (!route.getFinalPosition().equals(prevLocation)) {
                    locationCount++;
                    prevLocation = route.getFinalPosition();
                }
                System.out.println(route);
            }
            System.out.println(String.format("%d possible locations", locationCount));
        }
    }
}
