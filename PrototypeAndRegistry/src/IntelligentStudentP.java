public class IntelligentStudentP extends StudentP {
    int iq;
    IntelligentStudentP() {

    }
    IntelligentStudentP(IntelligentStudentP is) {
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudentP copy() {
        return new IntelligentStudentP(this);
    }
}
