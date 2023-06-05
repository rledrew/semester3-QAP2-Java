public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }


    public void setXY(int x, int y) {
        setX(x);
        setY(x);
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }


    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}