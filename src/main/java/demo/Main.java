package demo;


import educational_center.abstaction.Subjects;
import educational_center.members.Student;
import educational_center.members.Teacher;

public class Main {
    public static void main(String[] args){
        Teacher course = new Teacher(10);
        Student student = new Student("Ira", "ira@google.com", "Java", 2);
        Student student1 = new Student("Katya", "katya@google.com", "JS", 2);
        Subjects subjects = new Subjects("Java", 3);
        Subjects subjects1 = new Subjects("JS", 5);

        System.out.println(subjects);
        System.out.println(subjects1);

        course.addStudent(student);
        course.addStudent(student1);


        course.work();

    }
}