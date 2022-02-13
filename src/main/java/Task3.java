import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int factorial = 1;
        for (int i=1; i<=x; i++) {
             factorial = factorial*i;
           }

        System.out.println(factorial);
    }
}
