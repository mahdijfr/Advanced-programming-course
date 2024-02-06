import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        int sum=0;
        int x=5;
        Scanner scanner =new Scanner(System.in);
        for (int i=1;i<=7;i++){
             double numb= scanner.nextDouble();
             sum+=numb*x;
             x*=5;
        }
        System.out.println(sum);
    }
}
