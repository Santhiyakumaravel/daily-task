package day8;
import java.util.Scanner;
import java.util.ArrayList;
public class intersection {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        int []arr1=new int[a];
       
        for(int i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt(); 
        }
        int b=sc.nextInt();
        int []arr2=new int[b];
         for(int i=0;i<b;i++)
        {
            arr2[i]=sc.nextInt(); 
        }
        ArrayList<Integer>intersection=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
               {
                    intersection.add(arr1[i]);
                    break;
                }
            }
            
        }
        System.out.println(intersection);
    }
    
}
