package dice;// Helene Martin, CSE 143

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        diceRoll(5);
//        diceSum(3, 7);
        // diceSum(5, 7);
//        diceSum(15, 87);
    }

    // Prints all possible outcomes of rolling the given
    // number of six-sided dice in [#, #, #] format.
    // pre: dice >= 0
    public static void diceRoll(int dice) {
        //Implement Your Code

    }

    //helper of diceRoll
    //Often we use the same name (method overload)
    private static void diceRoll(int dice, List<Integer> soFar) {
        //Implement Your Code
    }

    // Prints all possible outcomes of rolling the given
    // number of six-sided dice that add up to exactly
    // the given sum, in [#, #, #] format.
    public static void diceSum(int dice, int sum) {
        //Implement Your Code
    }

    private static void diceSum(int dice, int sum, List<Integer> soFar, int sumSoFar) {
        //Implement Your Code
    }
}
