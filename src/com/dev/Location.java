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
    _93(93, Arrays.asList(92, 94), Collections.singletonList(94), Collections.singletonList(79)),
    _94(94, Arrays.asList(75, 93, 95), Arrays.asList(74, 77, 93)),
    _95(95, Arrays.asList(77, 94, 122)),
    _96(96, Arrays.asList(77, 97, 109)),
    _97(97, Arrays.asList(78, 96, 98, 109)),
    _98(98, Arrays.asList(79, 97, 99, 110)),
    _99(99, Arrays.asList(80, 98, 110, 112)),
    _100(100, Arrays.asList(80, 81, 101, 112, 113), Arrays.asList(63, 82, 111)),
    _101(101, Arrays.asList(82, 83, 100, 114)),
    _102(102, Arrays.asList(83, 103, 115), Arrays.asList(67, 86, 127)),
    _103(103, Arrays.asList(85, 86, 102)),
    _104(104, Arrays.asList(86, 116)),
    _105(105, Arrays.asList(89, 90, 91, 106, 108), Arrays.asList(72, 87, 89, 107, 108)),
    _106(106, Arrays.asList(105, 107)),
    _107(107, Arrays.asList(91, 106, 119), Arrays.asList(72, 105, 161)),
    _108(108, Arrays.asList(105, 117, 119), Arrays.asList(105, 116, 135)),
    _109(109, Arrays.asList(96, 97, 110, 124)),
    _110(110, Arrays.asList(98, 99, 109, 111)),
    _111(111, Arrays.asList(110, 112, 124), Arrays.asList(100, 124), Arrays.asList(67, 79, 153, 163)),
    _112(112, Arrays.asList(99, 100, 111, 125)),
    _113(113, Arrays.asList(100, 114, 125)),
    _114(114, Arrays.asList(101, 113, 115, 126, 131, 132)),
    _115(115, Arrays.asList(102, 114, 126, 127)),
    _116(116, Arrays.asList(104, 117, 118, 127), Arrays.asList(86, 108, 127, 142)),
    _117(117, Arrays.asList(88, 108, 116, 129)),
    _118(118, Arrays.asList(116, 129, 134, 142)),
    _119(119, Arrays.asList(107, 108, 136)),
    _120(120, Arrays.asList(121, 144)),
    _121(121, Arrays.asList(120, 122, 145)),
    _122(122, Arrays.asList(95, 121, 123, 146), Arrays.asList(123, 144)),
    _123(123, Arrays.asList(122, 124, 137, 148, 149), Arrays.asList(122, 124, 144, 165)),
    _124(124, Arrays.asList(109, 111, 123, 130, 138), Arrays.asList(77, 111, 123, 153)),
    _125(125, Arrays.asList(112, 113, 131)),
    _126(126, Arrays.asList(114, 115, 127, 140)),
    _127(127, Arrays.asList(115, 116, 126, 133, 134), Arrays.asList(102, 116, 133)),
    _128(128, Arrays.asList(142, 143, 160, 172, 188), Arrays.asList(135, 142, 161, 187, 199), Arrays.asList(89, 140, 185)),
    _129(129, Arrays.asList(117, 118, 135, 142, 143)),
    _130(130, Arrays.asList(124, 131, 139)),
    _131(131, Arrays.asList(114, 125, 130)),
    _132(132, Arrays.asList(114, 140)),
    _133(133, Arrays.asList(127, 140, 141), Arrays.asList(127, 140, 157)),
    _134(134, Arrays.asList(118, 127, 141, 142)),
    _135(135, Arrays.asList(129, 136, 143, 161), Arrays.asList(108, 128)),
    _136(136, Arrays.asList(119, 135, 162)),
    _137(137, Arrays.asList(123, 147)),
    _138(138, Arrays.asList(124, 150, 152)),
    _139(138, Arrays.asList(130, 140, 153, 154)),
    _140(140, Arrays.asList(126, 132, 133, 139, 154, 156), Arrays.asList(82, 133, 154, 156), Arrays.asList(89, 128, 153)),
    _141(141, Arrays.asList(133, 134, 142, 158)),
    _142(142, Arrays.asList(118, 128, 129, 134, 141, 143, 158), Arrays.asList(116, 128, 157)),
    _143(143, Arrays.asList(128, 129, 135, 142, 160)),
    _144(144, Arrays.asList(120, 145, 177), Arrays.asList(122, 123, 163)),
    _145(145, Arrays.asList(121, 144, 146)),
    _146(146, Arrays.asList(122, 145, 147, 163)),
    _147(147, Arrays.asList(137, 146, 164)),
    _148(148, Arrays.asList(123, 149, 164)),
    _149(149, Arrays.asList(123, 148, 150, 165)),
    _150(150, Arrays.asList(138, 149, 151)),
    _151(151, Arrays.asList(150, 152, 165, 166)),
    _152(152, Arrays.asList(138, 151, 153)),
    _153(153, Arrays.asList(139, 152, 154, 166, 167), Arrays.asList(124, 154, 180, 184), Arrays.asList(111, 140, 163, 185)),
    _154(154, Arrays.asList(139, 140, 153, 155), Arrays.asList(140, 153, 156)),
    _155(155, Arrays.asList(154, 156, 167, 168)),
    _156(156, Arrays.asList(140, 155, 157, 169), Arrays.asList(140, 154, 157, 184)),
    _157(157, Arrays.asList(156, 158, 170), Arrays.asList(133, 142, 156, 185)),
    _158(158, Arrays.asList(141, 142, 157, 159)),
    _159(159, Arrays.asList(158, 179, 172, 186, 198)),
    _160(160, Arrays.asList(128, 143, 161, 173)),
    _161(161, Arrays.asList(135, 160, 174), Arrays.asList(107, 128, 199)),
    _162(162, Arrays.asList(136, 175)),
    _163(163, Arrays.asList(146, 177), Arrays.asList(144, 176, 191), Arrays.asList(111, 153));

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
