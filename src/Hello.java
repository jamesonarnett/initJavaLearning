public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Jameson");

        int myFirstNumber = (10 + 5) + ( 2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber =6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);

//        Lesson 1

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
        //double is more precise and widely used instead

        double weightToConvert = 200;
        double poundsToKG = (weightToConvert * 0.45359237);
        System.out.println("Your weight in KG is " + poundsToKG);

        double pi = 3.1415926d;
        //underscore does not affect number, some prefer this method
        double alsoPi = 3.1_4_159_26;

//        Lesson 2

        // char = 16bit, allows storing UniCode values
        char myChar = 'D';
        char uniD = '\u0044';
        System.out.println(myChar);
        System.out.println(uniD);

        char uniCopy = '\u00A9';
        System.out.println(uniCopy);

        boolean myTrueValue = true;
        boolean myFalseValue = false;

        boolean isCustomerOver21 = true;

        //byte
        //short
        //long
        //int
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);

        //text data type, returns string => as expected
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);


        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println(lastString);

        //Lesson 3

        int result = 1 + 2;
        System.out.println(result);

        //previous variables do not change unless acted upon
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        //quick maf
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);
        result -= 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 2;
        System.out.println(result);


        //very javascript similar
        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And i am scared of Aliens!");
        }
        if(!isAlien)
            System.out.println("It is not an Alien");

        int topScore = 100;
        topScore--;
        if(topScore != 100) {
            System.out.println("You got a top score!");
        }

        int secondScore = 60;
        if((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //just like javascript && AND || OR

        if((topScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

//        Lesson 4 && 5
//        common beginner mistakes === don't forget the difference between = && ==
//         No mention of ===, assuming because of having types.
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is 50...");
        }
        boolean isCar = true;
        if (isCar) {
            System.out.println("This is a car");
        }
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }


        double initialVal = 20.00d;
        double secondVal = 80.00d;
        double addVals = (initialVal + secondVal) * 100.00d;
        double dividedVal = addVals % 40.00d;

        boolean isZero = dividedVal == 0 ? true : false;
        System.out.println(isZero);

        if(!isZero) {
            System.out.println("A remainder value exist");
        }
     }
}
