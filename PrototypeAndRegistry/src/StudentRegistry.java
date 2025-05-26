import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, StudentR> students = new HashMap<>();
    public void register(String key, StudentR student) {
        students.put(key, student);
    }
    public StudentR get(String key) {
        // return students.get(key);  // It will return the same object from the registry, every time when someone calls this method.

        return students.get(key).copy();  // It will return the copy of the object stored in the registry, when someone calls this method.
    }
}
