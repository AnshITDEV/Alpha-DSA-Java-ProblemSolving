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





