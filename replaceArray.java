package Arrays;

import java.util.Arrays;

public class replaceArray {
    public static void main(String[] args) {
        int a[]={1,2,2,2,1,2,1,1,2};
        System.out.println("after replacing array");
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==1)
            {
                a[i]=2;
            }
        }
        System.out.println( Arrays.toString(a));
    }
}
