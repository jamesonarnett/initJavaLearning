public class MultiplyArray {
    public static float multiply(float x[], int count) {
        if(count < 0) {
            return 1;
        }
        return (x[count] * multiply(x, --count));
    }

}
