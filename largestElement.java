package Arrays;

public class largestElement {
    public static void main(String[] args) {
        int a [] = {12, 54, 89, 45};
        int max=a[0];

        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                
            }
        }
        System.out.println("Largest element in the array = " + max);
    }

}
