import java.util.ArrayList;
import java.util.List;

public class array {

    public static void main(String[] args) {
    // int[] test_array = new int[3];
    // System.out.println(test_array[1]);
    
    List<String> list = new ArrayList<>();

    list.add("orange");
    list.add("apple");
    boolean result=list.remove("orange");
    // String result2=list.remove(0);
    
    System.out.println(list);
    System.out.println("kkkk");
    System.out.println(result);


    // Object myObject = new ArrayList<>();

    // Class<?> objectClass = myObject.getClass();
    // String className = objectClass.getSimpleName();

    // System.out.println("Object Type: " + className);
    }
    
}
