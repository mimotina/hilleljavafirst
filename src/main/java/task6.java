import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 100;
        int[] arr = new int[i];
        for (int x = 1; x < i; x++) {
            if (x % 2 != 0) {
                arr[x] = x;
                System.out.print(arr[x] + " ");
            }
        }
        System.out.println();
        for (int x = i; x >= 0; x--) {
            if (x % 2 != 0) {
                arr[x] = x;
                System.out.println(arr[x]);
            }
        }
    }
}