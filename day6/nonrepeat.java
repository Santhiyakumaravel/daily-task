package day6;

public class nonrepeat {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,0,4,1,2};

        for(int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;

            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }

            if(!isRepeating) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println("No non-repeating element");
    }
}