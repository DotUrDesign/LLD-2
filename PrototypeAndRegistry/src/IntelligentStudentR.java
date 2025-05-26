public class IntelligentStudentR extends StudentR {
    int iq;
    public IntelligentStudentR() {}

    public IntelligentStudentR(IntelligentStudentR is) {
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudentR copy() {
        return new IntelligentStudentR(this);
    }
}
