public class Test3 {
    public static void main(String[] args) {
        StringBuilder Name = new StringBuilder("Petrov");
        Name.setLength(15);
        StringBuilder value = new StringBuilder("5");
        value.setLength(3);
        StringBuilder subject = new StringBuilder("Math");
        subject.setLength(10);
        Print(Name.toString(), value.toString(), subject.toString());

    }
    public static void Print(String Name, String value, String subject) {
        String pr = String.format("Студент %s получил %s по %s", Name, value, subject);
        System.out.println(pr);
    }

}

