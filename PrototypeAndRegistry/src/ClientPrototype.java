public class ClientPrototype {

    static void doSomething(StudentPrototype s) {
//        StudentPrototype st = new StudentPrototype(s);
        s.copy();   // basically if a Student class object is being passed, it will call the copy() method of Student class. And if an IntelligentStudent class object is being passed, meaning - Student s = new IntelligentStudent();, then the copy() method of IntelligentStudent class will be called because of runtime polymorphism.
    }

    public static void main(String[] args) {
        // passing a student class for deep copy
        StudentPrototype st = new StudentPrototype();
        st.name = "Riya";
        st.batch = "Data Eng";
        doSomething(st);

        // passing a IntelligentStudent class for deep copy
        IntelligentStudentPrototype ist = new IntelligentStudentPrototype();
        ist.name = "Prabhas";
        ist.batch = "DevOps";
        ist.iq = 98;
        doSomething(ist);

    }
}
