/*

Verify a sudoku solution

Need to verify the rows, the columns, and the boxes

Illustrate how to verify row

Ask them to practise column and box

*/



import java.util.Scanner;



public class Main {

    public boolean VerifyDigitsInBoxes(){
      boolean notasolutionFlag = false;
      for (int boxrowindex= 0; boxrowindex < 3; boxrowindex++){
        // rowindex will be 3 * boxrowindex, 3*boxrowindex + 1, 3 *boxrowindex+2
        int baserowindex = 3 * boxrwindex;
        for (int boxcolindex = 0; boxcolindex < 3; boxcolindex++){
           // colindex will be 3 * boxcolindex, 3*boxcolindex +1,
           // 3*boxcolindex + 2
           int basecolindex = 3 * boxcolindex;
           boolean[] ninedigitsFlag = new boolean[10];
           for (int i=0; i<10; i++)
              ninedigitsFlag[i] = false;
           // iterate over sudokudigits[baserowindex][basecolindex],
           //                sudokudigits[baserowindex][basecolindex+1]
           //                sudokudigits[baserowindex][basecolindex+2]
           //                sudokudigits[baserowindex+1][basecolindex]
           //                   ...
           //                sudokudigiuts[baserowindex+2][basecolindex+2]
          for (int rowindex = baserowindex; rowindex < baserowindex + 3; rowindex++){
            for (int colindex = basecolindex; colindex < basecolindex + 3; colindex++){
              int curdigit = sudokudigits[rowindex][colindex];
              if ((curdigit >= 1) && (curdigit <=9 ))
                ninedigitsFlag[curdigit] = true;              
            }
          }

          for (int digit = 1; digit<=9; digit++){
            if (ninedigitsFlag[digit] == false)
                 return false;
          }
        }

      }

      return true;
    }

    public boolean VerifyDigitsInRows(){
// For each row, check whether it contains nine different digits.
        // Brute-Force Method:
        // for each digit, check each row whether it contains this nyumber
        boolean notasolutionFlag = false;
        for (int rowindex= 0; rowindex < 9; rowindex++){
          boolean[] flag = new boolean[10];
          for (int i=0; i<10; i++)
            flag[i] = false; // initialization: number 1-9 not in the row
          for (int colindex = 0; colindex < 9; colindex++){
            int curnumber = sudokudigits[rowindex][colindex];
            flag[curnumber] = true;
          }
          for (int digit = 1; digit <=9; digit++){
            if (flag[digit] != true) {
              // this digit not shown up in this row,
              // we can diretly return false (it is not a solution
              return false;
            }
          }        
         
        }

        return true;

    }



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

       



        // For each column, check whether it contains nine different digits.  



        // For each box, check whether it contains nine different digits

       

        return;  

    }

}
