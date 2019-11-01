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
        return this.getWidth();
    }

    public void setSide(final double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        this.setWidth(width);

    }

    @Override
    public  void setLength(double length) {
        this.setLength(length);
    }

    @Override
    public String toString() {
        return "Square [side = " + this.getSide() + ", color = " + this.getColor() + ", filled = " + this.isFilled() + "]";
    }
}
