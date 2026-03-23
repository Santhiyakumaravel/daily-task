package day7;
import java.util.Scanner;
import java.util.LinkedList;
public class middle {
    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
   
    LinkedList<Integer>list=new LinkedList <>();
    for(int i=0;i<a;i++)
    {
        list.add(sc.nextInt());
    }
    int middle=list.size()/2;
    System.out.println(list.get(middle));
}
}
