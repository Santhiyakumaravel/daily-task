package day3;
import java.util.Scanner;
public class palindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int org=a;
        int rev=0;
        while(a!=0)
        {
            int dig=a%10;
            rev=rev*10+dig;
            a=a/10;
        }
        if(org==rev)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
