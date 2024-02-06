import java.io.*;
import java.util.*;

public class contact {
    public static void display_menu(){
        System.out.println("1.new contct");
        System.out.println("2.list of contcts");
        System.out.println("3.exit");
        System.out.println("------------------");
    }

    public static void main(String[] args)  throws FileNotFoundException{
        Scanner scanner =new Scanner(System.in);
        File file =new File("contact.txt");
        PrintStream out = new PrintStream("contact.txt");
            try {
                if(!file.exists()){
                file.createNewFile();}
                Scanner input=new Scanner(file);
                String lines ="";
                int id=1;

                boolean flag = true;
                    while (flag) {
                        display_menu();
                        int numb = scanner.nextInt();

                        if (numb == 1) {
                            Scanner scan =new Scanner(System.in);
                            System.out.println("what is your name?");
                            String name =scan.nextLine();
                            out.println(name);
                            System.out.println("what is your phone number?");
                            String phone_number =scan.next();
                            out.println(phone_number);
                            System.out.println("------------------");
                        }

                        else if (numb == 2) {

                            while (input.hasNextLine()){
                                lines +=id +"\n"+ input.nextLine()+"\n"+input.nextLine()+"\n"+"------------------"+"\n";
                                id++;
                            }
                            System.out.println(lines);
                        }

                        else {
                            flag = false;
                        }

                    }
                out.close();
                }


            catch (IOException e){
                System.out.println("An error occurred.");
            }

        }
}
