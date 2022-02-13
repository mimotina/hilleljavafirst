import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum=0;

        while ( x !=0) {
            sum +=(x%10);
            x /=10;
       }
          System.out.println(sum);

    }
}
