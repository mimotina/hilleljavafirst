import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y > 9 && y <100)  {
            int x = y % 10;
            int z = y/10;
            int a = x*z;
            if (a > y) {
                System.out.println("bigger number " +a);
            }
            else {
                System.out.println("start number " +y);
            }

        }
        else {
            System.out.println("Wrong number");
        }
        in.close();
    }

}
