package Arrays;

public class copyArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        System.out.println("Array Element of A");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        int b[] =  new int [a.length];
        System.out.println("Arrya element of B after copy ");
        {
            for(int i=0; i<b.length; i++)
            {
                b[i]=a[i];
                System.out.println(b[i]);
            }
        }
    }
}
