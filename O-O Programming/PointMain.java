package ch12;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(11,0);

        System.out.println("Point 1 state");
        System.out.println("x " +p1.getX());
        System.out.println("y " +p1.getY());

        System.out.println("Point 2 state");
        System.out.println("x " +p2.getX());
        System.out.println("y " +p2.getY());

        System.out.println("Total count of created points: " +Point.getNoOfPoints());
    }
}
