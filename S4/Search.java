import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static int binary_search(int arr[], int numb, int len) {
        int max = len - 1;
        int min = 0;

        while (min <= max) {
            int index = (int) Math.ceil((min + max )/ 2);
            if (numb < arr[index]) {

                max = index - 1;

            }else if (numb == arr[index]) {
                return index;
            }
            else {

                min = index+1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int numb = scanner.nextInt();
            int answer = binary_search(arr, numb, m);
            if (answer == -1) {
                System.out.println("not found");
            } else {
                System.out.println(answer);
            }
        }
    }
}
