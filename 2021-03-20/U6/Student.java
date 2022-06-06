public class Student extends Person{
    private String program;
    public Student(int age, String name, String study) {
        super(age, name);
        //TODO Auto-generated constructor stub
        this.program = study;
    }
    @Override
    public String toString() {
        return "Age:" + age + " Name:" + name + " StudyProgram:" + program;
    }
}
