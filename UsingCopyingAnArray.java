package JAP82.Array;

import java.util.Arrays;

public class UsingCopyingAnArray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]=new int[a.length];
        for(int i=0; i<a.length; i++)
        {
            b[i]=a[i];
        }
        int c[]=Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(a==c);
        System.out.println(a==b);
    }
}
