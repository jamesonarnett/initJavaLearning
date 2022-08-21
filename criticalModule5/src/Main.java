import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            Scanner s = new Scanner(System.in);

            System.out.println("Enter five numbers: ");

            for(int i = 0; i < 5; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("The product of your five numbers is: " + MultplyArray.multiply(arr, 4));
        } catch (Exception e) {
            System.out.println("An error has occurred." + "\n" + "Please only enter integers.");
            throw e;
        }
      }
}
