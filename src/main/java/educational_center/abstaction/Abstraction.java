package educational_center.abstaction;

public abstract class Abstraction {
    private String name;
    private String email;
    private String subject;

    public Abstraction(String name, String email) {
        this.name = name;
        this.email = email;
        this.subject = subject;

    }

    public Abstraction(int quantity) {
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getSubject() {
        return subject;
    }
    public abstract void work();
    public void goToLunch(){
        System.out.println(getName() + " have a lunch");
    }


    @Override
    public String toString() {
        return "Abstraction{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
