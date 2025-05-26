public class IntelligentStudentPrototype extends StudentPrototype{
    int iq;
    IntelligentStudentPrototype() {

    }
    IntelligentStudentPrototype(IntelligentStudentPrototype is) {
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudentPrototype copy() {
        return new IntelligentStudentPrototype(this);
    }
}
