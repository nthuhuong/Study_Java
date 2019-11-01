package inheritance;

public class Shape {
    private String color;
    private boolean filled;

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

    @Override
    public String toString() {
        return "Shape [color = " + this.getColor() + ", filled = " + this.isFilled() + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;

        if (! (object instanceof Shape)) return false;

        Shape shape = (Shape) object;
        return this.filled == shape.filled && this.color.equals(shape.color);
    }
}
