package Jiayi;

import java.util.List;

public class Triangle {

    private String type;
    private int height;

    private Point point1;
    private Point point2;
    private Point point3;


    // dependency injection using setters
    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public void draw() {
        System.out.println(getType() + " triangle drawn of height " + getHeight());
        System.out.println("Point1: X = " + point1.getX() + ", Y = " + point1.getY());
        System.out.println("Point2: X = " + point2.getX() + ", Y = " + point2.getY());
        System.out.println("Point3: X = " + point3.getX() + ", Y = " + point3.getY());
    }
}
