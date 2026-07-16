import java.util.*;

public class PracticeQuestions {

    public static void main(String[] args) {
        // Replace Characters
        System.out.println("--- Replace Characters ---");
        String text = "hello";
        System.out.println("Input: " + text + ", Replace 'l' with 'x'");
        System.out.println("Output: " + text.replace('l', 'x')); 

        // Move Negative Numbers to One Side
        System.out.println("\n--- Move Negatives to Left ---");
        int[] arr2 = {1, -2, 3, -4, 5};
        moveNegatives(arr2);
        System.out.println("Output: " + Arrays.toString(arr2)); 

        // Find Second Smallest Element
        System.out.println("\n--- Find Second Smallest ---");
        int[] arr3 = {5, 2, 8, 1, 3};
        System.out.println("Output: " + findSecondSmallest(arr3)); 

        // Find Duplicate Elements
        System.out.println("\n--- Find Duplicates ---");
        int[] arr4 = {1, 2, 3, 2, 4, 1};
        findDuplicates(arr4); 

        // Find Pair with Given Sum
        System.out.println("\n--- Find Pair with Sum ---");
        int[] arr5 = {2, 7, 11, 15};
        int target = 9;
        findPair(arr5, target); 

        // Merge Two Sorted Arrays
        System.out.println("\n--- Merge Sorted Arrays ---");
        int[] a = {1, 3, 5}, b = {2, 4, 6};
        System.out.println("Output: " + Arrays.toString(mergeSorted(a, b))); 
    }

    public static void moveNegatives(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
    }

    public static int findSecondSmallest(int[] arr) {
        int first = arr[0], second = arr[0];
        for (int x : arr) {
            if (x < first) {
                second = first;
                first = x;
            } else if (x < second && x != first) {
                second = x;
            }
        }
        return second;
    }

    public static void findDuplicates(int[] arr) {
        int[] valid = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                valid[count] = arr[i];
                count++;
            }
        }
        System.out.println("Output: " + Arrays.toString(valid));
    }

    public static void findPair(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("Output: [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.println("Output: No pair found");
    }

    public static int[] mergeSorted(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }
        Arrays.sort(merged);
        return merged;
    }
}