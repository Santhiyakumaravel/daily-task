package day2;
import java.util.Scanner ;
public class subarray {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a;i++)
        {
            int temp=cur+arr[i];
            if(temp<arr[i])
            {
                cur=arr[i];
            }
            else
            {
                cur=temp;
            }
        if(max<cur)
        {
            max=cur;
        }
      
        }
          System.out.println(max);
    }
}
