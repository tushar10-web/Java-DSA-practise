import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        n=sc.nextInt();
        System.out.print ("the reverse of the number will be: ");
        while(n>0)
        {
            int a;
            a=n%10;
            n/=10;
            System.out.print(a+",");
        }
    }
    
}
