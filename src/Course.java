import java.util.Arrays;

public class Course {
    private String name;
    private Lecturer lecturer;
    private Student[] students;

    public Course (String name, Lecturer lecturer, Student[] students){
        this.name = name;
        this.lecturer = lecturer;
        this.students = students;
    }

    public String getName(){
        return this.name;
    }

    public Lecturer getLecturer(){
        return this.lecturer;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public Student[] addStudentToList(Student student){
        Student[] newArrayStudents = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            newArrayStudents[i] = this.students[i];
        }
        newArrayStudents[students.length + 1] = student;
        return newArrayStudents;
    }
    @Override
    public String toString() {
        return " name of course: "+ this.name +
                "\n lecurer's details: "+ this.lecturer +
                "\n students' details: "+ this.students;
    }
}
