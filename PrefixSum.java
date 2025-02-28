package Arrays;
import java.util.*;

public class PrefixSum {

    // Function to print an array
 /*    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print in a single line
        }
        System.out.println(); // New line for better formatting
    }
*/
    // Function to create prefix sum array
    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

       // System.out.println("Input array:");
       // printArray(arr);

        int[] pref = makePrefixSumArray(arr);

        //System.out.println("Prefix sum array:");
      //  printArray(pref); // Fixed: Now printing the prefix sum array
      System.out.println("Enter number of queries:");
      int q = sc.nextInt();

      while(q-->0)
    {
        System.out.println("Enter range");
        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans=pref[r] - pref[l-1];

        System.out.println("Sum " + ans);
    }

        sc.close(); // Closing scanner to avoid memory leak
    }
}
