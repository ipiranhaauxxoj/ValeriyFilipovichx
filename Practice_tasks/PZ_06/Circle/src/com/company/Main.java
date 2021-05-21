package com.company;
import java.lang.*;
import java.util.Scanner;

class Circle {

    private double x;
    private double y;
    private double r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "x = " + x +
                "y = " + y +
                "r = " + r +
                "colour = " + colour + '\'' + "}";
    }

    public double getLength() {
        double c;
        c = 2*Math.PI*r;
        return c;
    }
}

public class Main {

    public static void main(String[] args) {
	    double r;
	    Circle k = new Circle(3.1, 4.1, 5.1, "\u201c");
	    System.out.println("Длина окружности = " + k.getLength() + " см\n");
	    Scanner source = new Scanner(System.in);
	    System.out.println("Введите радиус");
	    r = source.nextDouble();
	    k.setR(r);
	    System.out.println("\nДлина окружности: = " + k.getLength() + " см");
    }

}
