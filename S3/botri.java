import java.util.Scanner;

public class botri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int n =scanner.nextInt();
        int k=scanner.nextInt();
        for (int i=0;i<n;i++){
            int v=scanner.nextInt();
            sum+=v;
        }
        if (sum>=k){
            System.out.println("YES");
        }
        else {
        System.out.println("NO");}
    }
}
