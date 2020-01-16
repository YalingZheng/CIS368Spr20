/*
Verify a sudoku solution
Need to verify the rows, the columns, and the boxes
Illustrate how to verify row
Ask them to practise column and box 
*/

import java.util.Scanner;

public class VerifySudokuSolution{

     public static void main(String []args){
        // Define a scannner, explain this one 
        // Please refer https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
        Scanner scanner = new Scanner(System.in); 
        // get the number of points
        System.out.println("Please enter the sudoku solution: ");
        // enter 81 digits
        int[][] sudokudigits = new int[9][9];
        for (int row = 0 ; row < 9 ; row++)
            for (int col = 0; col < 9; col ++)
                sudokudigits[row][col] = scanner.nextInt();
        
        System.out.println("The input sudoku is: ");
        for (int row = 0 ; row < 9 ; row++){
            System.out.println();
            for (int col = 0; col < 9; col ++){
                System.out.print(sudokudigits[row][col] + " ");
            }
        }
        // For each row, check whether it contains nine different digits. 

        // For each column, check whether it contains nine different digits.  

        // For each box, check whether it contains nine different digits
        
        return;  
    }
}
