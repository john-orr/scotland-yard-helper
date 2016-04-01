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
    _13(13, Arrays.asList(4, 23, 24), Arrays.asList(14, 23, 25), Arrays.asList(46, 67, 89)),
    _14(14, Arrays.asList(15, 25), Arrays.asList(13, 15, 52)),
    _15(15, Arrays.asList(5, 14, 16, 26, 28), Arrays.asList(14, 29, 41)),
    _16(16, Arrays.asList(5, 15, 28, 29)),
    _17(17, Arrays.asList(7, 29, 30)),
    _18(18, Arrays.asList(8, 31, 43)),
    _19(19, Arrays.asList(8, 9, 32)),
    _20(20, Arrays.asList(2, 9, 33)),
    _21(21, Arrays.asList(10, 33)),
    _22(22, Arrays.asList(11, 23, 34, 35), Arrays.asList(3, 23, 34, 65)),
    _23(23, Arrays.asList(12, 13, 22, 37), Arrays.asList(3, 13, 22, 67)),
    _24(24, Arrays.asList(13, 37, 38)),
    _25(25, Arrays.asList(14, 38, 39)),
    _26(26, Arrays.asList(15, 27, 39)),
    _27(27, Arrays.asList(26, 28, 40)),
    _28(28, Arrays.asList(15, 16, 27, 41)),
    _29(29, Arrays.asList(6, 16, 17, 41, 42), Arrays.asList(15, 41, 42, 55)),
    _30(30, Arrays.asList(17, 42)),
    _31(31, Arrays.asList(18, 43, 44)),
    _32(32, Arrays.asList(19, 33, 44, 45)),
    _33(33, Arrays.asList(20, 21, 32, 46)),
    _34(34, Arrays.asList(10, 22, 47, 48), Arrays.asList(22, 46, 63)),
    _35(35, Arrays.asList(22, 36, 48, 65)),
    _36(36, Arrays.asList(35, 37, 49)),
    _37(37, Arrays.asList(23, 24, 36, 50)),
    _38(38, Arrays.asList(24, 25, 50, 51)),
    _39(39, Arrays.asList(25, 26, 51, 52)),
    _40(40, Arrays.asList(27, 41, 52, 53)),
    _41(41, Arrays.asList(28, 29, 40, 54), Arrays.asList(15, 29, 52, 87)),
    _42(42, Arrays.asList(29, 30, 56, 72), Arrays.asList(7, 29, 72)),
    _43(43, Arrays.asList(18, 31, 57)),
    _44(44, Arrays.asList(31, 32, 58)),
    _45(45, Arrays.asList(32, 46, 58, 59, 60)),
    _46(46, Arrays.asList(33, 45, 47, 61), Arrays.asList(1, 34, 58, 78), Arrays.asList(1, 13, 74, 79)),
    _47(47, Arrays.asList(34, 46, 62)),
    _48(48, Arrays.asList(34, 35, 62, 63)),
    _49(49, Arrays.asList(36, 50, 66)),
    _50(50, Arrays.asList(37, 38, 49)),
    _51(51, Arrays.asList(38, 39, 52, 67, 68)),
    _52(52, Arrays.asList(39, 40, 51, 69), Arrays.asList(14, 41, 67, 86)),
    _53(53, Arrays.asList(40, 54, 69)),
    _54(54, Arrays.asList(41, 53, 55, 70)),
    _55(55, Arrays.asList(54, 71), Arrays.asList(29, 89)),
    _56(56, Arrays.asList(42, 91)),
    _57(57, Arrays.asList(43, 58, 73)),
    _58(58, Arrays.asList(44, 45, 57, 59, 74, 75), Arrays.asList(1, 46, 74, 77)),
    _59(59, Arrays.asList(45, 58, 75, 76)),
    _60(60, Arrays.asList(45, 61, 76)),
    _61(61, Arrays.asList(46, 60, 62, 76, 78)),
    _62(62, Arrays.asList(47, 48, 61, 79)),
    _63(63, Arrays.asList(48, 64, 79, 80), Arrays.asList(34, 65, 79, 100)),
    _64(64, Arrays.asList(63, 65, 81)),
    _65(65, Arrays.asList(35, 64, 66, 82), Arrays.asList(22, 63, 67, 82)),
    _66(66, Arrays.asList(49, 65, 67, 82)),
    _67(67, Arrays.asList(51, 66, 68, 84), Arrays.asList(23, 52, 65, 82, 102), Arrays.asList(13, 79, 89, 111)),
    _68(68, Arrays.asList(51, 67, 69, 85)),
    _69(69, Arrays.asList(52, 53, 68, 86)),
    _70(70, Arrays.asList(54, 71, 87)),
    _71(71, Arrays.asList(55, 70, 72, 89)),
    _72(72, Arrays.asList(42, 71, 90, 91), Arrays.asList(42, 105, 107)),
    _73(73, Arrays.asList(57, 74, 92)),
    _74(74, Arrays.asList(58, 73, 75, 92), Arrays.asList(58, 94), Collections.singletonList(46)),
    _75(75, Arrays.asList(58, 59, 74, 94)),
    _76(76, Arrays.asList(59, 60, 61, 77)),
    _77(77, Arrays.asList(76, 78, 95, 96), Arrays.asList(58, 78, 94, 124)),
    _78(78, Arrays.asList(61, 77, 79, 97), Arrays.asList(46, 77, 79)),
    _79(79, Arrays.asList(62, 63, 78, 98), Arrays.asList(63, 78), Arrays.asList(46, 67, 93, 111)),
    _80(80, Arrays.asList(63, 99, 100)),
    _81(81, Arrays.asList(64, 82, 100)),
    _82(82, Arrays.asList(65, 66, 81, 101), Arrays.asList(65, 67, 100, 140)),
    _83(83, Arrays.asList(101, 102)),
    _84(84, Arrays.asList(67, 85)),
    _85(85, Arrays.asList(68, 84, 103)),
    _86(86, Arrays.asList(69, 103, 104), Arrays.asList(52, 87, 102, 116)),
    _87(87, Arrays.asList(70, 88), Arrays.asList(41, 86, 105)),
    _88(88, Arrays.asList(87, 89, 117)),
    _89(89, Arrays.asList(71, 88, 105), Arrays.asList(55, 105), Arrays.asList(13, 67, 128, 140)),
    _90(90, Arrays.asList(72, 91, 105)),
    _91(91, Arrays.asList(56, 72, 90, 105, 107)),
    _92(92, Arrays.asList(73, 74, 93)),
    _93(93, Arrays.asList(92, 94), Arrays.asList(94), Arrays.asList(79));

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
