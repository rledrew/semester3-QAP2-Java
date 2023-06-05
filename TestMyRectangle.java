public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(1, 2, 3, 4);
        System.out.println(r1);
        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println("TopLeft is " + r1.getTopLeft());
        System.out.println("BottomRight is " + r1.getBottomRight());
        r1.setTopLeft(new MyPoint(4, 5));
        r1.setBottomRight(new MyPoint(6, 7));
        System.out.println(r1);
        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println("TopLeft is " + r1.getTopLeft());
        System.out.println("BottomRight is " + r1.getBottomRight());
    }
}
