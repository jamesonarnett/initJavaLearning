public class WhileDoWhile {
    public static void main(String[] args) {
//        int count = 1;

//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for(int i = 1; i < 7; i++) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while(count != 6);


//        int number  = 4;
//        int finishedNumber = 20;
//        int evenNumbersFound = 0;
//
//        while(number <= finishedNumber) {
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//
//            evenNumbersFound++;
//            if(evenNumbersFound >= 5) {
//                System.out.println("We found " + evenNumbersFound + " even numbers");
//                break;
//            }
//
//
//        }
//
//        System.out.println(sumDigits(1254));
//
        System.out.println(isPalindrome(-123321));

    }


    public static boolean isPalindrome(int number) {
        int orginalNumber = number;
        int reverse = 0;

        while(number != 0) {
            int remainder = number % 10;
            System.out.println("Remainder: " + remainder);
            reverse = (reverse * 10) + remainder;
            System.out.println("Reverse: " + reverse);
            number /= 10;

        }

        if(reverse == orginalNumber) {
            return true;
        } else {
            System.out.println("I am num " + number);
            System.out.println("I am reverse " + reverse);
            return false;
        }

    }

    public static boolean isEvenNumber(int num) {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }


    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
       return sum;
    }

}
