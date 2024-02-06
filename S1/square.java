import java.util.Scanner;

public class square {
    static Scanner scanner=new Scanner(System.in);
    public static final int len = scanner.nextInt();
    public static void main(String[] args) {
        if (len==1)
        {
            drawLine();
        }
        else {
            drawLine();
            drawTop();
            drawBottom();
            drawLine();
        }
    }
    public static void drawTop(){
        for (int i=1 ; i<=len/2-1 ; i++){
            System.out.print("*");
            for (int k=1 ; k<=i*2-1 ; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=(len*2-((i+1)*4)+1) ; k>=1 ; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=1 ; k<=i*2-1 ; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void drawBottom(){
        if (len%2==0) {
            for (int i = 1; i <= len / 2 - 1; i++) {
                System.out.print("*");
                for (int k = len - (i + 1) * 2 + 1; k >= 1; k--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int k = 1; k <= (i - 1) * 4 + 1; k++) {
                    System.out.print(" ");
                }
                    System.out.print("*");
                for (int k = len - (i + 1) * 2 + 1; k >= 1; k--) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        else {
            for (int i = 1; i <= len / 2; i++) {
                System.out.print("*");
                for (int k = len - i*2; k >= 1; k--) {
                    System.out.print(" ");
                }
                if (i==1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print("*");
                    for (int k = 1; k <= (i-1)*4-1; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                for (int k = len - i* 2; k >= 1; k--) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

    public static void drawLine(){
        for (int i=0;i<len;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
