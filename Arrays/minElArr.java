import java.util.Arrays;

public class minElArr {
    public static void main(String[] args) {
        int[] n={45,-61,-65456,161,30,6,2,103,1,2154,2160,
        21};
        int min=n[0];
        System.out.println("The array is : "+Arrays.toString(n));
        
        for(int i=0; i<n.length; i++)
        {
           
            if(n[i]<min)
            {
                min=n[i];
                
            }
           
            i++;
        }
        System.out.println("The minimum element in array is : "+min);
    }
    
}
