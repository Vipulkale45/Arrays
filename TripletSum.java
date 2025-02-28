package Arrays;

import java.util.Scanner;

// Find the total number of pairs in the array whose sum is equal to the given value x
public class TripletSum {
    static int tripletSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
                  
        return ans; // ✅ Fixed: Added return statement
    }


//public class que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum");
        int target = sc.nextInt();

        // ✅ Fixed: Call method with correct class reference
        System.out.println("Number of pairs with sum " + target + ": " + TripletSum.tripletSum(arr, target));

        sc.close(); // ✅ Fixed: Close scanner
    }
}

