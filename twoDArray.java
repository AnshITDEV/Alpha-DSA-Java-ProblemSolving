/* 


## 2D Arrays - Index

| Sr. No. | Program                                    | Time Complexity | Space Complexity |
| :-----: | ------------------------------------------ | :-------------: | :--------------: |
|    1    | Matrix Input & Output (Basic Traversal)    |   **O(N × M)**  |     **O(1)**     |
|    2    | Search a Key in 2D Matrix (Brute Force)    |   **O(N × M)**  |     **O(1)**     |
|    3    | Spiral Matrix Traversal                    |   **O(N × M)**  |     **O(1)**     |
|    4    | Diagonal Sum (Optimized)                   |     **O(N)**    |     **O(1)**     |
|    5    | Staircase Search (Search in Sorted Matrix) |   **O(N + M)**  |     **O(1)**     |

---

### Complexity Summary

| Complexity     | Programs                                                                                |
| -------------- | --------------------------------------------------------------------------------------- |
| **O(N × M)**   | Matrix Input & Output, Search a Key in 2D Matrix (Brute Force), Spiral Matrix Traversal |
| **O(N)**       | Diagonal Sum (Optimized)                                                                |
| **O(N + M)**   | Staircase Search (Search in Sorted Matrix)                                              |
| **O(1) Space** | All Programs                                                                            |


// ------------------------------------------------------------
// Matrix Input & Output (Basic Traversal)
//
// TC: O(N × M)
// Reason: Every element of the matrix is visited once for input and once for output.
//
// SC: O(1)
// Reason: No extra space is used apart from the given matrix.
// ------------------------------------------------------------

import java.util.Scanner;

public class twoDArray {

       public static void main(String args[]) {

              int matrix[][] = new int[3][3];

              Scanner sc = new Scanner(System.in);

              int rows = matrix.length;
              int cols = matrix[0].length;

              // Input
              for (int i = 0; i < rows; i++) {

                     for (int j = 0; j < cols; j++) {
                            matrix[i][j] = sc.nextInt();
                     }
              }

              // Output
              for (int i = 0; i < rows; i++) {

                     for (int j = 0; j < cols; j++) {
                            System.out.print(matrix[i][j] + " ");
                     }

                     System.out.println();
              }

              sc.close();
       }
}

// ------------------------------------------------------------
// Search a Key in 2D Matrix (Brute Force)
//
// TC: O(N × M)
// Reason: Every element may be visited once in the worst case.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class twoDArray {

       public static boolean brute(int matrix[][], int key) {

              for (int i = 0; i < matrix.length; i++) {

                     for (int j = 0; j < matrix[0].length; j++) {

                            if (matrix[i][j] == key) {

                                   System.out.println("Key Found at (" + i + "," + j + ")");
                                   return true;
                            }
                     }
              }

              return false;
       }

       public static void main(String args[]) {

              int matrix[][] = {
                            { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 16, 26, 36, 46 },
                            { 17, 27, 37, 47 }
              };

              int key = 27;

              System.out.println(brute(matrix, key));
       }
}

// ------------------------------------------------------------
// Spiral Matrix Traversal
//
// TC: O(N × M)
// Reason: Every element is printed exactly once.
//
// SC: O(1)
// Reason: No extra array or data structure is used.
// ------------------------------------------------------------

public class twoDArray {

       public static void printSpiral(int matrix[][]) {

              int startRow = 0;
              int startCol = 0;
              int endRow = matrix.length - 1;
              int endCol = matrix[0].length - 1;

              while (startRow <= endRow && startCol <= endCol) {

                     // Top
                     for (int j = startCol; j <= endCol; j++) {
                            System.out.print(matrix[startRow][j] + " ");
                     }

                     // Right
                     for (int i = startRow + 1; i <= endRow; i++) {
                            System.out.print(matrix[i][endCol] + " ");
                     }

                     // Bottom
                     if (startRow < endRow) {

                            for (int j = endCol - 1; j >= startCol; j--) {
                                   System.out.print(matrix[endRow][j] + " ");
                            }
                     }

                     // Left
                     if (startCol < endCol) {

                            for (int i = endRow - 1; i >= startRow + 1; i--) {
                                   System.out.print(matrix[i][startCol] + " ");
                            }
                     }

                     startRow++;
                     startCol++;
                     endRow--;
                     endCol--;
              }
       }

       public static void main(String args[]) {

              int matrix[][] = {
                            { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 }
              };

              printSpiral(matrix);
       }
}



// ------------------------------------------------------------
// Diagonal Sum (Optimized)
//
// TC: O(N)
// Reason: Traverses only the primary and secondary diagonals once.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

public class twoDArray {

       public static int diagonalSum(int matrix[][]) {

              int sum = 0;
              int n = matrix.length;

              for (int i = 0; i < n; i++) {

                     // Primary Diagonal
                     sum += matrix[i][i];

                     // Secondary Diagonal
                     if (i != n - 1 - i) {
                            sum += matrix[i][n - 1 - i];
                     }
              }

              return sum;
       }

       public static void main(String args[]) {

              int matrix[][] = {
                            { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 }
              };

              System.out.println(diagonalSum(matrix));
       }
}

// ------------------------------------------------------------
// Staircase Search (Search in Sorted Matrix)
//
// TC: O(N + M)
// Reason: In each step, either one row or one column is eliminated.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class twoDArray {

       public static boolean staircaseSearch(int matrix[][], int key) {

              int row = 0;
              int col = matrix[0].length - 1;

              while (row < matrix.length && col >= 0) {

                     if (matrix[row][col] == key) {

                            System.out.println("Key Found at (" + row + "," + col + ")");
                            return true;
                     } else if (key < matrix[row][col]) {
                            col--;
                     } else {
                            row++;
                     }
              }

              System.out.println("Key Not Found");
              return false;
       }

       public static void main(String args[]) {

              int matrix[][] = {
                            { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 27, 29, 37, 48 },
                            { 32, 33, 39, 50 }
              };

              int key = 33;

              staircaseSearch(matrix, key);
       }
}




*/


