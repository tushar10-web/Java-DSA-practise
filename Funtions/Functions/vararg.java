import java.util.Arrays;
// Variable length arguments used when we do not know the number of the total inputs;
public class vararg {
    public static void main(String[] args) {
        fun(5,32,342,344,23,44,425,123,242,4123,13245,23431);
    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
}
