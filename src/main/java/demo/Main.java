package demo;
import static demo.Week.*;


import educational_center.abstaction.Subjects;
import educational_center.members.Student;
import educational_center.members.Teacher;

public class Main {
    public static void main(String[] args){
        Teacher course = new Teacher(10);
        Week[] weeks = {Monday, Thursday,Wednesday,Thursday, Friday};

        Student student = new Student("Ira", "ira@google.com", "Java", 2, weeks);
        Student student1 = new Student("Katya", "katya@google.com", "JS", 2, weeks);
        Subjects subjects = new Subjects("Java", 3);
        Subjects subjects1 = new Subjects("JS", 5);


        System.out.println(subjects);
        System.out.println(subjects1);

        course.addStudent(student);
        course.addStudent(student1);

        course.work();

        System.out.println(Monday.getName()+ " " + Monday.getDayNumber());
        System.out.println(student);

       
    }
}