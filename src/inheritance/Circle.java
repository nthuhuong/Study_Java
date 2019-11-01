package inheritance;

public class Circle extends Shape {
    private double radius;
    private static final float PI = 3.14F;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filld) {
        super(color, filld);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * PI;
    }

    @Override
    public String toString() {
        return "Circle [radius = " + this.radius + ", color = " + this.getColor() + ", filled = " + this.isFilled() + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;

        if (! (object instanceof Circle)) return false;

        Circle circle = (Circle) object;
        return this.isFilled() == circle.isFilled() && this.getColor().equals(circle.getColor()) && this.radius == circle.radius;
    }
}
