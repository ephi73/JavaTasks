package encapsulation;

public class calcArea {
    public double radius;
    public static double pi = 3.14;


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("radius of a circle can not be negative or zero.");
            System.err.println(1);
        }
        this.radius = radius;
    }
    public double calcArea(double radius){
        double circleArea = radius*radius*pi;
        return circleArea;
    }

    }


