package composition;


public class MyCircle {
    private MyPoint center;
    private int radius;
    private static final float PI = 3.14F;


    public MyCircle() {
        this(0, 0, 1);
    }

    public  MyCircle(final int x, final int y, final int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(final MyPoint center, final int radius) {
        this (center.getX(), center.getX(), radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(final int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(final MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(final int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(final int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return this.center.getXY();
    }

    public void setCenterXY(final int x, final int y) {
        this.center.setXY(x, y);
    }

    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    public double getCircumference() {
        return radius * 2 * PI;
    }

    public double distance(MyPoint another) {
        return center.distance(another);
    }

    @Override
    public String toString(){
        return "MyCircle [radius = " + this.radius + ", center = " + this.center.toString() + "]";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;

        if (! (object instanceof MyCircle)) return false;

        final MyCircle myCircle = (MyCircle) object;
        return this.radius == myCircle.radius && this.center.equals(myCircle.center);
    }

}
