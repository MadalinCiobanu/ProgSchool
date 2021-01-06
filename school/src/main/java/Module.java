public enum Module {
    PB(ProgramingLanguage.PYTHON),
    WEB(ProgramingLanguage.WEB),
    OOP(ProgramingLanguage.JAVA_SE),
    ADV(ProgramingLanguage.JAVA_EE);

    private ProgramingLanguage language;

    Module(ProgramingLanguage language) {
        this.language = language;
    }

    public ProgramingLanguage getLanguage() {
        return language;
    }

    public Module nextModule () {
        if (this == PB) {
            return Module.WEB;
        } else if (this == WEB) {
            return Module.OOP;
        } else if (this == OOP) {
            return Module.ADV;
        } else {
            return null;
        }
    }
}
