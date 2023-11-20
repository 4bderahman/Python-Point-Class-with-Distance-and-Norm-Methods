public class Point {
    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double value) {
        this.x = value;
    }

    public double getY() {
        return y;
    }

    public void setY(double value) {
        this.y = value;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public double norm() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(3, 4);

        System.out.println("Default coordinates: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Coordinates of Point2: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println("Distance between Point1 and Point2: " + point1.distance(point2));
        System.out.println("Norm of Point2: " + point2.norm());
    }
}
