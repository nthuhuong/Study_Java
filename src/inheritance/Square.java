package inheritance;

public class Square extends Rectangle {
    Square() {
        super();
    }

    Square(final double side) {
        super(side, side);
    }

    Square(final double side, final String color, final boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(final double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public  void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square [side = " + this.width + ", color = " + this.color + ", filled = " + this.filled + "]";
    }

    @Override
    public boolean equals(Object another) {
        if(another == null) return false;

        if (! (another instanceof Square)) return false;

        final Square square = (Square) another;
        return this.width == square.length && this.color.equals(square.color) && this.filled == square.filled;
    }
}
