package com.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YouthfulDrake on 31/03/2016.
 */
public class GameState {

    private Location startingLocation;
    private List<Move> moves;
    private List<Route> possibleRoutes;
    private Route currentRoute;

    public GameState(Location startingLocation, List<Move> moves) {
        this.startingLocation = startingLocation;
        this.moves = moves;
        possibleRoutes = new ArrayList<>();
    }

    public void playOut() {
        currentRoute = new Route();
        travel(startingLocation, moves, 0);
    }

    private void travel(Location currentLocation, List<Move> moves, int moveNum) {
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
            travel(nextLocation, moves, moveNum + 1);
        }
        currentRoute.removeLastStop();
    }

    public void printResult() {
        if (possibleRoutes.isEmpty()) {
            System.out.println("No possible routes");
        } else {
            for (Route route : possibleRoutes) {
                System.out.println(route);
            }
        }
    }
}
