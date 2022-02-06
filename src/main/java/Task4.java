import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int y = in.nextInt();
            if (y > 9 && y <100)  {
               int x = (y % 10);
                int z = (y/10)*10;

                String a = Integer. toString(y % 10);
                String b = Integer. toString((y/10)*10);

                System.out.println(b +"+" +a);

            }
            else {
                System.out.println("Wrong number");
            }
            in.close();
    }
}
// System.out.println(Integer.toString(z) +"+" + Integer.toString(x));