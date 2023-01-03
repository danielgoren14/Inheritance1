public class StudyDepartment {
    private int identicalNumber;
    private String name;
    private Course[] courses;
    private Lecturer[] lecturers;

    public StudyDepartment(int identicalNumber,String name,
                           Course[] courses, Lecturer[] lecturers){
        this.identicalNumber = identicalNumber;
        this.name = name;
        this.courses = courses;
        this.lecturers = lecturers;
    }

    public int getIdenticalNumber(){
        return this.identicalNumber;
    }

    public String getName(){
        return this.name;
    }

    public Course[] getCourses(){
        return this.courses;
    }

    public Lecturer[] getLecturers() {
        return this.lecturers;
    }

    public String toString(){
        return "name of study department: "+ this.name +
                "\n list of courses: "+ this.courses +
                "\n list of lecturers: "+ this.lecturers;
    }
}
