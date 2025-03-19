package Arrays;

public class EuilityOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
        int cnt=0;
        if(a.length==b.length)
        {
            for(int i=0; i<a.length; i++)
            {
                if(a[i]!=b[i])
                {
                    cnt++;
                }
            }
            if(cnt==0)
            {
                System.out.println("Element are equal");
            }
            else
			{
				System.out.println("Elements are not equal");
			}
        }
        else{
            System.out.println("Both are equal array length");
        }
    }
}
