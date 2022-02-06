import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y > 9 && y <100)  {

            String a = Integer. toString(y % 10);
            String b = Integer. toString(y/10);

            System.out.println((a)+" "+(b));

        }
        else {
            System.out.println("Wrong number");
        }
        in.close();

    }

}
//y = Integer.parseInt(new StringBuffer(String.valueOf(y)).reverse().toString());
//String s = Integer. toString(x);
// String d = Integer. toString(z);
// System.out.printf(s +d);