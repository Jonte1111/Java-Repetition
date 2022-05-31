import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jonathan", "Mossgatan", 22, "Karlstad");
        Student s2 = new Student("Henrik", "Mossgatan", 22, "Karlstad");
        Student s3 = new Student("Klas", "Mossgatan", 22, "Karlstad");
        ArrayList<Student> sList = new ArrayList<Student>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        Kurs k = new Kurs(sList, "matte");
        k.printStudents(sList);
    }
}