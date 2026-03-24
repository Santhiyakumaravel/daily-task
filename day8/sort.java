package day8;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a-1;i++)
        {
            int mid=i;
            for(int j=i+1;j<a;j++)
            {
                if(arr[j]<arr[mid])
                {
                 mid=j;
                }
            }
            int temp=arr[mid];
            arr[mid]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
