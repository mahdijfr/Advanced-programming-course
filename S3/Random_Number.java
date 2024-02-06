import java.util.Random;
import java.util.Scanner;

public class Random_Number{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count= scanner.nextInt();
        int numb=scanner.nextInt();
        int sum=0;
        Random rand_numb = new Random();
        for (int i=0;i<count;i++){

            int random_Number = rand_numb.nextInt(1000);
            //rand_numb 0-999
            //int random_Number = rand_numb.nextInt(); ->return random int
            sum=sum+random_Number;
            System.out.println(random_Number);
        }
        if (sum>=numb){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
