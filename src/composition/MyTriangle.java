package composition;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {
        return this.v1.distance(this.v2) + this.v1.distance(this.v3) + this.v2.distance(this.v3);
    }

    public String getType() {
        double edge1 = this.v1.distance(this.v2);
        double edge2 = this.v1.distance(this.v3);
        double edge3 = this.v2.distance(this.v3);

        if (edge1 == edge2 &&  edge1 == edge3) {
            return "Equilateral";
        }

        if (edge1 == edge2 || edge1 == edge3 || edge3 == edge2) {
            return "Isosceles";
        }

        return "Scalene";
    }

    @Override
    public String toString() {
        return "MyTriangle [v1 = " + this.v1.toString() + ", v2 = " + this.v2.toString() + ", v3 = " + this.v3.toString() + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null) return false;

        if (! (another instanceof MyTriangle)) return false;

        MyTriangle myTriangle = (MyTriangle) another;
        return this.v1.equals(myTriangle.v1) && this.v2.equals(myTriangle.v2) && this.v3.equals(myTriangle.v3)
                || this.v1.equals(myTriangle.v2) && this.v2.equals(myTriangle.v3) && this.v3.equals(myTriangle.v1)
                || this.v1.equals(myTriangle.v3) && this.v2.equals(myTriangle.v1) && this.v3.equals(myTriangle.v2)
                || this.v1.equals(myTriangle.v1) && this.v2.equals(myTriangle.v3) && this.v3.equals(myTriangle.v2)
                || this.v1.equals(myTriangle.v3) && this.v2.equals(myTriangle.v2) && this.v3.equals(myTriangle.v1)
                || this.v1.equals(myTriangle.v2) && this.v2.equals(myTriangle.v1) && this.v3.equals(myTriangle.v3);
    }

}