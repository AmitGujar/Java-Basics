import java.awt.*;
//pointer example
class Pointr {
    public static void main(String[] args) {
//  Reference type stores address
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}