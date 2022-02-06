import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y > 9 && y <1000)  {

            System.out.println("number with minus=" +(--y));

        }
        else {
            System.out.println("number=" +y);
        }
        in.close();
    }
}
