import java.util.Scanner;

public class swtch {
    public static void main(final String[] args) {
        System.out.println("Mango, Orange , Apple , kiwi");
        System.out.println("Select the fruit to know its price : ");
        final Scanner sc=new Scanner(System.in);
        final String fruit = sc.next();
        switch (fruit) {
            case "Mango":
                System.out.println("150 $");
                
                break;
                case "Orange":
                System.out.println("12 $");
                break;
                case "Apple" :
                System.out.println("456 $");
                break;
                case "Kiwi":
                System.out.println("9566 $");
                break;
                // case Exit:
                // return 0;
        
            default:
            System.out.println("Please select valid fruit :");
                break;
        }

    }
}
