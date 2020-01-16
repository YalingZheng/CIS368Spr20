/*
Textbook Exercise 8.19. Page 314, Pattern Recognition Four consecutive equal numbers
Write the following method that tests whether a two-dimensional array has four consecutive numbers
of the same value, either horizontally, vertically, or diagonally

Write a test program that prompts the user to enter the number of rows and columns of 
a two-dimensional array then the values in the array, and displays true if the array contains
four consecutive numbers with the same value. Otherwise, the program displays false. 
Here are some examples of the true cases. 

// last line has four consecutive 3s. 
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 6 2 1 8 2 9
6 5 6 1 1 9 1
1 3 6 1 4 0 7
3 3 3 3 4 0 7

// SECOND column has four consecurive 5s. 
0 1 0 3 1 6 1
0 1 6 8 6 0 1
5 5 2 1 8 2 9
6 5 6 1 1 9 1
1 5 6 1 4 0 7
3 5 3 3 4 0 7

// FOUR 6s are in the diagonal 
0 1 0 3 1 6 1 
0 1 6 8 6 0 1
5 6 2 1 6 2 9
6 5 6 6 1 9 1
1 3 6 1 4 0 7
3 6 3 3 4 0 7

// Four 9s are in the diagonal 
0 1 0 3 1 6 1
0 1 6 8 6 0 1
9 6 2 1 8 2 9
6 9 6 1 1 9 1
1 3 9 1 4 0 7
3 3 3 9 4 0 7
*/

import java.util.Scanner;

public class PatternRecognition{

     public static void main(String []args){
        // Define a scannner, explain this one 
        // Please refer https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        Scanner scanner = new Scanner(System.in); 
        // get the number of points
        System.out.println("Please enter the pattern six rows, seven columns: ");
        // enter 81 digits
        int[][] thedigits = new int[9][9];
        for (int row = 0 ; row < 6 ; row++)
            for (int col = 0; col < 7; col ++)
                thedigits[row][col] = scanner.nextInt();
        
        System.out.println("The input pattern is: ");
        for (int row = 0 ; row < 6 ; row++){
            System.out.println();
            for (int col = 0; col < 7; col ++){
                System.out.print(thedigits[row][col] + " ");
            }
        }
        
        // For each row, check whether it contains four consecutive digits. 

        // For each column, check whether it contains four consecutive digits.   

        // For each diagonal, check whether it contains four consecutive digits. 
        // brute-force checking, list each diagonal elements
        // A[2][0], A[3][1], A[4, 2], A[5, 3]
        // A[1][0], A[2][1], A[3, 2], A[4, 3], A[5, 4]
        // A[0][0], ........................., A[4, 4], A[5, 5]
        
        return;  
    }
}
