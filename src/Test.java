import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Thái", 21, "PT");
        Student student3 = new Student("An", 22, "QN");
        Student student4 = new Student("Đông", 19, "HN");

        Map<Integer, Student> hashMap = new HashMap<Integer, Student>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        hashMap.put(4, student4);
        hashMap.put(5, student2);
        for(Map.Entry<Integer, Student> element : hashMap.entrySet()){
            System.out.println(element.toString());
        }

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student2);
        for(Student element : hashSet){
            System.out.println(element.toString());
        }
    }
}
