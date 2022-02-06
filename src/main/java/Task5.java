import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y > 9 && y <100)  {
            int x = y % 10;
            int z = y/10;
            System.out.println("weight: " +(x+z));

        }
        else {
            System.out.println("Wrong number");
        }
        in.close();
    }


}
