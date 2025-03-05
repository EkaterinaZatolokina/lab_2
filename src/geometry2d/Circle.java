package geometry2d;

import exceptions.RadiusException;

public class Circle implements Figure{
    private double radius = 0;

    public Circle(double radius) throws RadiusException {
        if (radius <= 0)
            throw new RadiusException();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws RadiusException{
        if (radius <= 0)
            throw new RadiusException();
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return (Math.PI * 2D) * this.radius;
    }

    public String toString() {
        return "Circle (radius: " + this.radius + ", Perimeter: " + this.perimeter() +", Area: " + this.area() +")";
    }
}
