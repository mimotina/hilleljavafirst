import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Splits(str);
      }

    public static String[] Splits(String str) {
        String[] words = str.split(" ");
        String minword = words[0];
        int minLength = words[0].length() ;
        int strNumber = (int) Arrays.stream(words).count();
        for (int i=0; i< strNumber; i++) {
            int len = words[i].length();
            if (minLength > len) {
                minLength = len;
                minword = words[i];
                }
        }
        System.out.println(minLength);
        System.out.println(minword);
        return (words);
    }
}
