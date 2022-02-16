import java.util.Locale;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         String str = in.nextLine();

        CharAT(str);
        Start(str);
        End(str);
        Cont(str);
        Index(str);
        Change(str);
        UpperCase(str);
        LowCase(str);
    }

     public static char CharAT (String str){
        int last = str.length()-1;
        char  at = str.charAt(last);
        System.out.println(at);
        return at;
    }

   public static boolean End (String str){
       boolean end = str.endsWith("!!!");
       System.out.println(end);
       return end;
   }

   public static boolean Start (String str){
       boolean start = str.startsWith("I like");
       System.out.println(start);
       return start;
   }

    public static boolean Cont (String str){
        boolean con = str.contains("Java");
        System.out.println(con);
        return con;
    }

    public static int Index (String str){
        int index1 = str.indexOf("Java");
        System.out.println(index1);
        return (index1) ;
    }

    public static String Change  (String str){
        String change = str.replace('a', 'o');
        System.out.println(change);
        return change;
    }

    public static String UpperCase  (String str){
        String upper = str.toUpperCase(Locale.ROOT);
        System.out.println(upper);
        return upper;
    }

    public static String LowCase  (String str){
        String low = str.toLowerCase();
        System.out.println(low);
        return low;
    }

}
