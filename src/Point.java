public class Point {
    final int RADIUS = 7;
    double x;
    double y;
    double radiusSquared;

    public void findRadius() {
        radiusSquared = x * x + y * y;
    }

    public void findPoint() {
        if (radiusSquared <= 49) System.out.printf("\n%.2f %.2f - координаты точки, которая входит в окружность", x, y);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        point1.findRadius();
        point1.findPoint();
        Point point2 = new Point(1, 0);
        point2.findRadius();
        point2.findPoint();
        Point point3 = new Point(3, 2);
        point3.findRadius();
        point3.findPoint();
        Point point4 = new Point(2, 7);
        point4.findRadius();
        point4.findPoint();
        Point point5 = new Point(5, 8);
        point5.findRadius();
        point5.findPoint();
        Point point6 = new Point(1, 5);
        point6.findRadius();
        point6.findPoint();
        Point point7 = new Point(9, 3);
        point7.findRadius();
        point7.findPoint();
        Point point8 = new Point(2, 9);
        point8.findRadius();
        point8.findPoint();
        Point point9 = new Point(0, 3);
        point9.findRadius();
        point9.findPoint();
        Point point10 = new Point(2, 2);
        point10.findRadius();
        point10.findPoint();
    }

}
