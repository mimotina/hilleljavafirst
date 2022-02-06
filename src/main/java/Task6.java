import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y > 9 && y <100)  {
            int x = (y % 10) % 2 > 0 ? 0 :1 ;
            int z = (y/10) %2  > 0 ? 0 :1;

            System.out.println(x+z);

        }
        else {
            System.out.println("Wrong number");
        }
        in.close();
    }
}
