public class ForLoops {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " +  calculateInterest(10000.0, 2.0));

        for(int i=0; i<5; i++) {
            //same as javascript :)
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("***********************************");

        for(int i=2; i<9; i++) {
            System.out.println("10000 at " + i + "% interest rate = " + calculateInterest(10000.0, i));
        }

        System.out.println("***********************************");

        for(int i=8; i>1; i--) {
            System.out.println("10000 at " + i + "% interest rate = " + calculateInterest(10000.0, i));
        }


        int primesFound = 0;
        for(int i=45; i<100; i++){

            if(isPrime(i)){
                System.out.println(i);
                primesFound++;
                if(primesFound >= 3) {
                    break;
                }
            }
        }

        for(int i=1; i<=100; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                System.out.println("FIZZBUZZ");
            } else if(i % 5 == 0) {
                System.out.println("FIZZ");
            } else if (i % 3 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        }
        for(int i=2; i <=n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double intRate) {
        return (amount * (intRate/100));
    }
}
