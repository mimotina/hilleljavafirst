import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y > 0)  {
            System.out.println("Положительное");
        }
        else  if (y == 0) {
            System.out.println("Ноль");
        }
        else {
            System.out.println("Отрицательное");
        }
        in.close();
    }
}
