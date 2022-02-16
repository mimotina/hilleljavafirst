import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name = in.nextLine();
        String value = in.nextLine();
        String subject = in.nextLine();
         System.out.printf("Студент %-15s получил %-3s по %-10s", Name, value, subject);
       }
  }





// StringBuilder Name = new StringBuilder("Petrov");
// Name.setLength(15);
// StringBuilder value = new StringBuilder("5");
// value.setLength(3);
//  StringBuilder subject = new StringBuilder("Math");
//  subject.setLength(10);
 /*public static void Print(String Name, String value, String subject) {
        String pr = String.format("Студент %s получил %s по %s", Name, value, subject);
        System.out.printf(pr)*/