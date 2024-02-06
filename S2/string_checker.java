import java.util.Scanner;

public class string_checker {
    public static String ziba(String s1,String s2)
    {
        if (s1.charAt(0)==s2.charAt(s2.length()-1)) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(ziba(s1,s2));
    }
}
