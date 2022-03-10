public class WhileDoWhile {
    public static void main(String[] args) {
        int count = 1;

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


        int number  = 4;
        int finishedNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishedNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                System.out.println("We found " + evenNumbersFound + " even numbers");
                break;
            }


        }




    }

    public static boolean isEvenNumber(int num) {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }

}
