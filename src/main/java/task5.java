import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        for (int x = 0; x < arr.length; x++) {
            arr[x] = 2 * (x + 1);
            System.out.print(arr[x] + " ");

        }
        System.out.println();
        for (int x = 0; x < arr.length; x++) {
            arr[x] = 2 * (x + 1);
            System.out.println(arr[x]);
        }
    }
}