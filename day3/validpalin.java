package day3;
import java.util.Scanner;
public class validpalin {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        boolean isPalindrome=true;
        int left=0;
        int right=a.length()-1;
        while(left<right)
        {
            if(a.charAt(left)!=a.charAt(right))
            {
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        
    System.out.println(isPalindrome ?"valid" :"notvalid");
    }
}
        


    

