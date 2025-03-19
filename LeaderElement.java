package Arrays;

public class LeaderElement {
    public static void main(String[] args) {
        int [] a = {110, 120, 20, 400, 15};
        for(int i=0; i<a.length; i++)
        {
            int count=0;
            for(int j=i+1; j<a.length; j++)
            {

                if(a[i]<=a[j])
                {
                    count++;
                    break;
                }
            }
            if(count==0)
			{
				System.out.println("Leader element " + a[i]);
			}
        }
    }
}
