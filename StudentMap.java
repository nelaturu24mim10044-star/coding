import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");

        System.out.println("Keys: " + students.keySet());
        System.out.println("Values: " + students.values());

        students.put(1, "Charlie");

        System.out.println("Updated Map: " + students);
    }
}

OUTPUT:
Keys: [1, 2]
Values: [Alice, Bob]
Updated Map: {1=Charlie, 2=Bob}