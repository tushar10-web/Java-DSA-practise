import java.util.Arrays;

public class rangeSearch {
    public static void main(String[] args) {
        int[] n={15,354,64,1,2,3,456,51,31};
        System.out.println("The Array is : "+Arrays.toString(n));
        for(int i=3; i<n.length-1; i++)
        {
           if(n[i]==2)
           {
            System.out.println("found at index "+i);
            break;
           }
    }
    }
}
// SEARCHING IN RANGE FROM 4TH PLACE TO LAST SECOND
