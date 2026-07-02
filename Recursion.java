/*


## Recursion - Index

| Sr. No. | Program                                 | Time Complexity | Space Complexity |
| :-----: | --------------------------------------- | :-------------: | :--------------: |
|    1    | Print Numbers in Decreasing Order       |     **O(N)**    |     **O(N)**     |
|    2    | Print Numbers in Increasing Order       |     **O(N)**    |     **O(N)**     |
|    3    | Factorial                               |     **O(N)**    |     **O(N)**     |
|    4    | Sum of First N Natural Numbers          |     **O(N)**    |     **O(N)**     |
|    5    | Nth Fibonacci Number                    |    **O(2ᴺ)**    |     **O(N)**     |
|    6    | Check if Array is Sorted                |     **O(N)**    |     **O(N)**     |
|    7    | First Occurrence in Array               |     **O(N)**    |     **O(N)**     |
|    8    | Last Occurrence in Array                |     **O(N)**    |     **O(N)**     |
|    9    | Power (Linear Recursion)                |     **O(N)**    |     **O(N)**     |
|    10   | Optimized Power (Binary Exponentiation) |   **O(log N)**  |   **O(log N)**   |
|    11   | Tiling Problem                          |    **O(2ᴺ)**    |     **O(N)**     |
|    12   | Remove Duplicates from String           |     **O(N)**    |     **O(N)**     |
|    13   | Friends Pairing Problem                 |    **O(2ᴺ)**    |     **O(N)**     |
|    14   | Binary Strings Without Consecutive 1s   |    **O(2ᴺ)**    |     **O(N)**     |

---

## Complexity Summary

| Complexity         | Programs                                                                                                                                                                                  |
| ------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(log N)**       | Optimized Power (Binary Exponentiation)                                                                                                                                                   |
| **O(N)**           | Print Decreasing Order, Print Increasing Order, Factorial, Sum of First N Natural Numbers, Check if Array is Sorted, First Occurrence, Last Occurrence, Power (Linear), Remove Duplicates |
| **O(2ᴺ)**          | Nth Fibonacci Number, Tiling Problem, Friends Pairing Problem, Binary Strings Without Consecutive 1s                                                                                      |
| **O(log N) Space** | Optimized Power (Binary Exponentiation)                                                                                                                                                   |
| **O(N) Space**     | All remaining recursion programs                                                                                                                                                          |



// ------------------------------------------------------------
// Recursion | Print Numbers in Decreasing Order
//
// TC: O(N)
// Reason: One recursive call is made for each number from N to 1.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static void printDec(int n) {

              if(n == 1) {
                     System.out.println(1);
                     return;
              }

              System.out.print(n + " ");

              printDec(n - 1);
       }

       public static void main(String args[]) {

              int n = 10;

              printDec(n);
       }
}


// ------------------------------------------------------------
// Recursion | Print Numbers in Increasing Order
//
// TC: O(N)
// Reason: One recursive call is made for each number from 1 to N.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static void printInc(int n) {

              if(n == 1) {
                     System.out.print(n + " ");
                     return;
              }

              printInc(n - 1);

              System.out.print(n + " ");
       }

       public static void main(String args[]) {

              int n = 10;

              printInc(n);
       }
}


// ------------------------------------------------------------
// Recursion | Factorial
//
// TC: O(N)
// Reason: One recursive call is made for every value from N to 1.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int fact(int n) {

              if(n == 0) {
                     return 1;
              }

              return n * fact(n - 1);
       }

       public static void main(String args[]) {

              int n = 5;

              System.out.println(fact(n));
       }
}


// ------------------------------------------------------------
// Recursion | Sum of First N Natural Numbers
//
// TC: O(N)
// Reason: One recursive call is made for every number from N to 1.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int calcSum(int n) {

              if(n == 0) {
                     return 0;
              }

              return n + calcSum(n - 1);
       }

       public static void main(String args[]) {

              int n = 5;

              System.out.println(calcSum(n));
       }
}




// ------------------------------------------------------------
// Recursion | Nth Fibonacci Number
//
// TC: O(2^N)
// Reason: Each function call recursively calls itself twice.
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int nthFib(int n) {

              if(n == 0 || n == 1) {
                     return n;
              }

              return nthFib(n - 1) + nthFib(n - 2);
       }

       public static void main(String args[]) {

              int n = 4;

              System.out.println(nthFib(n));
       }
}


// ------------------------------------------------------------
// Recursion | Check if Array is Sorted
//
// TC: O(N)
// Reason: Each element is checked exactly once.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static boolean isSorted(int arr[], int i) {

              if(i == arr.length - 1) {
                     return true;
              }

              if(arr[i] > arr[i + 1]) {
                     return false;
              }

              return isSorted(arr, i + 1);
       }

       public static void main(String args[]) {

              int arr[] = {1, 2, 3, 4};

              System.out.println(isSorted(arr, 0));
       }
}


// ------------------------------------------------------------
// Recursion | First Occurrence in Array
//
// TC: O(N)
// Reason: Each element is checked once until the key is found.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int firstOccurrence(int arr[], int key, int i) {

              if(i == arr.length) {
                     return -1;
              }

              if(arr[i] == key) {
                     return i;
              }

              return firstOccurrence(arr, key, i + 1);
       }

       public static void main(String args[]) {

              int arr[] = {3, 7, 4, 8, 1, 2, 8};

              System.out.println(firstOccurrence(arr, 8, 0));
       }
}


// ------------------------------------------------------------
// Recursion | Last Occurrence in Array
//
// TC: O(N)
// Reason: Every element is visited once using recursion.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int lastOccurrence(int arr[], int i, int key) {

              if(i == arr.length) {
                     return -1;
              }

              int isFound = lastOccurrence(arr, i + 1, key);

              if(isFound == -1 && arr[i] == key) {
                     return i;
              }

              return isFound;
       }

       public static void main(String args[]) {

              int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};

              System.out.println(lastOccurrence(arr, 0, 5));
       }
}




// ------------------------------------------------------------
// Recursion | Power (Linear Recursion)
//
// TC: O(N)
// Reason: One recursive call is made for each power from N to 0.
//
// SC: O(N)
// Reason: Recursion call stack stores N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int power(int x, int n) {

              if(n == 0) {
                     return 1;
              }

              return x * power(x, n - 1);
       }

       public static void main(String args[]) {

              int x = 4;
              int n = 3;

              System.out.println(power(x, n));
       }
}


// ------------------------------------------------------------
// Recursion | Optimized Power (Binary Exponentiation)
//
// TC: O(log N)
// Reason: Exponent is divided by 2 in every recursive call.
//
// SC: O(log N)
// Reason: Recursion call stack depth is logarithmic.
// ------------------------------------------------------------

public class Recursion {

       public static int optimizedPower(int x, int n) {

              if(n == 0) {
                     return 1;
              }

              int halfPower = optimizedPower(x, n / 2);

              int halfPowerSq = halfPower * halfPower;

              if(n % 2 != 0) {
                     halfPowerSq = halfPowerSq * x;
              }

              return halfPowerSq;
       }

       public static void main(String args[]) {

              int x = 2;
              int n = 5;

              System.out.println(optimizedPower(x, n));
       }
}


// ------------------------------------------------------------
// Recursion | Tiling Problem (2 × N Board)
//
// TC: O(2^N)
// Reason: Each recursive call branches into two more recursive calls.
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int tiling(int n) {

              if(n == 0 || n == 1) {
                     return 1;
              }

              int verticalWays = tiling(n - 1);
              int horizontalWays = tiling(n - 2);

              return verticalWays + horizontalWays;
       }

       public static void main(String args[]) {

              System.out.println(tiling(3));
       }
}


// ------------------------------------------------------------
// Recursion | Remove Duplicates from String
//
// TC: O(N)
// Reason: Every character is processed exactly once.
//
// SC: O(N)
// Reason: Recursion stack and StringBuilder together require linear space.
// ------------------------------------------------------------

public class Recursion {

       public static void removeDuplicates(String str, int i,
                                          StringBuilder newStr,
                                          boolean map[]) {

              if(i == str.length()) {
                     System.out.println(newStr);
                     return;
              }

              char currChar = str.charAt(i);

              if(map[currChar - 'a']) {

                     removeDuplicates(str, i + 1, newStr, map);

              } else {

                     map[currChar - 'a'] = true;

                     newStr.append(currChar);

                     removeDuplicates(str, i + 1, newStr, map);
              }
       }

       public static void main(String args[]) {

              String str = "appnacollege";

              removeDuplicates(str, 0,
              new StringBuilder(""),
              new boolean[26]);
       }
}









// ------------------------------------------------------------
// Recursion | Friends Pairing Problem
//
// TC: O(2^N)
// Reason: Each recursive call branches into two recursive calls.
//
// SC: O(N)
// Reason: Recursion call stack stores at most N function calls.
// ------------------------------------------------------------

public class Recursion {

       public static int friendsPairing(int n) {

              if(n == 1 || n == 2) {
                     return n;
              }

              int single = friendsPairing(n - 1);

              int pair = (n - 1) * friendsPairing(n - 2);

              return single + pair;
       }

       public static void main(String args[]) {

              System.out.println(friendsPairing(3));
       }
}


// ------------------------------------------------------------
// Recursion | Binary Strings Without Consecutive 1s
//
// TC: O(2^N)
// Reason: Recursively generates all valid binary strings.
//
// SC: O(N)
// Reason: Recursion call stack depth is at most N.
// ------------------------------------------------------------

public class Recursion {

       public static void printBinStrings(int n, int lastPlace, String str) {

              if(n == 0) {
                     System.out.println(str);
                     return;
              }

              // Place 0
              printBinStrings(n - 1, 0, str + "0");

              // Place 1 only if previous was 0
              if(lastPlace == 0) {
                     printBinStrings(n - 1, 1, str + "1");
              }
       }

       public static void main(String args[]) {

              int n = 3;

              printBinStrings(n, 0, "");
       }
}




 */