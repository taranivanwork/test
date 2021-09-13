package global.geom;

public class Point {

    public static Point INSTANCE = new Point(1, 2);

    private double x;
    private double y;

    private Point(double x, double y) {
        setX(x);
        setY(y);
    }

    private void checkCoordinate(double coordinate) {
        if (coordinate < 0) {
            System.err.println("Wrong coordinate: " + coordinate);
        }
    }

    public void setX(double x) {
        checkCoordinate(x);
        this.x = x;
    }

    public void setY(double y) {
        checkCoordinate(y);
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

