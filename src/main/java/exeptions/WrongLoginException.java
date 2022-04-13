package exeptions;

public class WrongLoginException extends Exception{
    private String title;

    public WrongLoginException(String title, String message) {
        super(message);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
