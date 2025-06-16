import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        /* COMMON METHOD 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numebrs to compare");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int lar;
        if (a>b && a>c)
        lar=a;
        else if(b>a && b>c)
        lar =b;
        else 
        lar=c;
        System.out.println("Largest number ="+ lar);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numebrs to compare");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(c,Math.max(a, b));
        System.out.println("Largest = "+max);
 }
    
}
