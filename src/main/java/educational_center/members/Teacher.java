package educational_center.members;


import educational_center.abstaction.Abstraction;

public class Teacher {
    private Student[] course;

    public Teacher(int quantity) {
        this.course = new Student[quantity];
    }

    public void addStudent(Student student) {
        for (int i = 0; i < course.length; i++) {
            if (course[i] == null) {
                course[i] = student;
                return;
            }
        }
        System.out.println(student + " was not added");
    }

    public void work() {
        for (Abstraction e : course) {
            if (e != null) {
                e.work();
                if (e instanceof Student) {
                    e.goToLunch();
                }
            }
        }
        System.out.println("Petrov has course");
    }

}
