
import java.util.*;

public class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");

        int t = sc.nextInt();
        int inputArr[] = new int[t];
        System.out.println("Enter the elements: ");

        for(int i = 0; i < t; i++){ inputArr[i] = sc.nextInt(); }
        calculate(inputArr);
        sc.close();
    }

    public static void calculate(int[] arr) {

        int target = 0,result = 0,small = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > target){ 
                result = target; target = arr[i];
            }
            else if(arr[i] >result && arr[i] < target) { result = arr[i]; }

            if(small > arr[i]) { small = arr[i]; }
        }

        System.out.println("Second Largest Output : "+result);
        System.out.println("Smallest Output : "+small);
    }

}