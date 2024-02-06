import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Matrix {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input.txt");
        PrintStream out = new PrintStream("output.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner input = new Scanner(file);
            int numb1 = input.nextInt();
            int numb2 = input.nextInt();
            int numb3 = input.nextInt();

            int[][] arr = new int[numb1][numb2];
            int[][] arr2 = new int[numb2][numb3];
            int i = -1;
            int k = -1;
            while (input.hasNextLine()) {
                String lines = input.nextLine();
                Scanner line_s = new Scanner(lines);

                int j = 0;
                while (line_s.hasNextInt()) {
//                    out.println(i+"*");

                    if (i < numb1) {
                        arr[i][j] = line_s.nextInt();
                        j++;

                    } else {
                        arr2[k][j] = line_s.nextInt();
                        j++;

                    }

                }

                i = i + 1;

                if (i > numb1 - 1) {
                    k = k + 1;
                }
            }

            for (int e = 0; e < numb1; e++) {

                for (int j = 0; j < numb2; j++) {
                    out.print(arr[e][j] + " ");
                }
                out.println();
            }
            for (int e = 0; e < numb2; e++) {

                for (int j = 0; j < numb3; j++) {
                    out.print(arr2[e][j] + " ");
                }
                out.println();
            }
            int[][] answer = new int[numb1][numb3];

            for (int e = 0; e < numb1; e++) {

                for (int j = 0; j < numb3; j++) {

                    for (int f = 0; f < numb2; f++) {
                        answer[e][j] += arr[e][f] * arr2[f][j];
                    }
                }
            }

            for (int e = 0; e < numb1; e++) {

                for (int j = 0; j < numb3; j++) {
                    out.print(answer[e][j] + " ");
                }
                out.println();
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

