package JAP82.Array;

import java.util.Arrays;

public class ReverseEachElement {
    public static void main(String[] args) {
        int a[]={548,457,124,341,875};
        for(int i=0; i<a.length; i++)
        {
            int num=a[i];
            int rev=0;
            while(num>0)
            {
                int digit=num%10;
                rev=rev*10+digit;
                num/=10;
            }
            a[i]=rev;
        }
        System.out.println(Arrays.toString(a));
    }
}
