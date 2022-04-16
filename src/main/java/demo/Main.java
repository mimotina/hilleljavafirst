package demo;
import static demo.Week.*;


import educational_center.abstaction.Subjects;
import educational_center.members.Student;
import educational_center.members.Teacher;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Teacher course = new Teacher(10);
        Week[] weeks = {MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
        Set<Subjects> subject = new HashSet<>();
        subject.add(new Subjects("Java"));
        subject.add(new Subjects("JS"));
        subject.add(new Subjects("HTML"));

        for (Subjects s:subject){
            System.out.println(s);
        }

       Student student = new Student("Ira", "ira@google.com", subject, weeks,2);
       Student student1 = new Student("Katya", "katya@google.com", subject, weeks,2);


        course.addStudent(student);
       course.addStudent(student1);

        course.work();

        System.out.println(MONDAY.getName()+ " " + MONDAY.getDayNumber());
        System.out.println(student);


    }
}