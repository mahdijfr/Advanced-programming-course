import java.util.Scanner;

public class lamp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        int count=0;
        int f=-1;
        for (int i=1;i<=n;i++){
            int numb= scanner.nextInt();
            if(numb!=f){
                count++;
                f=numb;
            }
        }
        System.out.println(count-1);
    }
}
