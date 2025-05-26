public class StudentR implements Prototype<StudentR>{
    private int id;
    String name;
    String batch;

    public StudentR() {}

    public StudentR(StudentR s) {
        this.id = s.id;
        this.name = s.name;
        this.batch = s.batch;
    }

    public StudentR copy() {
        return new StudentR(this);
    }
}
