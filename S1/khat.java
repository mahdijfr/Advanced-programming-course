import java.util.Scanner;

public class khat {
    public static boolean isPointOnLine(double a, double b, double x, double y) {
        if (a*x+b<=y && a*x+b>=y-0.000000009){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        Pair pair1=new Pair();
        pair1.x=scanner.nextDouble();
        pair1.y=scanner.nextDouble();
        System.out.println(isPointOnLine(a,b, pair1.x, pair1.y));

    }
}
class Pair{
    double x;
    double y;

    public void setName(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}
