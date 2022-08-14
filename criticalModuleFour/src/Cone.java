public class Cone extends Shape {
    double radius;
    double height;

    Cone(double rad, double ht) {
        radius = rad;
        height = ht;
    }

    double surface_area() {
        return 3.14 * radius * (radius + Math.sqrt(height*height*radius*radius));
    }

    double volume() {
        return 3.14 * radius * (height/3);
    }

    public String toString() {
        String str = "";
        str = str + "Surface Area of Cone: " + surface_area() + "\n";
        str = str + "Volume of Cone: " + volume() + "\n";
        return str;
    }
}
