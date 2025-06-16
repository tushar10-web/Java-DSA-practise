import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements of fibonacci : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0, b=1;
        int x=2;
        System.out.print(a+","+b+",");
        while(x<=num)
        {
            int temp =b;
            b=b+a;
            a=temp;
            x++;
            System.out.print(b+"," );
        }

    }
    
}
