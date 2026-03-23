
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
 
        LinkedList<Integer> list=new LinkedList<>();
        while(a>0)
        {
        list.add(a%10);
        a=a/10;
    }
    for(int dig:list)
    {
        System.out.println(dig);
    }
    }
}
