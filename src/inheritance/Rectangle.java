package inheritance;

public class Rectangle extends Shape {
    double width;
    double length;

    Rectangle() {
        this(1.0, 1.0);
    }

    Rectangle(final double width, final double length) {
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(final double width, final double length, final String color, final boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(final double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle [width = " + this.width + ", length = " + this.length + ", color = " + this.color + ", filled = " + this.filled + "]";
    }

    @Override
    public boolean equals(Object another) {
        if(another == null) return false;

        if (! (another instanceof Rectangle)) return false;

        final Rectangle rectangle = (Rectangle) another;
        return this.length == rectangle.length && this.width == rectangle.length && this.color.equals(rectangle.color) && this.filled == rectangle.filled;
    }
}
