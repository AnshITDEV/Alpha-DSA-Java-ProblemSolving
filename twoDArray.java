// Search a key by scanning every element in a sorted 2D matrix (BRUTE FORCE)
// TC: O(n × m)
// SC: O(1)

// public class twoDArray
// {
//        public static boolean brute(int matrix[][],int key)
//        {
//               for(int i=0; i<matrix.length; i++)
//               {
//                      for(int j=0; j<matrix[0].length; j++)
//                      {
//                             if(matrix[i][j] == key)
//                             {
//                                    System.out.println("Key found at:"+"("+i+","+j+")");
//                                    return true;
//                             }
//                      }
//               }
//               return false;
//        }

//        public static void main(String[] args)
//        {
//               int matrix[][] =
//               {
//                      {10,20,30,40},
//                      {15,25,35,45},
//                      {16,26,36,46},
//                      {17,27,37,47}
//               };

//               int key = 27;
//               System.out.println(brute(matrix,key));
//        }
// }








// 2D Arrays | Staircase Search | Search in Sorted Matrix (OPTIMIZED)
// TC: O(n + m) 
// SC: O(1)


// public class twoDArray 
// {
//        public static boolean staircaseSearch(int matrix[][], int key)
//        {
//               int r = 0;
//               int c = matrix[0].length - 1;

//               while(r < matrix.length && c >= 0)
//               {
//                      if(matrix[r][c] == key)
//                      {
//                             System.out.println("("+r+","+c+")");
//                             return true;
//                      }else 
//                      if(key < matrix[r][c])
//                      {
//                             c--;
//                      }
//                      else
//                      {
//                             r++;
//                      }
//               }
//               System.out.println("key not found");
//               return false;
//        }

//        public static void main(String[] args)
//        {
//               int matrix[][] =
//               {
//                      {10, 20, 30, 40},
//                      {15, 25, 35, 45},
//                      {27, 29, 37, 48},
//                      {32, 33, 39, 50}
//               };

//               int key = 33;
//               staircaseSearch(matrix,key);
//        }
// }



// 2D Arrays | Matrix Input & Output | Basic Traversal
//  O(n × m)

// import java.util.Scanner;

// public class twoDArray
// {

//        public static void main(String args[])
//        {
              
//               int matrix[][] = new int[3][3];

//               Scanner sc = new Scanner(System.in);

//               int r = matrix.length;
//               int c = matrix[0].length;


//               for(int i = 0; i < r; i++)
//               {
//                      for(int j = 0; j < c; j++)
//                      {
//                             matrix[i][j] = sc.nextInt();

//                      }
//               }
              
//               for(int i = 0; i < r; i++)
//               {
//                      for(int j = 0; j < c; j++)
//                      {
//                             System.out.print(matrix[i][j]+" ");
//                      }
//                      System.out.println();
//               }
//               sc.close();
//        }
// }






// 2D Arrays | Spiral Matrix Traversal | Boundary Method
// Time Complexity: O(rows × cols)
// Space Complexity: O(1) (no extra array)

// public class twoDArray
// {
//        public static void printSpiral(int matrix[][])
//        {
//               int startrow = 0;
//               int startcol = 0;
//               int endrow = matrix.length-1;
//               int endcol = matrix[0].length-1;

//               while(startrow <= endrow && startcol <= endcol)
//               {
//                      for(int j = startcol; j <= endcol; j++)
//                      {
//                             System.out.print(matrix[startrow][j]+" ");
//                      }

//                      for(int i = startrow+1; i <= endrow; i++)
//                      {
//                             System.out.print(matrix[i][endcol]+" ");
//                      }

//                      if(startrow < endrow)
//                      {
//                             for(int j = endcol-1; j >= startcol; j--)
//                             {
//                             System.out.print(matrix[endrow][j]+" ");
//                             }
//                      }

//                      if(startcol < endcol)
//                      {
//                             for(int i = endrow-1; i >= startrow+1; i--)
//                             {
//                             System.out.print(matrix[i][startcol]+" ");
//                             }
//                      }

//                      startrow++;
//                      startcol++;
//                      endrow--;
//                      endcol--;
//               }
//        }




//        public static void main(String[] args)
//        {
//               int matrix[][] =
//               {
//               {1,  2,  3,  4},
//               {5,  6,  7,  8},
//               {9, 10, 11, 12},
//               {13,14, 15,16}
//               };

//               printSpiral(matrix);
//        }
// }



// 2D Arrays | Diagonal Traversal | Diagonal Sum (Optimized)
// ⏱️ Time Complexity O(n) 
// 📦 Space Complexity O(1) 

// public class twoDArray
// {

//        public static int diagonalSum(int matrix[][])
//        {
//               int sum = 0;
//               int n = matrix.length;

//               for(int i = 0; i < n; i++)
//               {
//                      sum = sum + matrix[i][i];


//                      if(i != n-1-i)
//                      {
//                      sum = sum + matrix[i][n-1-i];
//                      }
//               }
//               return sum;
              
//        }

//        public static void main(String[] args) {
//               int matrix[][] = {
//                             { 1, 2, 3, 4 },
//                             { 5, 6, 7, 8 },
//                             { 9, 10, 11, 12 },
//                             { 13, 14, 15, 16 }
//               };

//               System.out.println(diagonalSum(matrix));
//        }
// }
















