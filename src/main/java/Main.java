public class Main {
    public static void main(String[] args) {
        char x = 's';
        byte q = 1;
        short w = 5;
        int a = 75;
        int b = 7;
        long r = 75895;
        float t = 7.58f;
        double y = 7.589547895;
        boolean  z = true;
        int sum = a + b;
        boolean d = a<100&&a<89;
        boolean c = a>100||a<89;
        boolean v = !(a>100)&&a<89;

        System.out.println(x);
        System.out.println(q);
        System.out.println(w);
        System.out.println(a);
        System.out.println(b);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
        System.out.println(z);
        System.out.println("a + b = " + sum);
        System.out.println(d);
        System.out.println(c);
        System.out.println(v);
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));
        System.out.println("a == b = " + (a==b));
        System.out.println("a != b = " + (a!=b));
        System.out.println("a > b = " + (a>b));
        System.out.println("a < b = " + (a<b));
       
    }
}
