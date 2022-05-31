import java.util.ArrayList;

public class Kurs {
    ArrayList<Student> studenter;
    String subject;
    public Kurs(ArrayList<Student> klass, String subject) {
        this.studenter = klass;
        this.subject = subject;
    }
    public void printStudents(ArrayList<Student> sList) {
        for(Student s : sList) {
            System.out.println(s.getName());
        }
    }
}
