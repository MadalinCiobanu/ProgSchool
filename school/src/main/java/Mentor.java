import java.util.ArrayList;
import java.util.Arrays;

public class Mentor extends Employee {

    public Mentor(String name, String birthDate, String phoneNumber, int salary, ProgramingLanguage knowingLanguage) {
        super(name, birthDate, phoneNumber, salary);
        this.knowingLanguage = knowingLanguage;
    }

    private ProgramingLanguage knowingLanguage;
    private Module currentModule;

    public boolean assignToModule (Module module) {
        if (currentModule == null) {
            if (module.getLanguage().equals(knowingLanguage)) {
                currentModule = module;
                return true;
            }
        }
        return false;
    }
}
