package composition;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arrXY = new int[2];
        arrXY[1] = this.x;
        arrXY[2] = this.y;
        return arrXY;
    }

    public void setXY(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;

        if (! (object instanceof MyPoint)) return false;

        final MyPoint myPoint = (MyPoint) object;
        return this.x == myPoint.x && this.y == myPoint.y;
    }

    public double distance(final int x , final int y) {
        double sumSquare = Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2);
        return Math.sqrt(sumSquare);
    }

    public double distance(final MyPoint another) {
        if (another == null) return Double.MIN_VALUE;

        return this.distance(another.x, another.y);
    }

    public double distance() {
        return this.distance(0,0);
    }
}
