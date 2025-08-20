package JAP82.Array;

import java.util.Arrays;

public class SortingTheNumberInArray {
    public static void main(String[] args) {
        int n = 548751298;
        int length=0 , temp=n;
        while(temp!=0)
        {
            length++;
            temp/=10;
        }
        int a[]=new int[length];
        for(int i=0; i<a.length; i++)
        {
            a[i]=n%10;
            n/=10;
        }
        Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        for(int i=0; i<a.length; i++)
        {
            n*=10;
            n+=a[i];
        }
        System.out.println(n);
        // both printing output methods are use;
    }
}
