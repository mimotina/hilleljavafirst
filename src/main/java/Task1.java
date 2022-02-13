import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        while (x<1015){
            x += 3;
            System.out.println(x);
        }

    }
}

    /*int[] arr = {1000, 1003, 1006, 1009, 1012, 1015};

        for (int i : arr) {
                System.out.println(i);*/