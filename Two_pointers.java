package Arrays;

import java.util.Scanner;

public class Two_pointers {
    // Printing statement of array
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
 //Swapping method

    static void swap(int[] arr, int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp; 
    }

// Sort an array consisting of only 0s and 1s

    static void sortZerosAndOnes(int[] arr){
        int n = arr.length;
        int zeros =0;

        for(int i=0; i<n; i++){
            if (arr[i] == 0) {
                zeros++;
            }
        }

        for(int i=0; i<n; i++)
        {
            if (i<zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1; 
            }
        }
    }

    static void sortArrayByParity(int[] arr , int i , int j){
        int n =arr.length;
        int left = 0; 
        int right = n-1;

        while (left<right){
            if(arr[left] %2 ==1 && arr[right]%2==0){
                swap(arr , left, right);
                left++;
                right--;
            }

            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }

    }
// main body
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " +n+ "element");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("original array");
        printArray(arr);
        sortArrayByParity(arr);
       // sortZerosAndOnes(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
