import java.util.Scanner;

public class reshte_m {
    public static boolean substr(String t,String s) {
           String a="";
           int i=0;

           for (int j = 0; j < t.length(); j++) {
               if(i<s.length()) {
                   if (t.charAt(j) == s.charAt(i)) {
                       a = a + t.charAt(j);
                       i++;
                   }
               }
           }

           if(a.equals(s)){
               return true;
           }
           else {
               return false;
           }


    }
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n=scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            String t=scanner.nextLine();
            if (substr(t,s)){
                count++;
            }

        }
        System.out.println(count);
    }
}
