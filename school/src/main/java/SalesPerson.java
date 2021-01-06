public class SalesPerson extends Employee {

    public SalesPerson(String name, String birthDate, String phoneNumber, int salary) {
        super(name, birthDate, phoneNumber, salary);
    }

    public void findJobsForStudents (Student student) {
        if (student.checkIfSchoolCompleted()) {
            System.out.println("We have to find u a job!");
        }
    }

}
