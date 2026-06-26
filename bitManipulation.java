/*

## Bit Manipulation - Index

| Sr. No. | Program                                      |      Time Complexity      | Space Complexity |
| :-----: | -------------------------------------------- | :-----------------------: | :--------------: |
|    1    | Odd or Even                                  |          **O(1)**         |     **O(1)**     |
|    2    | Get i-th Bit                                 |          **O(1)**         |     **O(1)**     |
|    3    | Set i-th Bit                                 |          **O(1)**         |     **O(1)**     |
|    4    | Clear i-th Bit                               |          **O(1)**         |     **O(1)**     |
|    5    | Update i-th Bit                              |          **O(1)**         |     **O(1)**     |
|    6    | Clear Last i Bits                            |          **O(1)**         |     **O(1)**     |
|    7    | Clear Range of Bits                          |          **O(1)**         |     **O(1)**     |
|    8    | Check Power of 2                             |          **O(1)**         |     **O(1)**     |
|    9    | Count Set Bits (Brian Kernighan's Algorithm) | **O(Number of Set Bits)** |     **O(1)**     |
|    10   | Fast Exponentiation (Binary Exponentiation)  |        **O(log N)**       |     **O(1)**     |

---

## Complexity Summary

| Complexity                | Programs                                                                                                                           |
| ------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**                  | Odd or Even, Get i-th Bit, Set i-th Bit, Clear i-th Bit, Update i-th Bit, Clear Last i Bits, Clear Range of Bits, Check Power of 2 |
| **O(Number of Set Bits)** | Count Set Bits (Brian Kernighan's Algorithm)                                                                                       |
| **O(log N)**              | Fast Exponentiation (Binary Exponentiation)                                                                                        |
| **O(1) Space**            | All Programs                                                                                                                       |


// ------------------------------------------------------------
// Bit Manipulation | Odd or Even | Least Significant Bit
//
// TC: O(1)
// Reason: Performs only one bitwise AND operation.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

public class bitManipulation {

       public static void oddOrEven(int n) {

              int bitMask = 1;

              if((n & bitMask) == 0) {
                     System.out.println("Even Number");
              }
              else {
                     System.out.println("Odd Number");
              }
       }

       public static void main(String args[]) {

              oddOrEven(10);
              oddOrEven(7);
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Get i-th Bit
//
// TC: O(1)
// Reason: Uses one left shift and one bitwise AND operation.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

public class bitManipulation {

       public static void getIthBit(int n, int i) {

              int bitMask = 1 << i;

              if((n & bitMask) == 0) {
                     System.out.println("The " + i + "th bit is 0");
              }
              else {
                     System.out.println("The " + i + "th bit is 1");
              }
       }

       public static void main(String args[]) {

              int n = 10;
              int i = 1;

              getIthBit(n, i);
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Set i-th Bit
//
// TC: O(1)
// Reason: Uses one left shift and one bitwise OR operation.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

public class bitManipulation {

       public static int setIthBit(int n, int i) {

              int bitMask = 1 << i;

              return n | bitMask;
       }

       public static void main(String args[]) {

              int n = 10;
              int i = 2;

              System.out.println(setIthBit(n, i));
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Clear i-th Bit
//
// TC: O(1)
// Reason: Uses NOT, left shift and bitwise AND operations.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

public class bitManipulation {

       public static int clearIthBit(int n, int i) {

              int bitMask = ~(1 << i);

              return n & bitMask;
       }

       public static void main(String args[]) {

              int n = 10;
              int i = 1;

              System.out.println(clearIthBit(n, i));
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Update i-th Bit
//
// TC: O(1)
// Reason: Clears and sets the required bit using bitwise operations.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

public class bitManipulation {

       public static int updateIthBit(int n, int i, int newBit) {

              n = n & (~(1 << i));

              int bitMask = newBit << i;

              return n | bitMask;
       }

       public static void main(String args[]) {

              int n = 10;
              int i = 2;
              int newBit = 1;

              System.out.println(updateIthBit(n, i, newBit));
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Clear Last i Bits
//
// TC: O(1)
// Reason: Uses one left shift and one bitwise AND operation.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

public class bitManipulation {

       public static int clearLastIBits(int n, int i) {

              int bitMask = (~0) << i;

              return n & bitMask;
       }

       public static void main(String args[]) {

              int n = 15;
              int i = 2;

              System.out.println(clearLastIBits(n, i));
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Clear Range of Bits
//
// TC: O(1)
// Reason: Creates masks and performs constant-time bitwise operations.
//
// SC: O(1)
// Reason: Uses only a few extra variables.
// ------------------------------------------------------------

public class bitManipulation {

       public static int clearRangeOfBits(int n, int i, int j) {

              int bitMask1 = (~0) << (j + 1);
              int bitMask2 = (1 << i) - 1;

              int mask = bitMask1 | bitMask2;

              return n & mask;
       }

       public static void main(String args[]) {

              int n = 31;
              int i = 1;
              int j = 3;

              System.out.println(clearRangeOfBits(n, i, j));
       }
}


// ------------------------------------------------------------
// Bit Manipulation | Check Power of 2
//
// TC: O(1)
// Reason: Uses one bitwise AND operation.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class bitManipulation {

       public static boolean isPowerOfTwo(int n) {

              if(n <= 0) {
                     return false;
              }

              return (n & (n - 1)) == 0;
       }

       public static void main(String args[]) {

              System.out.println(isPowerOfTwo(8));   // true
              System.out.println(isPowerOfTwo(10));  // false
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Count Set Bits (Brian Kernighan's Algorithm)
//
// TC: O(Number of Set Bits)
// Reason: Each iteration removes one set bit.
//
// SC: O(1)
// Reason: Uses only one counter variable.
// ------------------------------------------------------------

public class bitManipulation {

       public static int countSetBits(int n) {

              int count = 0;

              while(n > 0) {

                     n = n & (n - 1);
                     count++;
              }

              return count;
       }

       public static void main(String args[]) {

              int n = 15;

              System.out.println(countSetBits(n));
       }
}

// ------------------------------------------------------------
// Bit Manipulation | Fast Exponentiation (Binary Exponentiation)
//
// TC: O(log N)
// Reason: The exponent is divided by 2 in every iteration.
//
// SC: O(1)
// Reason: Uses only constant extra variables.
// ------------------------------------------------------------

public class bitManipulation {

       public static int fastExponentiation(int a, int n) {

              int result = 1;

              while(n > 0) {

                     if((n & 1) != 0) {
                            result = result * a;
                     }

                     a = a * a;
                     n = n >> 1;
              }

              return result;
       }

       public static void main(String args[]) {

              System.out.println(fastExponentiation(2, 5)); // 32
              System.out.println(fastExponentiation(3, 4)); // 81
       }
}



 */





























