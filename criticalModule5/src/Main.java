import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            float[] arr = new float[5];
            Scanner s = new Scanner(System.in);

            System.out.println("Enter five numbers: ");

            for(int i = 0; i < 5; i++) {
                float temp = s.nextFloat();
                if(temp > 9999.99) {
                    System.out.println("Float too large, try again");
                    return;
                }
                arr[i] = temp;
            }
            System.out.println("The product of your five numbers is: " + MultiplyArray.multiply(arr, 4));
        } catch (Exception e) {
            System.out.println("An error has occurred." + "\n" + "Please only enter integers.");
            throw e;
        }
      }
}

// In this program, we are able to defend against Stack Overflow by
// providing a base case like the limit of 5 in the above loop, and the
// decrement of the counter in MultiplyArray to ensure there is an
// ending point for the recursion.
