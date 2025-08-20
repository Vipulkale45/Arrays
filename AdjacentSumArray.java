package JAP82.Array;
import java.util.Arrays;
public class AdjacentSumArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        b[0]=a[0];
        for(int i=1; i<a.length; i++)
        {
            b[i]=a[i-1]+a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
//input:-  {1,2,3,4,5}
//output:- [1, 3, 5, 7, 9]