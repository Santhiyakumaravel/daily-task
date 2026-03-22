import java.util. Arrays;
import java.util.Scanner;
public class Main  {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=9;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                System.out.println("["+left+","+right+"]");
            return;
        }
                else if(sum<target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            
        }
    }
}
