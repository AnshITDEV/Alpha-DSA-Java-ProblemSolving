/* Print numbers in decreasing order from n to 1 using recursion. 
TC: O(n)
SC: O(n)

public class Recursion
{
       public static void printDec(int n)
       {
              if(n == 1)
              {
                     System.out.println(1);
                     return;
              }
              
              System.out.print(n+" ");

              printDec(n-1);
       }
       public static void main(String args[])
       {
              int n = 10;
              printDec(n);
       }
}

*/





/* Print numbers from 1 to n in increasing order using recursion 
TC: O(n)
SC: O(n)


public class Recursion
{
       public static void printInc(int n)
       {
              if (n == 1)
              {
                     System.out.print(n + " ");
                     return;
              }
              
              printInc(n - 1);
              System.out.print(n + " ");
       }

       public static void main(String args[])
       {
              int n = 10;
              printInc(n);
       }
}
*/




/* Recursion | Divide Problem | Use Call Stack
TC: O(n)
SC: O(n)



public class Recursion
{

       public static int fact(int n)
       {
              //base
              if(n == 0)
              {
                     return 1;
              }

              //kaam
              
              int ft = n * fact(n-1);

              return ft;
       }


       public static void main(String args[])
       {
              int n = 5;
              System.out.println(fact(n));
       }

}

*/




/* Print sum of first n natural numbers
TC: O(n)
SC: O(n)

public class Recursion
{
       public static int calcSum(int n)
       {
              //base
              if(n == 0)
              {
                     return 0;
              }

              //kaam
              int Nsum = n + calcSum(n-1);
              return Nsum;
       }

       public static void main(String args[])
       {
              int n = 5;
              System.out.println(calcSum(n));
       }

}

*/


/* Problem 5: Print Nth Fibonacci Number
TC: O(2^n)
SC: O(n)

public class Recursion
{

       public static int nthFib(int n)
       {
              //base
              if(n == 0 || n == 1)
              {
                     return n;
              }

              //kaam
              int fn = nthFib(n-1) + nthFib(n-2);

              return fn;
       }

       public static void main(String args[])
       {
              int n = 4;
              System.out.println(nthFib(n));
       }
}

*/



/* Problem 6: Check if a given array is sorted or not (Using Recursion)
TC: O(n)
SC: O(n)


public class Recursion
{
       public static boolean isSorted(int arr[], int i)
       {

              //base
              if(i == arr.length-1)
              {
                     return true;
              }

              if(arr[i] > arr[i+1])
              {
                     return false;
              }

              //recursion
              return isSorted(arr, i+1);
       }

       public static void main(String args[])
       {
              int arr[] = { 1,2,3,4};
              System.out.println(isSorted(arr,0));
       }
}

*/


/* Problem 7:Find the First Occurrence of an Element in an Array (Using Recursion) 
TC: O(n)
SC: O(n)

public class Recursion
{

       public static int firstOccurrence(int arr[], int key, int i)
       {
              if(i == arr.length)
              {
                     return -1;
              }
              if(arr[i] == key)
              {
                     return i;
              }
              return firstOccurrence(arr,key,i+1);
              
       }

       public static void main(String args[])
       {
              int arr[] = {3,7,4,8,1,2,8};
              System.out.println(firstOccurrence(arr,8,0));
       }
}

*/


/* Find the last occurrence of a given element in an array using recursion.
TC: O(n)
SC: O(n)

public class Recursion
{
       public static int lastOccurence(int arr[], int i, int key)
       {
              if(i == arr.length)
              {
                     return -1;
              }

              int isFound = lastOccurence(arr, i + 1, key);
              
              if(isFound == -1 && arr[i] == key)
              {
                     return i;
              }

              return isFound;
       }

       public static void main(String args[])
       {
              int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
              System.out.println(lastOccurence(arr,0,5));
       }
}

*/



/* 
Problem 9: Print xⁿ using Recursion
Recursion | Power Calculation | Linear Recursion
TC: O(n)
SC: O(n)


public class Recursion
{
       public static int power(int x, int n)
       {
              //base 
              if(n == 0)
              {
                     return 1;
              }

              int p = x * power(x,n-1);

              return p;

       }

       public static void main(String args[])
       {
              int x = 4;
              int n = 3;
              System.out.println(power(x,n));
       }
}

 */


/*
Recursion | Divide and Conquer | Fast Exponentiation (Binary Exponentiation)
Problem 10: Print xⁿ in O(log n) using Recursion (Optimized Power)
TC: O(log n)
SC: O(log n)



public class Recursion
{
       public static int optimizedPower(int x, int n)
       {
              if(n == 0)
              {
                     return 1;
              }
              
              int halfPower = optimizedPower(x,n/2);

              int halfPowerSq = halfPower * halfPower;

              if(n % 2 != 0)
              {
                     halfPowerSq = halfPowerSq * x;
              }
       
              return halfPowerSq;

       }

       public static void main(String args[])
       {
              int x = 2;
              int n = 5;
              System.out.println( optimizedPower(x,n) );
       }
}

*/


/* 
Recursion | Fibonacci Pattern | Tiling Problem (2 × n board)
Given a 2 × n board and tiles of size 2 × 1, count the number of ways to tile the board completely.
Tiles can be placed either vertically or horizontally.
TC: O(2^n)
SC: O(n)


public class Recursion
{
       public static int tiling(int n)
       {
              if(n == 0 || n == 1)
              {
                     return 1;
              }

              int verticalWays = tiling(n-1);
              int horiWays = tiling(n-2);


              return verticalWays+horiWays;
       }

       public static void main(String args[])
       {
              System.out.println(tiling(3));
       }
}

*/






/*
Recursion | String Processing | Remove Duplicates using Boolean Map

Given a string, remove all duplicate characters using recursion while
maintaining the order of first occurrence.

TC: O(n)
SC: O(n)


public class Recursion
{
       public static void removeDuplicates(String str, int i, StringBuilder newStr, boolean map[])
       {
              if(i == str.length())
              {
                     System.out.println(newStr);
                     return;
              }

              char currChar = str.charAt(i);

              if(map[currChar - 'a'] == true)
              {
                     removeDuplicates(str, i+1, newStr, map);
              }
              else
              {
                     map[currChar - 'a'] = true;
                     newStr.append(currChar);

                     removeDuplicates(str, i+1, newStr, map);
              }

       }

       public static void main(String args[])
       {
              String str = "appnacollege";
              removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
       }
}

*/


/* Recursion | Combinatorics | Friends Pairing Problem | Fibonacci-type Recurrence 
TC: O(n)
SC: O(n)


public class Recursion
{

       public static int friendsPairing(int n)
       {
              if (n == 1 || n == 2)
              {
                     return n;
              }

              int single = friendsPairing(n-1);
              int pair = (n-1) * friendsPairing(n-2);

              return single+pair;
       }

       public static void main(String args[])
       {
              System.out.println(friendsPairing(3));
       }
}


*/


/* 
Recursion + Backtracking — Generate Binary Strings Without Consecutive 1s

Print all binary strings of size N such that no two consecutive 1s appear.

TC: O(2^n)
SC: O(n)


public class Recursion
{
       public static void printBinStrings(int n, int lastPlace, String str)
       {
              if(n == 0)
              {
                     System.out.println(str);
                     return;
              }
                     
              printBinStrings(n-1,0, str+"0");

              if(lastPlace == 0)
              {
                     printBinStrings(n-1,1,str+"1");
              }
       }

       public static void main(String args[])
       {
              int n = 3;
              printBinStrings(n,0,"");
       }
}

*/