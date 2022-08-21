public class MultplyArray {
    public static int multiply(int x[], int count) {
        if(count < 0){
            return 1;
        }
        return x[count] * multiply(x, --count);
    }
}
