package exeptions;

public class WrongPasswordException extends Exception {
    private String title;

    public WrongPasswordException(String title, String message) {
        super(message);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
