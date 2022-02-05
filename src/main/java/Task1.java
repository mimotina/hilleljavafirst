import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter void in cm, then click 'enter'");
        int y = in.nextInt();
        float x = y / 2.54f;

        System.out.println(x + "inch");

        System.out.println("enter void in inch, then click 'enter'");
        int a = in.nextInt();
        float b = a * 2.54f;

        System.out.println(b + "cm");
        in.close();
    }
}
