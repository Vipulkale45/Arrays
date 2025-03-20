package Arrays;

public class FindMax_Min_Element {
    public static void main(String[] args) {
        int a[]= {20,40,50,90};
		
		int max=0;
		int min =0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max element in array a " + max);
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min element in array a " + min);

    }
}
