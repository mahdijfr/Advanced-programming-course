import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class reshte {
    public static String Copy(String s1,int a)
    {
        String t = "";
        for (int j = 0; j < a; j++) {
           t+=s1;
        }
        return t;
    }
    public static int Compare(String s1,String s2)
    {
        if (s1.equals(s2)){
            return 1;
        }
        return 0;
    }
    public static int Substr(String s1,String key ,int a)
    {
        int tot=0;
        for (int i = 0; i <= s1.length()-key.length(); i++) {
            int count=0 ;
            for (int j = 0; j < key.length(); j++) {
                if(s1.charAt(i+j)==key.charAt(j)){
                   count++ ;
                }
            }
            if (count==key.length()){
                tot++;
            }
        }
        if (tot==a){
            return 1;
        }
        return 0;
    }
    public static int Attach(String s1,String key,String str,int a){
        String t=key+str;
        return (Substr(s1,t,a));

    }
    public static int Length(String s1,int a){
        if (s1.length()==a){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        int ans=0;
        double c=0;
        boolean f=true;
        while (f)
        {
            String command = scanner.next();
            if (command.equals("copy")){
                String key = scanner.next();
                int d = scanner.nextInt();
                int len=key.length()*d;
                sentence=Copy(key,d) +sentence.substring(len,sentence.length());
                c++;

            }
            else if (command.equals("compare")){
                String key = scanner.next();
                ans+=Compare(sentence,key);
                c++;

            }
            else if (command.equals("substr")){
                String key = scanner.next();
                int d = scanner.nextInt();
                ans+=Substr(sentence,key,d);
                c++;

            }
            else if (command.equals("attach")){
                String key = scanner.next();
                int d = scanner.nextInt();
                String str = scanner.next();
                ans+=Attach(sentence,key,str,d);
                c++;

            }
            else if (command.equals("length")){
                int d = scanner.nextInt();
                ans+=Length(sentence,d);
                c++;

            }
            else {
                f=false;
            }
        }
        if(ans>=c/2){
            System.out.println("Eyval");
        }
        else {
            System.out.println("HeifShod");
        }

    }
}

