public class even {
    public static void main(String[] args) {
        int[] numbers = {12, 345, 2, 6, 7896};
        System.out.println(countEvenDigitNumbers(numbers));
    }

    public static int countEvenDigitNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
