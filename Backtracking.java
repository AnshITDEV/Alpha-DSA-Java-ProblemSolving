/* Backtracking | Recursion | Arrays
1 2 3 4 5
-1 0 1 2 3

TC: O(n)
SC: O(n)

public class Backtracking
{
       public static void changeArr(int arr[], int i, int j, int val)
       {
              if(i == j)
              {
                     printArr(arr);
                     return;
              }

              arr[i] = val;
              
              changeArr(arr,i+1,j,val+1);

              arr[i] = arr[i] - 2;
       }

       static void printArr(int arr[])
       {
              for (int i = 0; i < arr.length; i++)
              {
                     System.out.print(arr[i] + " ");
              }
              System.out.println();
       }

       public static void main(String args[])
       {
              int arr[] = new int[5];

              changeArr(arr,0,arr.length,1);

              printArr(arr);
       }
}

*/

/*

Backtracking|Recursion|Subsets(Power Set)
TC:O(2^n)
SC:O(n)

class Backtracking
{

       public static void findSubsets(String str,StringBuilder ans, int i)
       {
              
              if(i == str.length())
              {
                     if(ans.length() == 0)
                     {
                            System.out.println("NULL");
                     }
                     else
                     {
                            System.out.println(ans.toString());
                     }
                     return;
              }

              ans.append(str.charAt(i));
              findSubsets(str,ans,i+1);

              ans.deleteCharAt(ans.length()-1);

              findSubsets(str, ans, i+1);

       }


       public static void main(String args[])
       {
              String str = "abc";
              findSubsets(str,new StringBuilder(),0);
       }
}

*/

/* Backtracking | Recursion | Permutations
TC: O(n!)
SC: O(n)


class Backtracking
{

       public static void findPermutations(String str,String ans)
       {
              if(str.length() == 0)
              {
                     System.out.println(ans);
                     return;
              }
              
              for(int i = 0; i < str.length(); i++)
              {
                     char curr = str.charAt(i);
                     String newStr = str.substring(0,i) + str.substring(i+1);
                     findPermutations(newStr, ans+curr);
              }
       }
       public static void main(String args[])
       {
              findPermutations("abc","");
       }
       
}

*/

/* Backtracking | Recursion | N-Queens
TC: O(n! × n)
SC: O(n)


public class Backtracking
{
       public static boolean isSafe(char board[][], int row, int col)
       {
              //up
              for(int i=row-1; i>=0; i--)
              {
                     if(board[i][col] == 'Q')
                     {
                            return false;
                     }
              }

              //diagonal right
              for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++)
              {
                     if(board[i][j] == 'Q')
                     {
                            return false;
                     }
              }
              
              //diagonal left
              for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--)
              {
                     if(board[i][j] == 'Q')
                     {
                            return false;
                     }
              }
              return true;
       }
              
       public static void nQueens(char board[][], int row)
       {
              if(row == board.length)
              {
                     System.out.println("------chess board-------");
                     printBoard(board);
                     return;
              }

              for(int j = 0; j < board.length; j++)
              {
                     if(isSafe(board,row,j))
                     {
                            board[row][j] = 'Q';
                            nQueens(board,row+1);
                            board[row][j] = '.';
                     }
              }
       }

       public static void printBoard(char board[][])
       {
              for (int i = 0; i < board.length; i++) {
                     for (int j = 0; j < board.length; j++) {
                            System.out.print(board[i][j]+" ");
                     }
                     System.out.println();
              }
       }

       public static void main(String args[])
       {
              int n = 4;
              char board[][] = new char[n][n];
              for(int i = 0; i < board.length; i++)
              {
                     for(int j = 0; j < board.length; j++)
                     {
                            board[i][j] = '.';
                     }
              }
              nQueens(board,0);
       }
}

*/

/*  
Backtracking|Recursion|N-Queens(Count Solutions)
TC:O(n!×n)
SC:O(n)

public class Backtracking {
       public static boolean isSafe(char board[][], int row, int col) {
              // up
              for (int i = row - 1; i >= 0; i--) {
                     if (board[i][col] == 'Q') {
                            return false;
                     }
              }

              // diagonal right
              for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                     if (board[i][j] == 'Q') {
                            return false;
                     }
              }

              // diagonal left
              for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                     if (board[i][j] == 'Q') {
                            return false;
                     }
              }
              return true;
       }

       public static void nQueens(char board[][], int row) {
              if (row == board.length) {
                     count++;
                     return;
              }

              for (int j = 0; j < board.length; j++) {
                     if (isSafe(board, row, j)) {
                            board[row][j] = 'Q';
                            nQueens(board, row + 1);
                            board[row][j] = '.';
                     }
              }
       }


       static int count = 0;

       public static void main(String args[]) {
              int n = 4;
              char board[][] = new char[n][n];
              for (int i = 0; i < board.length; i++) {
                     for (int j = 0; j < board.length; j++) {
                            board[i][j] = '.';
                     }
              }
              nQueens(board, 0);
              System.out.println("Total number of ways to solve n queesn is: "+count);
              
       }
}

*/

/* 
Backtracking|Recursion|N-Queens(One Solution)
TC:O(n!×n)SC:O(n)

public class Backtracking {
       public static boolean isSafe(char board[][], int row, int col) {
              // up
              for (int i = row - 1; i >= 0; i--) {
                     if (board[i][col] == 'Q') {
                            return false;
                     }
              }

              // diagonal right
              for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                     if (board[i][j] == 'Q') {
                            return false;
                     }
              }

              // diagonal left
              for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                     if (board[i][j] == 'Q') {
                            return false;
                     }
              }
              return true;
       }

       public static boolean nQueens(char board[][], int row) {
              if (row == board.length) {
                     printBoard(board);
                     return true;
              }

              for (int j = 0; j < board.length; j++) {
                     if (isSafe(board, row, j)) {
                            board[row][j] = 'Q';
                            if(nQueens(board, row + 1))
                            {
                                   return true;
                            }
                            board[row][j] = '.';
                     }
              }
              return false;
       }

       public static void printBoard(char board[][]) {
              for (int i = 0; i < board.length; i++) {
                     for (int j = 0; j < board.length; j++) {
                            System.out.print(board[i][j] + " ");
                     }
                     System.out.println();
              }
       }

       public static void main(String args[]) {
              int n = 4;
              char board[][] = new char[n][n];
              for (int i = 0; i < board.length; i++) {
                     for (int j = 0; j < board.length; j++) {
                            board[i][j] = '.';
                     }
              }
              nQueens(board, 0);
       }
}


*/


/*

Backtracking | Combinatorics | Grid Paths
TC: O(min(n,m))
SC: O(1)

public class Backtracking
{
       public static int gridWays(int n, int m)
       {
              int N = (n-1) + (m-1);
              int r = Math.min(n-1,m-1);

              int res = 1;

              for(int i = 1; i <= r; i++)
              {
                     res = res * (N - r + i) / i;
              }

              return res;
       }

       public static void main(String args[])
       {
              int n = 3;
              int m = 3;

              System.out.println(gridWays(n,m));
       }
}


Exact LeetCode Question: 62. Unique Paths
Similarity: 100%



class Backtracking
{
       public int gridWays(int n, int m)
       {
              int N = (n-1) + (m-1);
              int r = Math.min(n-1, m-1);

              long res = 1;

              for(int i=1; i<=r; i++)
              {
                     res = res * (N - r + i) / i;
              }

              return (int)res;
       }

       public int uniquePaths(int m, int n)
       {
              return gridWays(n,m);
       }
}

*/



/*

Backtracking|Recursion|Sudoku Solver
TC: O(9^(n*n))
SC: O(n*n)

public class Backtracking
{
       public static boolean isSafe(int sudoku[][], int row, int col, int digit)
       {
              //column
              for(int i = 0; i <= 8; i++)
              {
                     if(sudoku[i][col] == digit)
                     {
                            return false;
                     }
              }

              //row
              for(int j = 0; j<=8; j++)
              {
                     if(sudoku[row][j] == digit)
                     {
                            return false;
                     }
              }

              //grid check
              int sr = (row/3)*3;
              int sc = (col/3)*3;

              for(int i=sr; i<sr+3; i++)
              {
                     for(int j=sc; j<sc+3; j++)
                     {
                            if(sudoku[i][j] == digit)
                            {
                                   return false;
                            }
                     }
              }

              return true;

       }

       public static boolean sudokuSolver(int sudoku[][], int row, int col)
       {
              if(row == 9)
              {
                     return true;
              }

              int nextRow = row;
              int nextCol = col+1;

              if(col + 1 == 9)
              {
                     nextRow = row+1;
                     nextCol = 0;
              }

              if(sudoku[row][col] != 0)
              {
                     return sudokuSolver(sudoku, nextRow, nextCol);
              }

              for(int digit = 1; digit <= 9; digit++)
              {
                     if(isSafe(sudoku, row, col, digit))
                     {
                            sudoku[row][col] = digit;

                            if(sudokuSolver(sudoku, nextRow, nextCol))
                            {
                                   return true;
                            }

                            sudoku [row][col] = 0;
                     }
              }
              return false;
       }

       public static void printSudoku(int sudoku[][])
       {
              for(int i = 0; i < 9; i++)
              {
                     for(int j = 0; j < 9; j++)
                     {
                            System.out.print(sudoku[i][j]+" ");
                     }
                     System.out.println();
              }
       }

       public static void main(String args[])
       {
              int sudoku[][] =
              {
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

              if(sudokuSolver(sudoku,0,0))
              {
                     System.out.println("Soluion exists");
                     printSudoku(sudoku);
              }
              else
              {
                     System.out.println("Solution does not exists");
              }
       }
}


Exact LeetCode Question: 37. Sudoku Solver
Similarity: 98%

              class Solution {

              public boolean isSafe(char[][] sudoku, int row, int col, char digit)
              {
                     for(int i = 0; i <= 8; i++)
                     {
                     if(sudoku[i][col] == digit)
                     {
                            return false;
                     }
                     }

                     for(int j = 0; j<=8; j++)
                     {
                     if(sudoku[row][j] == digit)
                     {
                            return false;
                     }
                     }

                     int sr = (row/3)*3;
                     int sc = (col/3)*3;

                     for(int i=sr; i<sr+3; i++)
                     {
                     for(int j=sc; j<sc+3; j++)
                     {
                            if(sudoku[i][j] == digit)
                            {
                            return false;
                            }
                     }
                     }

                     return true;
              }

              public boolean sudokuSolver(char[][] sudoku, int row, int col)
              {
                     if(row == 9)
                     {
                     return true;
                     }

                     int nextRow = row;
                     int nextCol = col+1;

                     if(col + 1 == 9)
                     {
                     nextRow = row+1;
                     nextCol = 0;
                     }

                     if(sudoku[row][col] != '.')
                     {
                     return sudokuSolver(sudoku, nextRow, nextCol);
                     }

                     for(char digit = '1'; digit <= '9'; digit++)
                     {
                     if(isSafe(sudoku, row, col, digit))
                     {
                            sudoku[row][col] = digit;

                            if(sudokuSolver(sudoku, nextRow, nextCol))
                            {
                            return true;
                            }

                            sudoku[row][col] = '.';
                     }
                     }
                     return false;
              }

              public void solveSudoku(char[][] board) {
                     sudokuSolver(board,0,0);
              }
              }


*/