package practiceit;

import java.util.Arrays;

/**
 * Created by mhan on 2/5/2017.
 */
public class PracticeItEx {
    public static void main(String[] args){
//        countBinary(3);
//        waysToClimb(0);
    }

    public static void countBinary(int n){
        countBinary(n, "");
    }

    private static void countBinary(int n, String bStr){
        if(n == bStr.length()) System.out.println(bStr);
        else {
            countBinary(n, bStr + "0");
            countBinary(n, bStr + "1");
        }
    }

    public static void waysToClimb(int n){
        waysToClimbHelper(n, "", 0);
    }

    private static void waysToClimbHelper(int n, String path, int sum){
        if(n !=0 && sum == n) System.out.println(Arrays.toString(path.split(" ")));
        else if(sum < n) {
            waysToClimbHelper(n, path + "1 ", sum + 1);
            waysToClimbHelper(n, path + "2 ", sum + 2);
        }
    }

}
