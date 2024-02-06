import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class tekrar {
    public static int distance(String s1,String s2)
    {
        int count = 0;
        for (int j = 0; j < s2.length(); j++) {
            if (s1.charAt(j) != s2.charAt(j)) {
                count++;
            }
        }
        return count;
    }
    public static int countOccurrences(String sequence, String pattern, int d) {
        int total = 0;

        for (int i = 0; i <= sequence.length()-pattern.length(); i++) {
            String t = sequence.substring(i, i + pattern.length());
            if (distance(t,pattern) <= d) {
                total++;
            }
        }
        return  total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.next();
        String pattern = scanner.next();
        int d = scanner.nextInt();
        System.out.println(countOccurrences(sequence, pattern,d));
    }
}
//i found charAt() method on the internet
//https://stackoverflow.com/questions/12089967/find-difference-between-two-strings