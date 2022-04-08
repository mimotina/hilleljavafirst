package educational_center.members;

import educational_center.abstaction.Abstraction;
import educational_center.abstaction.Subjects;

import java.util.Arrays;
import java.util.Objects;

public class Student extends Abstraction {

    private Subjects [] learn;

    public Student(int quantity){
        super(quantity);
        this.learn = new Subjects[quantity];
    }
    public void addSubject(Subjects subject){
        for(int i=0; i<learn.length; i++){
            if (learn[i] == null){
                learn[i] = subject;
                return;
            }
        }
        System.out.println(subject + " was not added");
    }

    private int year;

    public Student(String name, String email, String subject, int year) {
        super(name, email, subject);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void work() {
        System.out.println(getName() + " studying " +getSubject()+ " " +  getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }

    public Subjects[] getLearn() {
        return learn;
    }

    public void setLearn(Subjects[] learn) {
        this.learn = learn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "learn=" + Arrays.toString(learn) +
                '}';
    }
}
