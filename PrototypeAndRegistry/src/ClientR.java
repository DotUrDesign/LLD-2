public class ClientR {
    public static void main(String[] args) {
        StudentR st = new StudentR();
        st.name = "Prats";
        st.batch = "Academy";

        // saving the objects in the registry
        StudentRegistry str = new StudentRegistry();
        str.register("StudentR", st);

        IntelligentStudentR is = new IntelligentStudentR();
        str.register("IntelligentStudentR", is);

        // fetching an object from the register
        StudentR s = str.get("StudentR");
        System.out.println(s.name);
        System.out.println(s.batch);
    }
}
