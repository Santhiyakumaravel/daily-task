package day3;
import java.util.Scanner;
public class reverse {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        StringBuffer b =new StringBuffer(a);
        String rev =b.reverse().toString();
        if(a.equals(rev))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
