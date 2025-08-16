package JAP82.Array;

public class MaxElementArray {
    public static void main(String[] args) {
        int a[]={10,20,100,50,90,40};
        int max=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }            
        }
        System.out.println(max);
    }
}
