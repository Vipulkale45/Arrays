package JAP82.Array;

import java.util.Arrays;

public class AppendOfElemnt {
    public static void main(String[] args) {
        int a[]={124,54,65,85,40};
        for(int i=0; i<a.length;i++)
        {
            int sum=0,temp=a[i];
            while(temp!=0)
            {
                sum+=temp%10;
                temp/=10;;
            }
            if(sum<10)
            {
                a[i]*=10;
            }
            else{
                a[i]*=100;
            }
            a[i]+=sum;
        }
        System.out.println(Arrays.toString(a));

    }
}
