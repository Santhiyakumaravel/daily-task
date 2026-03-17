package day2;
import java.util.Scanner;
public class max
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int []arr=new int[a];
    for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<a;i++)
            {
                if(arr[i]>first)
                {
                    sec=first;
                    first=arr[i];
                }
                else if(arr[i]>sec&&arr[i]!=first);
                {
                    sec=arr[i];
                }
                
            } 
            System.out.println(sec);
}
}