import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
    
    public static void main(String[] args) {
        int[] arrr={15,164,64,16,3,4,686,1,564,321,6,};
        System.out.println("enter the number to search: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int ans= search(arrr, num);
       if(ans>=1)
       {
        System.out.println("found at : "+ans+" index");
       }
       else
       {
        System.out.println("not found");
       }
        
    }
   static int search(int[] arr,int n)
   {
    if(arr.length==0)
    {
        return -1;
    }
    for(int i=0; i<arr.length; i++)
    {
      if(arr[i]==n)
      {
        return i;
      }   
    }
    return -1;
   }
}
