import java.util.Scanner;

class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        String min = words[0];
        for (int i=1; i<words.length-1 ; i++) {
            if (min.length() > words[i].length())
            {
                min = words[i];
            }
        }
        System.out.println(min);
    }
}
