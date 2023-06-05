public class MyLine {
    private MyPoint begin;
    private MyPoint end;


    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }


    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }


    public MyPoint getBegin() {
        return begin;
    }


    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }


    public MyPoint getEnd() {
        return end;
    }


    public void setEnd(MyPoint end){
        this.end = end;
    }


    public int getBeginX() {
        return begin.getX();
    }


    public int getBeginY() {
        return begin.getY();
    }


    public int getEndX() {
        return end.getX();
    }


    public int getEndY() {
        return end.getY();
    }


    public void setBeginX(int x) {
        begin.setX(x);
    }


    public void setBeginY(int y) {
        begin.setY(y);
    }


    public void setEndX(int x) {
        end.setX(x);
    }


    public void setEndY(int y) {
        end.setY(y);
    }


    public int[] getBeginXY() {
        int[] xy = new int[2];
        xy[0] = begin.getX();
        xy[1] = begin.getY();
        return xy;
    }


    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }


    public int[] getEndXY() {
        int[] xy = new int[2];
        xy[0] = end.getX();
        xy[1] = end.getY();
        return xy;
    }


    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }


    public double getLength() {
        double distance;
        distance = begin.distance(end);
        return distance;
    }


    public double getGradient() {
        double gradient;
        gradient = Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
        return gradient;
    }

    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";
    }
}
