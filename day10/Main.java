import java.util.*;

public class Main {
    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 4, 2};
        int n = arr.length;

        for (int size = 1; size < n; size = size * 2) {
            for (int left = 0; left < n - 1; left += 2 * size) {
                int mid = Math.min(left + size - 1, n - 1);
                int right = Math.min(left + 2 * size - 1, n - 1);
                int n1 = mid - left + 1;
                int n2 = right - mid;
                int L[] = new int[n1];
                int R[] = new int[n2];
                for (int i = 0; i < n1; i++)
                    L[i] = arr[left + i];

                for (int j = 0; j < n2; j++)
                    R[j] = arr[mid + 1 + j];

                int i = 0, j = 0, k = left;
                while (i < n1 && j < n2) {
                    if (L[i] <= R[j]) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }

                while (i < n1) {
                    arr[k] = L[i];
                    i++;
                    k++;
                }

                while (j < n2) {
                    arr[k] = R[j];
                    j++;
                    k++;
                }
            }
        }
        System.out.println("sort arr=");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}