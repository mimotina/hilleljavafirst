package educational_center.abstaction;

public  class Subjects {
    private String subject;
    private int hours;


    public Subjects(String subject, int hours){
        this.subject =  subject;
        this.hours = hours;
    }

    public String getSubject() {
        return subject;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subject='" + subject + '\'' +
                ", hours=" + hours +
                '}';
    }
}
