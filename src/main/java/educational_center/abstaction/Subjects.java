package educational_center.abstaction;

import java.util.Objects;

public  class Subjects {

    public String nameSubject;

    public Subjects(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subjects subjects = (Subjects) o;
        return Objects.equals(nameSubject, subjects.nameSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSubject);
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "nameSubject='" + nameSubject + '\'' +
                '}';
    }

    /*   private String subject;
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
    }*/
}