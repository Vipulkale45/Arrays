package Arrays;

import java.util.Scanner;

// Find the total number of pairs in the array whose sum is equal to the given value x
public class Uniquie_element {
    static int uniquie_element(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++ ){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]= -1;
                    arr[j]= -1;
                }
            }
        }

        int ans = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans = arr[i];
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
        // ✅ Fixed: Call method with correct class reference
        System.out.println("uniquie element" + Uniquie_element.uniquie_element(arr));

        sc.close(); // ✅ Fixed: Close scanner
    }
}

