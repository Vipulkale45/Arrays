package JAP82.Array;
import java.util.*;
public class AppendTheSumOfAllEle {
    public static void main(String[] args) {
        int a[]={12,52,87,96,57};
        int b[]=new int[a.length*2];
        for(int i=0; i<a.length; i++)
        {
            int temp=a[i],sum=0;
            while(temp!=0)
            {
                sum+=temp%10;
                temp/=10;
            }
            b[i]=a[i];
            b[a.length+i]=sum;
        }
        System.out.println(Arrays.toString(b));
    }
}
