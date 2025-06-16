import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the num :");
        int n=sc.nextInt();
        boolean ans=isprime(n);
        System.out.println(ans);
    }
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int s=2;
        while(s*s<=n)
        {
            if(n % s==0)
            {
                return false;
            }
            s++;
        }
        if(s*s>n)
        {
            return true;
        }
        return false;
    }
}
