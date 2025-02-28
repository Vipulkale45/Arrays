package Arrays;

class ArrayEx{

    void sumOfArray(){

        int [] arr = {1, 2 ,4, 6, 1};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum +arr[i] ;
        }
        System.out.println(sum);

    }
 void multiArray(){
    int[][] arr = {{50, 54 , 74}, {87, 58, 95}, };

    System.out.println((arr [0][0]));
    System.out.println((arr [0][1]));
    System.out.println((arr [0][2]));

    System.out.println((arr [1][0]));
    System.out.println((arr [1][1]));
    System.out.println((arr [1][2]));


    for(int i = 0; i<arr.length; i++ ){
        for( int j=0; j<arr[i].length; j++){
            System.out.println(arr[i][j]);
        }
    }
    
 }

    void demoArrays(){
        int [] ages = new int[3];
        float [] weights = new float[3];
        String[] names = {"rahul", "raj", "araadhya"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        //for loop 
        for (int i=0; i<3; i++){
            System.out.println(ages[i]);
        }

        // for each loop
        for(int age : ages){
            System.out.println(age);
        }

        // while loop
        int i = 0;
        while(i<3){
            System.out.println(ages[i]);
            i = i+1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayEx obj = new ArrayEx();
        //obj.demoArrays();
        //obj.multiArray();
        obj.sumOfArray();
        
    }
}
