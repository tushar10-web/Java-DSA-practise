import java.util.Scanner;

// public class func {
//     public static void main(String[] args) {
        
//         int n=1;
//         while(n>0)
//         {
//             System.out.print("enter the two numbers : ");
//             int a,b;
//             Scanner sc= new Scanner(System.in);
//             a=sc.nextInt();
//             b=sc.nextInt();
//             System.out.println("the sum = "+(a+b));
//         }
//     }
    
// }
// public class func{
//     public static void main(String[] args) {
//         sum();
//     }
//     static void sum()
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the two numebr :");
//         int a= sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println("the sum = : "+(a+b));
    
//     }
// }
public class func{
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        String h= greet(name);
        System.out.println(h);
    }
    static String greet(String name)
    {
        String msg= "ka re "+ name+"wa";
        return msg;
    }
}