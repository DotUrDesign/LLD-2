package BuilderV1;

public class Client {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        builder.setName("Pratyush");
        builder.setAge(24);
        builder.setCourse("Java");
        Student s = new Student(builder);
        System.out.println(s.name);
        System.out.println(s.batch);
    }
}
