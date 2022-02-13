import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int aver1 =0;
        int aver2 =0;
        int average1 ;
        int average2;

        for (int x = 0; x < 5; x++) {
            arr1[x] = (int)(Math.random()*6);
            arr2[x] = (int)(Math.random()*6);
             }

        for(int x=0; x<5;x++){
            aver1 += arr1[x];
            aver2 += arr2[x];
        }

        average1 = aver1/5;
        average2 = aver2/5;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if (average1 < average2){
            System.out.println("average arr2 is bigger");
        }
        else if(average1 > average2){
        System.out.println("average arr2 is bigger");}
        else {
            System.out.println("average arr1= average arr2");
        }
in.close();
    }
}
