package ru.mtuci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Point3d point = new Point3d(1.0, 5.0, 0);
        Point3d point3d = new Point3d(4.0, 6.0, 0);

        System.out.printf("%.2f", point.distanceTo(point3d));
        System.out.println("\n_______________");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());;
        double c = Double.parseDouble(reader.readLine());;

        if (a != b && a != c && b != c) {
            System.out.printf("%.2f", Point3d.computeArea(5,6,7));
        } else {
            System.out.println("Стороны треугольника равны!");
        }




    }
}
