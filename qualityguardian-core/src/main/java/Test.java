import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        
        arr.add("hej");
        arr.add("san");
        arr.add("svejs");
        arr.add("an");
        
        for (String s : arr) {
            System.out.println("iteration, element is " + s);
            if (s.equals("hej")) {
                System.out.println("removing");
                arr.remove(s);
            }
        }
        
        System.out.println(arr);
    }

}
