package com.company;

public class CodeChallenges {
    // MEGABYTES CONVERTER
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = (kiloBytes / 1024);
            int remainder = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB " + "and " + remainder + " KB");
        }
    }


    //BARKING DOG
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23 || !barking) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        return false;
    }


    //LEAP YEAR CALCULATOR
    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        }
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            }
            return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int a = (int) (first * 1000);
        int b = (int) (second * 1000);
        if(a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if((a+b) == c) {
            return true;
        } else {
            return false;
        }
    }


    public static  boolean hasTeen(int a, int b, int c) {
        if(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19 ) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen(int param) {
        if(param >= 13 && param <= 19) {
            return true;
        } else {
            return false;
        }
    }

}

