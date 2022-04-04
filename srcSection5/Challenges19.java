public class Challenges19 {
    public static void main(String[] args) {
    hasSameLastDigit(9, 99, 19);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(isValid(a) && isValid(b) && isValid(c)) {

            int aLastNum = a % 10;
            int bLastNum = b % 10;
            int cLastNum = c % 10;

            if (aLastNum == bLastNum || bLastNum == cLastNum || cLastNum == aLastNum) {
                System.out.println("True");
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int x) {
        if(x >= 10 && x <= 1000) {
            return true;
        }
        System.out.println("False");
        return false;
    }
}
