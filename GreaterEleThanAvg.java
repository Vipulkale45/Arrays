package JAP82.Array;
//WAP to find greater element than Avg of array
public class GreaterEleThanAvg {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum+=a[i];
        }
        double avg = sum/a.length;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>avg)
                System.out.println(a[i]);
        }
    }
}
