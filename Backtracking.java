/*

## Backtracking - Index

| Sr. No. | Program                                  |  Time Complexity | Space Complexity |
| :-----: | ---------------------------------------- | :--------------: | :--------------: |
|    1    | Change Array (Backtracking)              |     **O(N)**     |     **O(N)**     |
|    2    | Find All Subsets (Power Set)             |     **O(2ᴺ)**    |     **O(N)**     |
|    3    | Find All Permutations                    |   **O(N × N!)**  |     **O(N)**     |
|    4    | N-Queens (Print All Solutions)           |   **O(N! × N)**  |     **O(N)**     |
|    5    | N-Queens (Count Solutions)               |   **O(N! × N)**  |     **O(N)**     |
|    6    | N-Queens (Print One Solution)            |   **O(N! × N)**  |     **O(N)**     |
|    7    | Grid Ways (Unique Paths - Combinatorics) | **O(min(N, M))** |     **O(1)**     |
|    8    | Sudoku Solver                            |   **O(9^(N²))**  |     **O(N²)**    |

---

## Complexity Summary

| Complexity       | Programs                                                                                  |
| ---------------- | ----------------------------------------------------------------------------------------- |
| **O(N)**         | Change Array (Backtracking)                                                               |
| **O(min(N, M))** | Grid Ways (Unique Paths)                                                                  |
| **O(2ᴺ)**        | Find All Subsets (Power Set)                                                              |
| **O(N × N!)**    | Find All Permutations                                                                     |
| **O(N! × N)**    | N-Queens (Print All Solutions), N-Queens (Count Solutions), N-Queens (Print One Solution) |
| **O(9^(N²))**    | Sudoku Solver                                                                             |
| **O(1) Space**   | Grid Ways (Unique Paths)                                                                  |
| **O(N) Space**   | Change Array, Find All Subsets, Find All Permutations, All N-Queens Variants              |
| **O(N²) Space**  | Sudoku Solver                                                                             |




// ------------------------------------------------------------
// Backtracking | Change Array
//
// TC: O(N)
// Reason: Each array element is visited once during recursion.
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

public class Backtracking {

       public static void changeArr(int arr[], int i, int j, int val) {

              if(i == j) {
                     printArr(arr);
                     return;
              }

              arr[i] = val;

              changeArr(arr, i + 1, j, val + 1);

              // Backtracking
              arr[i] = arr[i] - 2;
       }

       public static void printArr(int arr[]) {

              for(int i = 0; i < arr.length; i++) {
                     System.out.print(arr[i] + " ");
              }

              System.out.println();
       }

       public static void main(String args[]) {

              int arr[] = new int[5];

              changeArr(arr, 0, arr.length, 1);

              printArr(arr);
       }
}


// ------------------------------------------------------------
// Backtracking | Find All Subsets (Power Set)
//
// TC: O(2^N)
// Reason: Every character has two choices (include or exclude).
//
// SC: O(N)
// Reason: Recursion call stack depth is at most N.
// ------------------------------------------------------------

public class Backtracking {

       public static void findSubsets(String str, StringBuilder ans, int i) {

              if(i == str.length()) {

                     if(ans.length() == 0) {
                            System.out.println("NULL");
                     }
                     else {
                            System.out.println(ans.toString());
                     }

                     return;
              }

              // Include current character
              ans.append(str.charAt(i));
              findSubsets(str, ans, i + 1);

              // Backtracking
              ans.deleteCharAt(ans.length() - 1);

              // Exclude current character
              findSubsets(str, ans, i + 1);
       }

       public static void main(String args[]) {

              String str = "abc";

              findSubsets(str, new StringBuilder(), 0);
       }
}


// ------------------------------------------------------------
// Backtracking | Find All Permutations
//
// TC: O(N × N!)
// Reason: There are N! permutations and each takes O(N) to build.
//
// SC: O(N)
// Reason: Recursion call stack depth is at most N.
// ------------------------------------------------------------

public class Backtracking {

       public static void findPermutations(String str, String ans) {

              if(str.length() == 0) {
                     System.out.println(ans);
                     return;
              }

              for(int i = 0; i < str.length(); i++) {

                     char curr = str.charAt(i);

                     String newStr = str.substring(0, i)
                                   + str.substring(i + 1);

                     findPermutations(newStr, ans + curr);
              }
       }

       public static void main(String args[]) {

              findPermutations("abc", "");
       }
}



// ------------------------------------------------------------
// Backtracking | N-Queens (Print All Solutions)
//
// TC: O(N! × N)
// Reason: Tries every possible queen placement and each safety check takes O(N).
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

public class Backtracking {

       public static boolean isSafe(char board[][], int row, int col) {

              // Up
              for(int i = row - 1; i >= 0; i--) {
                     if(board[i][col] == 'Q') {
                            return false;
                     }
              }

              // Upper Right Diagonal
              for(int i = row - 1, j = col + 1;
                  i >= 0 && j < board.length;
                  i--, j++) {

                     if(board[i][j] == 'Q') {
                            return false;
                     }
              }

              // Upper Left Diagonal
              for(int i = row - 1, j = col - 1;
                  i >= 0 && j >= 0;
                  i--, j--) {

                     if(board[i][j] == 'Q') {
                            return false;
                     }
              }

              return true;
       }

       public static void nQueens(char board[][], int row) {

              if(row == board.length) {
                     System.out.println("------ Chess Board ------");
                     printBoard(board);
                     return;
              }

              for(int j = 0; j < board.length; j++) {

                     if(isSafe(board, row, j)) {

                            board[row][j] = 'Q';

                            nQueens(board, row + 1);

                            // Backtracking
                            board[row][j] = '.';
                     }
              }
       }

       public static void printBoard(char board[][]) {

              for(int i = 0; i < board.length; i++) {

                     for(int j = 0; j < board.length; j++) {
                            System.out.print(board[i][j] + " ");
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              int n = 4;

              char board[][] = new char[n][n];

              for(int i = 0; i < n; i++) {
                     for(int j = 0; j < n; j++) {
                            board[i][j] = '.';
                     }
              }

              nQueens(board, 0);
       }
}


// ------------------------------------------------------------
// Backtracking | N-Queens (Count Solutions)
//
// TC: O(N! × N)
// Reason: Explores all valid queen placements and each safety check takes O(N).
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

public class Backtracking {

       static int count = 0;

       public static boolean isSafe(char board[][], int row, int col) {

              for(int i = row - 1; i >= 0; i--) {
                     if(board[i][col] == 'Q') {
                            return false;
                     }
              }

              for(int i = row - 1, j = col + 1;
                  i >= 0 && j < board.length;
                  i--, j++) {

                     if(board[i][j] == 'Q') {
                            return false;
                     }
              }

              for(int i = row - 1, j = col - 1;
                  i >= 0 && j >= 0;
                  i--, j--) {

                     if(board[i][j] == 'Q') {
                            return false;
                     }
              }

              return true;
       }

       public static void nQueens(char board[][], int row) {

              if(row == board.length) {
                     count++;
                     return;
              }

              for(int j = 0; j < board.length; j++) {

                     if(isSafe(board, row, j)) {

                            board[row][j] = 'Q';

                            nQueens(board, row + 1);

                            // Backtracking
                            board[row][j] = '.';
                     }
              }
       }

       public static void main(String args[]) {

              int n = 4;

              char board[][] = new char[n][n];

              for(int i = 0; i < n; i++) {
                     for(int j = 0; j < n; j++) {
                            board[i][j] = '.';
                     }
              }

              nQueens(board, 0);

              System.out.println("Total Number of Solutions = " + count);
       }
}


// ------------------------------------------------------------
// Backtracking | N-Queens (Print One Solution)
//
// TC: O(N! × N)
// Reason: Tries possible queen placements until one valid solution is found.
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

public class Backtracking {

       public static boolean isSafe(char board[][], int row, int col) {

              for(int i = row - 1; i >= 0; i--) {
                     if(board[i][col] == 'Q') {
                            return false;
                     }
              }

              for(int i = row - 1, j = col + 1;
                  i >= 0 && j < board.length;
                  i--, j++) {

                     if(board[i][j] == 'Q') {
                            return false;
                     }
              }

              for(int i = row - 1, j = col - 1;
                  i >= 0 && j >= 0;
                  i--, j--) {

                     if(board[i][j] == 'Q') {
                            return false;
                     }
              }

              return true;
       }

       public static boolean nQueens(char board[][], int row) {

              if(row == board.length) {
                     printBoard(board);
                     return true;
              }

              for(int j = 0; j < board.length; j++) {

                     if(isSafe(board, row, j)) {

                            board[row][j] = 'Q';

                            if(nQueens(board, row + 1)) {
                                   return true;
                            }

                            // Backtracking
                            board[row][j] = '.';
                     }
              }

              return false;
       }

       public static void printBoard(char board[][]) {

              for(int i = 0; i < board.length; i++) {

                     for(int j = 0; j < board.length; j++) {
                            System.out.print(board[i][j] + " ");
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              int n = 4;

              char board[][] = new char[n][n];

              for(int i = 0; i < n; i++) {
                     for(int j = 0; j < n; j++) {
                            board[i][j] = '.';
                     }
              }

              nQueens(board, 0);
       }
}




// ------------------------------------------------------------
// Backtracking | Grid Ways (Unique Paths)
//
// TC: O(min(N, M))
// Reason: Computes the answer using the combination formula in linear time with respect to the smaller dimension.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class Backtracking {

       public static int gridWays(int n, int m) {

              int N = (n - 1) + (m - 1);
              int r = Math.min(n - 1, m - 1);

              int res = 1;

              for(int i = 1; i <= r; i++) {

                     res = res * (N - r + i) / i;
              }

              return res;
       }

       public static void main(String args[]) {

              int n = 3;
              int m = 3;

              System.out.println(gridWays(n, m));
       }
}


// ------------------------------------------------------------
// Backtracking | Sudoku Solver
//
// TC: O(9^(N²))
// Reason: In the worst case, every empty cell tries all 9 digits recursively.
//
// SC: O(N²)
// Reason: Uses recursion stack proportional to the Sudoku board.
// ------------------------------------------------------------

public class Backtracking {

       public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

              // Column Check
              for(int i = 0; i <= 8; i++) {

                     if(sudoku[i][col] == digit) {
                            return false;
                     }
              }

              // Row Check
              for(int j = 0; j <= 8; j++) {

                     if(sudoku[row][j] == digit) {
                            return false;
                     }
              }

              // 3 x 3 Grid Check
              int sr = (row / 3) * 3;
              int sc = (col / 3) * 3;

              for(int i = sr; i < sr + 3; i++) {

                     for(int j = sc; j < sc + 3; j++) {

                            if(sudoku[i][j] == digit) {
                                   return false;
                            }
                     }
              }

              return true;
       }

       public static boolean sudokuSolver(int sudoku[][], int row, int col) {

              if(row == 9) {
                     return true;
              }

              int nextRow = row;
              int nextCol = col + 1;

              if(col + 1 == 9) {
                     nextRow = row + 1;
                     nextCol = 0;
              }

              if(sudoku[row][col] != 0) {
                     return sudokuSolver(sudoku, nextRow, nextCol);
              }

              for(int digit = 1; digit <= 9; digit++) {

                     if(isSafe(sudoku, row, col, digit)) {

                            sudoku[row][col] = digit;

                            if(sudokuSolver(sudoku, nextRow, nextCol)) {
                                   return true;
                            }

                            // Backtracking
                            sudoku[row][col] = 0;
                     }
              }

              return false;
       }

       public static void printSudoku(int sudoku[][]) {

              for(int i = 0; i < 9; i++) {

                     for(int j = 0; j < 9; j++) {

                            System.out.print(sudoku[i][j] + " ");
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              int sudoku[][] = {
                     {0,0,8,0,0,0,0,0,0},
                     {4,9,0,1,5,7,0,0,2},
                     {0,0,3,0,0,4,1,9,0},
                     {1,8,5,0,6,0,0,2,0},
                     {0,0,0,0,2,0,0,6,0},
                     {9,6,0,4,0,5,3,0,0},
                     {0,3,0,0,7,2,0,0,4},
                     {0,4,9,0,3,0,0,5,7},
                     {8,2,7,0,0,9,0,1,3}
              };

              if(sudokuSolver(sudoku, 0, 0)) {

                     System.out.println("Solution Exists");

                     printSudoku(sudoku);
              }
              else {

                     System.out.println("Solution Does Not Exist");
              }
       }
}

 */    