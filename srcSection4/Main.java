package com.company;

public class Main {

    public static void main(String[] args) {
	    // a mile is 1.609344 kilometers
//        double kilometer = (100 * 1.609344);
//        int highScore = 50;
//
//        if(highScore == 50) {
//            System.out.println("This is an expression");
//        } else {
//            System.out.println("Else");
//        }
//
//        //both complete statements
//        //expressions do not include the datatype/extras like a statement does
//        //statements can wrap multiple lines -- white space no effect
//
//        int myVar =
//                50;
//        myVar++;
//
//        //multiple statements on same line accepted but not recommended
//        int anotherVar = 5; myVar--; anotherVar++; anotherVar--;System.out.println(anotherVar);
//


        // Next Lesson
//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;

        //scope similar to js
        //cannot access finalScore outside of code block

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was "+ highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was "+ highScore);




        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Jameson", score);

        score = calculateHighScorePosition(900);
        displayHighScorePosition("Jim", score);

        score = calculateHighScorePosition(400);
        displayHighScorePosition("John", score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("Jake", score);



    }
    //new method
    //refactor for single method and cleanCode

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " came in " +  position +  " place" );
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;
        
        if(score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
