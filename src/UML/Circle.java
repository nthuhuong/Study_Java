package UML;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Circle [radius = " + this.radius + ", color = " + this.color + "]";
    }

    @Override
    public boolean equals (Object other) {
        if (other == null) return false;

        if (! (other instanceof Circle)) return false;

        Circle circle = (Circle) other;
        return this.color == circle.color && this.radius == circle.radius;
    }
}
