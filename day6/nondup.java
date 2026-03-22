package day6;
import java.util.Scanner;
public class nondup
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int j;
            for( j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                break;
            
              
            }
        if(i==j)
        System.out.println(arr[j]);
        }
    }
}