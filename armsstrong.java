import java.util.Scanner;
public class armsstrong{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numebr : ");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(n>0)
        {
            int a=n%10;
            int b= a*a*a;
            sum=sum+b;
            n=n/10;
        }
        if(num==sum)
        {
            System.out.println("true");
        }
        else{
        System.out.println("false");
    }}
}
