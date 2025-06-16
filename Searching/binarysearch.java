import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int[] n = {12, 564, 98, 31, 3, 56, 4, 13, 51, 46};
        Arrays.sort(n);  // Sort the array
        int a = 51;
        int aa = binary(n, a);
        System.out.println("Sorted Array: " + Arrays.toString(n));
        System.out.println("Index of " + a + " is: " + aa);
    }

    static int binary(int arr[], int tar) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (tar < arr[mid]) {
                end = mid - 1;
            } else if (tar > arr[mid]) {
                st = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
