package JAP82.Array;

import java.util.Arrays;

public class UsingAnonumousWay {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{100,20,30,40,50}));
        int value = new int[]{10,20,30,40}[2];
        System.out.println(value);
        int size = new int[]{10,20,30,40}.length;
        System.out.println(size);
    }
}
