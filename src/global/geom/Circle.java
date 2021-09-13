package global.geom;

/**
 * Круг.
 *
 * @author itsila
 * @since 1.0
 */
public class Circle {

    private Point center;

    private double radius;

    public Circle(double xCenter, double yCenter, double radius) {
        this.center = Point.INSTANCE;
        this.radius = radius;
    }

   public void print() {
        new Printer().print(center.getX(), center.getY(), radius);
   }

    public static class Printer {

        public void print(double x, double y, double radius) {
            System.out.println("X: " + x +
                "Y: " + y +
                "R: " + radius);
        }
    }
}

