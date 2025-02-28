package Arrays;

public class searchTheEle {
    public static void main(String[] args) {
        int [] arr = {10, 5, 3, 6, 2, 8,3, 4};
        int x = 3;
        int ans = -1;

        for (int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("not found");
        }
        else
        {
        System.out.println("found " + x+ " at index " +ans);
        }

    }
}
