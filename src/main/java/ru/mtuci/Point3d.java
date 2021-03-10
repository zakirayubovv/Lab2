package ru.mtuci;

import java.util.Objects;

public class Point3d {

    // координата X
    private double xCoord;

    // координата Y
    private double yCoord;

    //координата H
    private double hCoord;

    public Point3d(double xCoord, double yCoord, double hCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.hCoord = hCoord;
    }

    public Point3d() {
        this(0 , 0 ,0);
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double gethCoord() {
        return hCoord;
    }

    public void sethCoord(double hCoord) {
        this.hCoord = hCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return Double.compare(point3d.xCoord, xCoord) == 0 &&
                Double.compare(point3d.yCoord, yCoord) == 0 &&
                Double.compare(point3d.hCoord, hCoord) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord, hCoord);
    }

    public double distanceTo(Point3d point3d) {
        return Math.sqrt((point3d.xCoord - xCoord) * (point3d.xCoord - xCoord) + (point3d.yCoord - yCoord) * (point3d.yCoord - yCoord));
    }

    public static double computeArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
