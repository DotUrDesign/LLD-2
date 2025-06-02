package BuilderV2;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                                .setName("Prats")
                                .setAge(24)
                                .setCourse("Python")
                                .build();

        System.out.println(student.name);
        System.out.println(student.course);
        System.out.println(student.batch);
    }
}
