package day10;

import java.util.Scanner;
public class midindex {
   public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int[]arr=new int[a];
    for(int i=0;i<a;i++)
    {
        arr[i]=sc.nextInt();
    }
    int tar=sc.nextInt();;
    int low=0;
    int high=arr.length-1;
    int ind=-1;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
if(arr[mid]==tar)
{
    ind=mid;
    break;
}
if(arr[mid]<tar)
{
    low=mid+1;
}
else{
    high=mid-1;
}
    }
    System.out.println(ind);
   } 
}
