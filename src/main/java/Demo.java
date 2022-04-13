import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        getException();
    }

    public static void getException() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("enter login");
            String login = scanner.nextLine();
            if (login.length() < 5 || !(login.contains("_"))) {
                throw new WrongLoginException("error", "Wrong login");
            }

            System.out.println("enter password");
            String password = scanner.nextLine();
            if (password.length() < 5 || !((password.contains("_")) && (password.contains("!")))) {
                throw new WrongPasswordException("error", "Password less then 20 symbols or no '_' or no '!'");
            }
            System.out.println("enter confirmPassword");
            String confirmPassword = scanner.nextLine();
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("error","password not  match");
            }


        System.out.println(password + " everything OK ");
        } catch (WrongLoginException s) {
            System.out.println(s.getMessage());
        } catch (WrongPasswordException e) {
            System.out.print(e.getMessage());

        }
    }
}
