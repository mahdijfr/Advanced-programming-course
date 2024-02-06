import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner input = new Scanner(file);
            int count = 0;
            int[][] arr = new int[1000][1000];

            int i = 1;
            int[] column = new int[1000];
            while (input.hasNextLine()) {
                String lines = input.nextLine();
                Scanner line_s = new Scanner(lines);

                int j = 0;
                while (line_s.hasNextInt()) {
                    arr[i][j] = line_s.nextInt();

                    j++;

                }
                column[i] = j;

                i = i + 1;

            }
            int[] arr2;
            int n = 0;
            int max = 0;
            arr2 = Arrays.copyOf(column, 1000);
            Arrays.sort(arr2);
            for (int k = 1; k < 1000 - 1; k++) {
                if (arr2[k] == arr2[k + 1]) {
                    count++;
                    if (count >= max) {
                        n = arr2[k];
                    }
                } else {
                    max = count;
                    count = 0;
                }

            }
            System.out.println(n);

            for (int k = 1; k < 1000; k++) {
                if (n != column[k] && column[k] != 0) {
                    System.out.println(k - 1);
                }

            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

