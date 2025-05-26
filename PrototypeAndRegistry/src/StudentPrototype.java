public class StudentPrototype implements Prototype<StudentPrototype>{
    private int id;
    String name;
    String batch;

    StudentPrototype() {

    }

    StudentPrototype(StudentPrototype s) {
        this.id = s.id;
        this.name = s.name;
        this.batch = s.batch;
    }

    public StudentPrototype copy() {
        return new StudentPrototype(this);
    }
}
