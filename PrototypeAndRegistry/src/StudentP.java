public class StudentP implements Prototype<StudentP>{
    private int id;
    String name;
    String batch;

    StudentP() {

    }

    StudentP(StudentP s) {
        this.id = s.id;
        this.name = s.name;
        this.batch = s.batch;
    }

    public StudentP copy() {
        return new StudentP(this);
    }
}
