//Programmer: John Bedlington
//Date: 2/25/2023
//Class: CS &145
//Assignment: Lab 5
//This program will  give the solution to the towers of Hanoi puzzle
//with 3 towers and 4 disks using recursion

public class Main {

    //sets the number of disks and calls the recursive method
    public static void main(String[] args) {
        int n =4; //number of disks
        solve(n, "Tower 1", "Tower 2", "Tower 3");
    }//end of main method

    // Solves towers of hanoi puzzle using recursion
    private static void solve(int n, String sourceTower, String targetTower, String tempTower) {

        if (n == 1) {

            System.out.println(sourceTower + " => " + targetTower);

        } else {

            solve(n - 1, sourceTower, tempTower, targetTower);

            System.out.println(sourceTower + " => " + targetTower);

            solve(n - 1, tempTower, targetTower, sourceTower);
        }
    }//end of solve method
}//end of class
