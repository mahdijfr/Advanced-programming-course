import java.awt.*;
import java.util.Scanner;


public class triangle {

    public static boolean isPointOnRight(OrderedPair p1, OrderedPair p2, OrderedPair point) {
        // calculate a and b

            double a = ((double) p1.y - (double) p2.y) / ((double) p1.x - (double) p2.x);
            double b = (a*(double) p1.x)-(double)p1.y;
            double ans= (double)point.y- (double)point.x*a + b;

            if (a == Double.POSITIVE_INFINITY) {
                if(point.x<= p1.x){
                    return true;
                }
                return  false;
            } else if (a == Double.NEGATIVE_INFINITY) {
                if(point.x>= p1.x){
                    return true;
                }
                return false;
            } else if (a == 0) {
                if(p2.x>p1.x && p1.y>= point.y){
                    return true;
                }
                else if(p2.x<p1.x && p1.y<=point.y){
                    return true;
                }
                return false;
            } else {
                if (ans<= 0.0000000001){
                    return true;
                }
                return false;
            }
    }
    public static void main(String[] args) {

        OrderedPair Pair1 = new OrderedPair();
        OrderedPair Pair2 = new OrderedPair();
        OrderedPair Pair3 = new OrderedPair();
        OrderedPair Point = new OrderedPair();

        Scanner scanner =new Scanner(System.in);

        Pair1.x=scanner.nextInt();
        Pair1.y=scanner.nextInt();
        Pair2.x=scanner.nextInt();
        Pair2.y=scanner.nextInt();
        Pair3.x=scanner.nextInt();
        Pair3.y=scanner.nextInt();
        Point.x=scanner.nextInt();
        Point.y=scanner.nextInt();
        DrawingPanel panel1= new DrawingPanel(400,400);
        Graphics p= panel1.getGraphics();
        p.setColor(Color.BLACK);
        p.drawLine(Pair1.x, -Pair1.y,Pair2.x,-Pair2.y);
        p.drawLine(Pair1.x,- Pair1.y,Pair3.x,-Pair3.y);
        p.drawLine(Pair3.x, -Pair3.y,Pair2.x,-Pair2.y);
         if (isPointOnRight(Pair1,Pair2,Point)&&isPointOnRight(Pair2,Pair3,Point)&&isPointOnRight(Pair3,Pair1,Point)){
             p.setColor(Color.green);
         }
         else {
             p.setColor(Color.red);
         }

         p.fillOval(Point.x-4, -Point.y-4, 8,8);


    }
}
class OrderedPair {
    int x;
    int y;

    public void setName(int x, int  y) {

        this.x = x;
        this.y = y;
    }

}
