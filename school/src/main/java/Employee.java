public class Employee extends Person {

    private int salary;

    public Employee(String name, String birthDate, String phoneNumber, int salary) {
        super(name, birthDate, phoneNumber);
        this.salary = salary;
    }

    void action() {

    }
}
