public class Main {
    public static void main(String[] args) {
        String firstName = "Daniel";
        String lastName = "Goren";
        int seniority = 9;
        int cardNumber = 101;

        Lecturer lecturer = new Lecturer(firstName,lastName,seniority);
        Student student1 = new Student("Amit","Goren",1920);
        Student student2 = new Student(firstName,lastName,cardNumber);
        Student studentToAdd = new Student("Adi","Goren",982);
        Student[] students = {student1,student2};

        Course course = new Course("software engineering",lecturer,students);
        String courseDetails = course.toString();
        System.out.println(courseDetails);

    }
}