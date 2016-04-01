package com.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by YouthfulDrake on 31/03/2016.
 */
public enum Location {

    /*_1(1, Arrays.asList(2, 6), Arrays.asList(3, 5), Collections.singletonList(4)),
    _2(2, Arrays.asList(1, 3)),
    _3(3, Arrays.asList(2, 4), Arrays.asList(1, 5)),
    _4(4, Arrays.asList(3, 5), Collections.singletonList(1)),
    _5(5, Arrays.asList(4, 6), Arrays.asList(1, 3)),
    _6(6, Arrays.asList(5, 1));*/

    _1(1, Arrays.asList(8, 9), Arrays.asList(46, 58), Collections.singletonList(46)),
    _2(2, Arrays.asList(10, 20)),
    _3(3, Arrays.asList(4, 11, 12), Arrays.asList(22, 23)),
    _4(4, Arrays.asList(3, 13)),
    _5(5, Arrays.asList(15, 16)),
    _6(6, Arrays.asList(7, 29)),
    _7(7, Arrays.asList(6, 17), Collections.singletonList(42)),
    _8(8, Arrays.asList(1, 18, 19)),
    _9(9, Arrays.asList(1, 19, 20)),
    _10(10, Arrays.asList(2, 11, 21, 34)),
    _11(11, Arrays.asList(3, 10, 22)),
    _12(12, Arrays.asList(3, 23)),
    _13(13, Arrays.asList(4, 23, 24), Arrays.asList(14, 23, 25), Arrays.asList(46, 89)),
    _14(14, Arrays.asList(15, 25), Arrays.asList(13, 15)),
    _15(15, Arrays.asList(5, 14, 16, 26, 28));
    //_16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _27, _28, _29, _30, _31, _32, _33, _34, _35, _36, _37, _38, _39, _40, _41, _42, _43, _44, _45, _46, _47, _48, _49, _50, _51, _52, _53, _54, _55, _56, _57, _58, _59, _60, _61, _62, _63, _64, _65, _66, _67, _68, _69, _70, _71, _72, _73, _74, _75, _76, _77, _78, _79, _80, _81, _82, _83, _84, _85, _86, _87, _88, _89, _90, _91, _92, _93, _94, _95, _96, _97, _98, _99, _100, _101, _102, _103, _104, _105, _106, _107, _108, _109, _110, _111, _112, _113, _114, _115, _116, _117, _118, _119, _120, _121, _122, _123, _124, _125, _126, _127, _128, _129, _130, _131, _132, _133, _134, _135, _136, _137, _138, _139, _140, _141, _142, _143, _144, _145, _146, _147, _148, _149, _150, _151, _152, _153, _154, _155, _156, _157, _158, _159, _160, _161, _162, _163, _164, _165, _166, _167, _168, _169, _170, _171, _172, _173, _174, _175, _176, _177, _178, _179, _180, _181, _182, _183, _184, _185, _186, _187, _188, _189, _190, _191, _192, _193, _194, _195, _196, _197, _198, _199;

    private int numVal;
    private List<Integer> taxiMoves;
    private List<Integer> busMoves;
    private List<Integer> undergroundMoves;

    @SafeVarargs
    Location(int numVal, List<Integer>... possibleNextLocations) {
        this.numVal = numVal;
        taxiMoves = possibleNextLocations.length > 0 ? possibleNextLocations[0] : new ArrayList<Integer>();
        busMoves = possibleNextLocations.length > 1 ? possibleNextLocations[1] : new ArrayList<Integer>();
        undergroundMoves = possibleNextLocations.length > 2 ? possibleNextLocations[2] : new ArrayList<Integer>();
    }

    public static Location findByValue(Integer integer) {
        for (Location location : Location.values()) {
            if (location.numVal == integer) {
                return location;
            }
        }
        throw new IllegalStateException(String.format("%d is not a Location", integer));
    }

    public List<Location> move(Move move) {
        List<Integer> integerLocationList;
        switch (move) {
            default:
            case TAXI:
                integerLocationList = taxiMoves;
                break;
            case BUS:
                integerLocationList = busMoves;
                break;
            case UNDERGROUND:
                integerLocationList = undergroundMoves;
                break;
        }
        return convertToLocationList(integerLocationList);
    }

    private List<Location> convertToLocationList(List<Integer> integerLocationList) {
        List<Location> locationList = new ArrayList<>();
        for (Integer integer : integerLocationList) {
            locationList.add(findByValue(integer));
        }
        return locationList;
    }

    @Override
    public String toString() {
        return String.valueOf(numVal);
    }
}
