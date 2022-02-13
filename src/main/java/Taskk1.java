import java.util.Scanner;

public class Taskk1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();

        char operation = getOperation();
        int result = calc (num1, num2, operation);
        System.out.println("result; " + result);
    }


    public static int getInt() {
        System.out.println("Put number: ");
        int num= in.nextInt();
        return num;
        }

    public static char getOperation() {
        System.out.println("Enter operation");
        char operation = in.next().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;

            default:
                System.out.println("no results");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

}
