package inheritance;

public class Shape {
    String color;
    boolean filled;

    public Shape() {
        this("red", true);
    }

    public Shape(final String color, final boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(final boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }
}
