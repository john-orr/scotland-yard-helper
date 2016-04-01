package com.dev;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        args = new String[] {"1", "U", "T", "B", "U"};
        if (args.length < 2) {
            throw new IllegalArgumentException("You must supply a starting position and at least one move");
        }
        
        Location startingLocation;
        try {
            startingLocation = Location.findByValue(Integer.parseInt(args[0]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Starting position is not a valid number");
        }

        List<Move> moves = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            moves.add(Move.findByVal(args[i]));
        }

        GameState gameState = new GameState(startingLocation, moves);
        gameState.playOut();
        gameState.printResult();
    }
}
