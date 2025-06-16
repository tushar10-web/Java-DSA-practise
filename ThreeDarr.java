import java.util.Arrays;
import java.util.Scanner;

public class ThreeDarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements of 3*3 matrix");
        int[][] arr=new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
        {
            System.out.println("["+(i+1)+" "+(j+1)+"]");
            arr[i][j]=sc.nextInt();
        }
        }
        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<3; j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println("");
        // }
        for(int i=0; i<3; i++)
        System.out.println(Arrays.toString(arr[i]));
    }
    
}
