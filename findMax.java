package Arrays;

public class findMax {
    public static void main(String[] args) {
    int [] arr ={5, 3, 2, 6 , 8 ,4};

    int ans = 0;

    for(int i =0; i<arr.length ; i++){
        if(arr[i]>ans){
            ans = arr[i];
        }
    }

    System.out.println("max " + ans);
}
}