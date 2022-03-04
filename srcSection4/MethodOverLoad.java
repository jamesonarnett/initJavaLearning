package com.company;

public class MethodOverLoad {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println(newScore);
//        calculateScore(75);
//        calculateScore();
        calcFeetAndInchesToCentimeters(156);
        area(5.0);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score+ " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("UnNamed Player "  + "scored " + score+ " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No name, no points");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <= 0) {
            return -1;
        } else if (inches > 12 || inches < 0) {
            return -1;
        } else {
            int feetToInches = (int)(feet * 12);
            double totalInches = feetToInches + inches;
            double convertedValue = totalInches * 2.54;
            return  convertedValue;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches <= 0) {
            return -1;
        } else {
            double feet = inches / 12;
            double remainder = inches % 12;
            double total = calcFeetAndInchesToCentimeters(feet, remainder);
            System.out.println(inches + " inches is " + total + " cm");
            return total;
        }
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        } else {
            return (radius * (Math.PI * radius));
        }
    }
    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        } else {
            return (x * y);
        }
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes/60;
            long days = hour/24;
            long years = days/365;
            if(days >= 365) {
                long remainder = days % 365;
                System.out.println(minutes + " min = " + years + " y and " + remainder + " d" );
            } else {
                System.out.println(minutes + " min = " + years + " y and " + days + " d" );
            }
        }
    }

    public static void printEqual(int a, int b, int c) {
        if(a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if(a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if(a!=b && b!=c && a!=c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
