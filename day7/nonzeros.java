package day7;
import java.util.Scanner;
import java.util.Arrays;
public class nonzeros {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pos=0;
        for(int i=0;i<arr.length;i++)

            {
                if(arr[i]!=0)
                {
                    arr[pos]=arr[i];
                    pos++;
                }
            }
            while(pos<arr.length)
            {
                arr[pos]=0;
                pos++;
            }
           

            System.out.println(Arrays.toString(arr));

    }
}
