package com.dev;

/**
 * Created by YouthfulDrake on 31/03/2016.
 */
public enum Move {

    TAXI("T"),
    BUS("B"),
    UNDERGROUND("U"),
    BLACK("X");

    private String val;

    Move(String val) {
        this.val = val;
    }

    public static Move findByVal(String val) {
        for (Move move : Move.values()) {
            if (move.val.equals(val)) {
                return move;
            }
        }
        throw new IllegalArgumentException(String.format("%s is not a valid move", val));
    }
}
