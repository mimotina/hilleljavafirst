import exeptions.WrongLoginException;
import exeptions.WrongPasswordException;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        getException();
    }

    public static void getException() {

        try {
            login();
            password();
            confirmPassword();
        } catch (WrongLoginException s) {
            System.out.println(s.getMessage());
        } catch (WrongPasswordException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void login() throws WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter login");
        String login = scanner.nextLine();
        if (login.length() < 5 || !(login.contains("_"))) {
            throw new WrongLoginException("error", "Wrong login");
        }
    }

    public static String password() throws WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter password");
        String password = scanner.nextLine();
        if (password.length() < 5 || !((password.contains("_")) && (password.contains("!")))) {
            throw new WrongPasswordException("error", "Password less then 20 symbols or no '_' or n");
        }

        return password;
    }

    public static void confirmPassword() throws WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter confirmPassword");
        String confirmPassword = scanner.nextLine();

        if (confirmPassword.equals(password())){
        throw new WrongPasswordException("error", "password not  match");
    }}}