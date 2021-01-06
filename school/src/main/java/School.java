import java.util.ArrayList;
import java.util.List;

public class School {

    public ArrayList<Mentor> getMentors() {
        return mentors;
    }

    private ArrayList<Mentor> mentors = new ArrayList<Mentor>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public void acceptStudent (Student student) {
        students.add(student);
    }

    public void hireMentor (Mentor mentor) {
        mentors.add(mentor);
    }

    public List<Student> getStudentsFromDesiredModule (Module module) {
        ArrayList<Student> desiredStudents = new ArrayList<Student>();
        for (Student student: students) {
            if (student.getCurrentModule() == module) {
                desiredStudents.add(student);
            }
        }
        return desiredStudents;
    }


}
