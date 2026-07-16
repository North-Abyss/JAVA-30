import java.util.*;


public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int s = sc.nextInt(); int count=0; int[] arr = new int[s] , res = new int[s];

        System.out.println("Enter the elements: ");

        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                res[count]=0; count++;
            }
        }

        for(int i=0;i<s;i++){
            if(arr[i]!=0){
                res[count]=arr[i]; count++;
            }
        }

        System.out.println("The result is: "+ Arrays.toString(res));
        sc.close();

    }
}