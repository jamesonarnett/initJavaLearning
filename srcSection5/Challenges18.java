public class Challenges18 {
    public static void main(String[] args) {
    hasSharedDigit(98, 81);
    }

    public static boolean hasSharedDigit(int a, int b) {
        if(a < 10 || b < 10 || a > 99 || b > 99 ) {
            System.out.println("False");
            return false;
        }
// check second digits against each other
        int aSecondNum = a % 10;
        int bSecondNum = b % 10;

        if(aSecondNum == bSecondNum) {
            System.out.println("true");
            return true;
        }

//check first digits against each other
        while(a > 9) {
          b /= 10;
          a /= 10;

          if(a == b) {
              System.out.println("true");
              return true;
          }

// check first number against respective second number
          if(b == aSecondNum) {
              System.out.println("true");
              return true;
          }
            if(a == bSecondNum) {
                System.out.println("true");
                return true;
            }
        }

        System.out.println("False");
        return false;
    }
}
