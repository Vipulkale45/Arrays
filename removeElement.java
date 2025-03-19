package Arrays;

public class removeElement {
    public static void main(String[] args) {
        int a[]= {1,2,3,4};
        int ele=4;
        for(int i=0; i<a.length;i++)
		{
			if(a[i]==ele)
			{
				continue;
			}
			System.out.println(a[i]);
		}
    }
}
