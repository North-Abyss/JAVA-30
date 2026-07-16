
import java.util.*;

public class example{
    public static void main(String[] args) {
        task4();
    }

/* Task 4: Fibonacci Series */

    static void task4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("The Fibonacci series Last Number :");
        int n = sc.nextInt(),a=0,b=1,c=0;
        for(int i=1;i<n;i++){
            c=a+b;
            if(c<n) System.out.print(c+" ");
            a=b;b=c;
        }

        sc.close();
    } 

/* Remove Duplicate 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int s = sc.nextInt();int[] arr = new int[s];

        System.out.println("Enter the elements: ");
        
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }

        int count=0;
        
        for(int i =0;i<s;i++){
            if(arr[i] != 0){ 
                arr[count]=arr[i]; count++;
            }
        }
        for(int i = count;i<s;i++){ arr[i]=0; }

        System.out.println("The result is: "+ Arrays.toString(arr));
        sc.close();


        ---

        System.out.print("Enter the size: ");
        int s = sc.nextInt();int[] arr = new int[s] , res = new int[s];

        System.out.println("Enter the elements: ");
        
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }
        // remove duplicates in a array
        // 12233 to 123 
        int uni=0;

        for(int i=0;i<s;i++){
            
            for(int j=uni;j<s;j++){
                if(arr[i]==arr[j]){
                    uni=0;break;
                }
            }
            if(uni!=-1){
                res[uni]=arr[i];uni++;
            }
        }
        System.out.println("The result is: "+ Arrays.toString(res));

        ---

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int s = sc.nextInt();int[] arr = new int[s];

        System.out.println("Enter the elements: ");
        
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target: ");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }

        sc.close();

        ---
        int count =0;
        //vowels count
        String vowels ="aeiouAEIOU";
        for(int i =0;i<str.length();i++){
            if( vowels.indexOf(str.charAt(i)) != -1 ) count++;
        }

        System.out.println("The number of vowels in the string is: "+count);



        
*/

/* Diamond 
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number: ");
        int n = 4;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();


*/

}


