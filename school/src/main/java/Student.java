
public class Student extends Person {

    public Student(String name, String birthDate, String phoneNumber) {
        super(name, birthDate, phoneNumber);
        currentModule = Module.PB;
        schoolCompleted = false;
    }

    public void action() {
        moduleProgress++;
        if (checkIfModuleCompleted()) {
            goToNextModule();
        }
    }

    private int moduleProgress;

    public Module getCurrentModule() {
        return currentModule;
    }

    private Module currentModule;
    private boolean schoolCompleted;

    private void goToNextModule(){
        if (currentModule != null) {
            currentModule = currentModule.nextModule();
        } else {
            schoolCompleted = true;
        }
    }

    private boolean checkIfModuleCompleted () {
        return moduleProgress >= 100;
    }

    public boolean checkIfSchoolCompleted () {
        return schoolCompleted;
    }


}
