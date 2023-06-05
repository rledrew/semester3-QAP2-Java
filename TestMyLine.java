public class TestMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());
        l1.setBegin(new MyPoint(1, 2));
        l1.setEnd(new MyPoint(3, 4));
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBegin().getX());
        System.out.println("begin's y is: " + l1.getBegin().getY());
        System.out.println("end's x is: " + l1.getEnd().getX());
        System.out.println("end's y is: " + l1.getEnd().getY());
        l1.setBeginX(5);
        l1.setBeginY(6);
        l1.setEndX(7);
        l1.setEndY(8);
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBeginX());
        System.out.println("begin's y is: " + l1.getBeginY());
        System.out.println("end's x is: " + l1.getEndX());
        System.out.println("end's y is: " + l1.getEndY());
        l1.setBeginXY(11, 12);
        l1.setEndXY(13, 14);
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBeginXY()[0]);
        System.out.println("begin's y is: " + l1.getBeginXY()[1]);
        System.out.println("end's x is: " + l1.getEndXY()[0]);
        System.out.println("end's y is: " + l1.getEndXY()[1]);
        System.out.printf("length is: %.2f%n", l1.getLength());
        System.out.printf("gradient is: %.2f%n", l1.getGradient());
    }
}
