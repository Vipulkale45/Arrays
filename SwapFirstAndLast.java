package JAP82.Array;

import java.util.Arrays;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int temp = a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
       System.out.println(Arrays.toString(a));
    }
}
