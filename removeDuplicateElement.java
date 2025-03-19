package Arrays;

public class removeDuplicateElement {
    public static void main(String[] args) {
        int a[] = {1,5,8,4,5,8,1};

        for(int i=0; i<a.length; i++)
        {
            int cnt=0;
            for(int j=0; j<i; j++)
            {
                if(a[i]==a[j])
                {
                    cnt++;
                }
            }
            if(cnt==0)
            {
                System.out.println(a[i]+ " " + i);
            }
        }
    }
}
