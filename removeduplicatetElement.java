package Arrays;

public class removeduplicatetElement {
    public static void main(String[] args) {
        int a[] = {1,1,3,4,2,1,4,5};

        for(int i=0; i<a.length; i++)
        {
            int cnt=0;
            for(int j=i+1; j<a.length; j++)
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
