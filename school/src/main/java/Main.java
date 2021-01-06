import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        School school = new School();
        school.hireMentor(new Mentor("Adam",
                "05.01",
                "0777777777",
                10000,
                ProgramingLanguage.PYTHON));

        ArrayList<Mentor> mentors = school.getMentors();
        for (Mentor mentor : mentors) {
            if(mentor.assignToModule(Module.PB)) {
                System.out.println("mentor was assigned");
                break;
            }
        }

        school.acceptStudent(new Student("Madalin", "01.10", "070000000"));

        System.out.println(school.getStudentsFromDesiredModule(Module.PB));


    }



}
