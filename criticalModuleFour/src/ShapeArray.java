import java.util.*;

public class ShapeArray {
    public static void main(String[] args) {
        double rad;
        double ht;

        Scanner s = new Scanner(System.in);

        Shape[] shapeArray = new Shape[3];

        System.out.println("\nEnter Radius of Sphere: ");
            rad = s.nextDouble();
            Sphere sphere = new Sphere(rad);
            shapeArray[0]=sphere;

        System.out.println("\nEnter Radius of Cylinder: ");
            rad = s.nextDouble();
        System.out.println("\nEnter Height of Cylinder");
            ht = s.nextDouble();
            Cylinder cylinder = new Cylinder(rad, ht);
            shapeArray[1] = cylinder;

        System.out.println("\nEnter Radius of Cone: ");
            rad = s.nextDouble();
        System.out.println("\nEnter Height of Cone");
            ht = s.nextDouble();
            Cone cone = new Cone(rad, ht);
            shapeArray[2] = cone;


        System.out.println("\n");
            for(int i=0; i<=2; i++) {
                System.out.println(shapeArray[i]);
            }
        System.out.println("\n");
    }
}
