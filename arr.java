import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number students : ");
        int n=sc.nextInt();
        String[] name=new String[n];
        for(int i=0; i<n; i++)
        {

            System.out.println("Enter the name of student "+(i+1));
             name[i]=sc.next();

        }System.out.println("The students are : ");
        System.out.println(Arrays.toString(name));
    }
    
}
