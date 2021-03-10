package ru.mtuci;

import java.util.Objects;

/**
 * двумерный класс точки.
 */
public class Point2d {

    // координата X
    private double xCoord;
    // координата Y
    private double yCoord;

    //Конструктор инициализации
    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    // Конструктор по умолчанию.
    public Point2d() {
    //Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }

    // Возвращение координаты X
    public double getX() {
        return xCoord;
    }

    // Возвращение координаты Y
    public double getY() {
        return yCoord;
    }

    // Установка значения координаты X.
    public void setX(double val) {
        xCoord = val;
    }

    // Установка значения координаты Y.
    public void setY(double val) {
        yCoord = val;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2d point2d = (Point2d) o;
        return Double.compare(point2d.xCoord, xCoord) == 0 &&
                Double.compare(point2d.yCoord, yCoord) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }
}
