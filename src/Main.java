package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        //overflow or underflow Number wraps around to opposite value.
        // use appropriate data type

        // 8bit
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        //16bit
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);
        
        //64 bit, double int width
        //considered INT unless L appended to end.
        //throw error if int too big without L
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long  myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        //casting primitive types
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        byte lilByte = 10;
        short lilShort = 100;
        int regNumber = 10000;

        long allNewNums =  (50000 + (10 * lilByte + lilShort + regNumber));
        System.out.println(allNewNums);
    }
}
