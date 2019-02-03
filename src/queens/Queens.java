package queens;// This program solves the classic "8 queens" problem using recursive
// backtracking, printing all solutions.

import java.util.Scanner;

public class Queens {
    public static void main(String[] args) {
        giveIntro();
        Scanner console = new Scanner(System.in);
        System.out.print("What size board do you want to use? ");
        int size = console.nextInt();
        System.out.println();
        Board b = new Board(size);
        solve(b);
    }

    // post: explains program to user
    public static void giveIntro() {
        System.out.println("This program solves the classic '8 queens'");
        System.out.println("problem, placing queens on a chessboard so");
        System.out.println("that no two queens threaten each other.");
        System.out.println();
    }

    // pre : queens have been safely placed in columns 1 through (col - 1)
    // post: recursively searches the board for all solutions starting at col,
    //       and printing any solution it finds
    private static void explore(Board b, int col) {
        //Write Your Code Here
    }
          
    // post: prints all solutions to 8 queens
    public static void solve(Board b) {
        //Write Your Code Here
    }
}
