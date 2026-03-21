import java.util.HashMap;

public class firstnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                System.out.println( num);
                return;
            } else {
                map.put(num, 1);
            }
        }

    
    }
}