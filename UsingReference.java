package JAP82.Array;

import java.util.Arrays;

public class UsingReference {
    public static void main(String[] args) {
        int a[]=new int [3];
        int b[] = a;
        a[0]=10;
        a[1]=20;
        a[2]=30;
        System.out.println(Arrays.toString(a));
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
