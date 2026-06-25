/* 


## Functions & Methods - Index

| Sr. No. | Program                             | Time Complexity | Space Complexity |
| :-----: | ----------------------------------- | :-------------: | :--------------: |
|    1    | Print "Hello" using a Function      |     **O(1)**    |     **O(1)**     |
|    2    | Sum of Two Numbers using Function   |     **O(1)**    |     **O(1)**     |
|    3    | Swap Two Numbers (Call by Value)    |     **O(1)**    |     **O(1)**     |
|    4    | Swap using Function (Demonstration) |     **O(1)**    |     **O(1)**     |
|    5    | Call by Value Example               |     **O(1)**    |     **O(1)**     |
|    6    | Multiply Two Numbers                |     **O(1)**    |     **O(1)**     |
|    7    | Factorial using Function            |     **O(N)**    |     **O(1)**     |
|    8    | Binomial Coefficient                |     **O(N)**    |     **O(1)**     |
|    9    | Function Overloading                |     **O(1)**    |     **O(1)**     |
|    10   | Check Whether a Number is Prime     |    **O(√N)**    |     **O(1)**     |
|    11   | Print Prime Numbers in a Range      |    **O(N√N)**   |     **O(1)**     |
|    12   | Binary to Decimal Conversion        |     **O(D)**    |     **O(1)**     |
|    13   | Decimal to Binary Conversion        |   **O(log N)**  |     **O(1)**     |
|    14   | Average of Three Numbers            |     **O(1)**    |     **O(1)**     |
|    15   | Check Even Number                   |     **O(1)**    |     **O(1)**     |
|    16   | Check Palindrome Number             |     **O(D)**    |     **O(1)**     |
|    17   | Sum of Digits of an Integer         |     **O(D)**    |     **O(1)**     |

---

### Complexity Summary

| Complexity   | Programs                                                                                                                                                                                 |
| ------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**     | Print "Hello", Sum of Two Numbers, Swap Two Numbers, Swap using Function, Call by Value Example, Multiply Two Numbers, Function Overloading, Average of Three Numbers, Check Even Number |
| **O(N)**     | Factorial, Binomial Coefficient                                                                                                                                                          |
| **O(√N)**    | Check Whether a Number is Prime                                                                                                                                                          |
| **O(N√N)**   | Print Prime Numbers in a Range                                                                                                                                                           |
| **O(D)**     | Binary to Decimal Conversion, Check Palindrome Number, Sum of Digits                                                                                                                     |
| **O(log N)** | Decimal to Binary Conversion                                                                                                                                                             |

This serves as a clean **index page** for your **Functions & Methods** notes, making it easy to find each program and quickly recall its time and space complexity.


*/





// ------------------------------------------------------------
// Print "Hello" using a Function
//
// TC: O(1)
// Reason: Prints a fixed number of statements.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class functions {

       public static void hello() {

              System.out.println("Hello");
              System.out.println("Hello");
              System.out.println("Hello");

              return;
       }

       public static int sum(int a, int b) {

              int sum = a + b;
              return sum;
       }

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int a = sc.nextInt();
              int b = sc.nextInt();

              hello();

              int sumAB = sum(a, b);

              System.out.println("Sum = " + sumAB);

              sc.close();
       }
}

// ------------------------------------------------------------
// Swap Two Numbers (Call by Value)
//
// TC: O(1)
// Reason: Performs a fixed number of assignments.
//
// SC: O(1)
// Reason: Uses only one temporary variable.
// ------------------------------------------------------------

import java.util.Scanner;

public class functions {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int a = sc.nextInt();
              int b = sc.nextInt();

              int temp = a;
              a = b;
              b = temp;

              System.out.println(a);
              System.out.println(b);

              sc.close();
       }
}

// ------------------------------------------------------------
// Demonstration: Swap using Function (Not Possible)
//
// TC: O(1)
// Reason: Performs a constant number of operations.
//
// SC: O(1)
// Reason: Uses only one temporary variable.
// ------------------------------------------------------------

public class functions {

       public static int swap(int a, int b) {

              int temp = a;
              a = b;
              b = temp;

              // Java does not allow returning two values.
              return a;
       }

       public static void main(String args[]) {

              int result = swap(5, 10);

              System.out.println(result);
       }
}

// ------------------------------------------------------------
// Call by Value Example
//
// TC: O(1)
// Reason: Performs a constant number of operations.
//
// SC: O(1)
// Reason: Uses only one variable.
// ------------------------------------------------------------

public class functions {

       public static void change(int x) {

              x = 20;
              System.out.println(x);
       }

       public static void main(String args[]) {

              int a = 10;

              change(a);

              System.out.println(a);
       }
}

// ------------------------------------------------------------
// Multiply Two Numbers using Function
//
// TC: O(1)
// Reason: Performs only one multiplication.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

public class functions {

       public static int multiply(int x, int y) {

              return x * y;
       }

       public static void main(String args[]) {

              int result = multiply(10, 6);

              System.out.println(result);
       }
}

// ------------------------------------------------------------
// Find Factorial using Function
//
// TC: O(N)
// Reason: Loop runs N times.
//
// SC: O(1)
// Reason: Uses only one extra variable.
// ------------------------------------------------------------

public class functions {

       public static int factorial(int n) {

              int fact = 1;

              for (int i = 1; i <= n; i++) {
                     fact *= i;
              }

              return fact;
       }

       public static void main(String args[]) {

              int result = factorial(6);

              System.out.println(result);
       }
}

// ------------------------------------------------------------
// Binomial Coefficient
//
// TC: O(N)
// Reason: Calls factorial function a constant number of times.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

public class functions {

       public static int factorial(int n) {

              int fact = 1;

              for (int i = 1; i <= n; i++) {
                     fact *= i;
              }

              return fact;
       }

       public static int binomialCoeff(int n, int r) {

              int a = factorial(n);
              int b = factorial(r);
              int c = factorial(n - r);

              return a / (b * c);
       }

       public static void main(String args[]) {

              int result = binomialCoeff(5, 2);

              System.out.println(result);
       }
}

// ------------------------------------------------------------
// Function Overloading
//
// TC: O(1)
// Reason: Performs only one arithmetic operation.
//
// SC: O(1)
// Reason: Uses only method parameters.
// ------------------------------------------------------------

public class functions {

       public static int sum(int a, int b) {
              return a + b;
       }

       public static float sum(float a, float b) {
              return a + b;
       }

       public static void main(String args[]) {

              System.out.println(sum(10, 20));
              System.out.println(sum(10.5f, 20.8f));
       }
}



// ------------------------------------------------------------
// Check Whether a Number is Prime
//
// TC: O(√N)
// Reason: Checks divisibility only up to √N.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

public class functions {

       public static boolean isPrime(int n) {

              if (n < 2) {
                     return false;
              }

              for (int i = 2; i * i <= n; i++) {

                     if (n % i == 0) {
                            return false;
                     }
              }

              return true;
       }

       public static void main(String args[]) {

              int n = 7;

              boolean result = isPrime(n);

              System.out.println(result);
       }
}

// ------------------------------------------------------------
// Print Prime Numbers in a Given Range
//
// TC: O(N√N)
// Reason: Checks every number from 2 to N for primality.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

public class functions {

       public static boolean isPrime(int n) {

              if (n < 2) {
                     return false;
              }

              for (int i = 2; i * i <= n; i++) {

                     if (n % i == 0) {
                            return false;
                     }
              }

              return true;
       }

       public static void printPrime(int n) {

              for (int i = 2; i <= n; i++) {

                     if (isPrime(i)) {
                            System.out.print(i + " ");
                     }
              }
       }

       public static void main(String args[]) {

              printPrime(20);
       }
}

// ------------------------------------------------------------
// Binary to Decimal Conversion
//
// TC: O(D)
// Reason: Processes each binary digit once.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class functions {

       public static int binaryToDecimal(int bin) {

              int pow = 0;
              int dec = 0;

              while(bin != 0) {

                     int lastDigit = bin % 10;

                     dec = dec + (lastDigit * (int)Math.pow(2, pow));

                     pow++;
                     bin /= 10;
              }

              return dec;
       }

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter Binary Number: ");
              int bin = sc.nextInt();

              System.out.println(binaryToDecimal(bin));

              sc.close();
       }
}

// ------------------------------------------------------------
// Decimal to Binary Conversion
//
// TC: O(log N)
// Reason: Number is repeatedly divided by 2.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

public class functions {

       public static void decimalToBinary(int n) {

              int pow = 0;
              int bin = 0;
              int original = n;

              while (n > 0) {

                     int rem = n % 2;

                     bin = bin + (rem * (int) Math.pow(10, pow));

                     pow++;
                     n /= 2;
              }

              System.out.println("Binary form of " + original + " = " + bin);
       }

       public static void main(String args[]) {

              decimalToBinary(7);
              decimalToBinary(12);
              decimalToBinary(15);
       }
}

// ------------------------------------------------------------
// Average of Three Numbers
//
// TC: O(1)
// Reason: Performs a fixed number of arithmetic operations.
//
// SC: O(1)
// Reason: Uses only method parameters.
// ------------------------------------------------------------

public class functions {

       public static double average(int a, int b, int c) {

              return (a + b + c) / 3.0;
       }

       public static void main(String args[]) {

              System.out.println(average(10, 20, 32));
       }
}

// ------------------------------------------------------------
// Check Even Number
//
// TC: O(1)
// Reason: Performs one modulus operation.
//
// SC: O(1)
// Reason: Uses only method parameters.
// ------------------------------------------------------------

public class functions {

       public static boolean isEven(int n) {

              return n % 2 == 0;
       }

       public static void main(String args[]) {

              System.out.println(isEven(10));
              System.out.println(isEven(7));
       }
}

// ------------------------------------------------------------
// Check Palindrome Number
//
// TC: O(D)
// Reason: Processes each digit once.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class functions {

       public static boolean isPalindrome(int num) {

              int original = num;
              int rev = 0;

              while(num != 0) {

                     int lastDigit = num % 10;

                     rev = rev * 10 + lastDigit;

                     num /= 10;
              }

              return original == rev;
       }

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int num = sc.nextInt();

              System.out.println(isPalindrome(num));

              sc.close();
       }
}

// ------------------------------------------------------------
// Sum of Digits of an Integer
//
// TC: O(D)
// Reason: Processes each digit exactly once.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class functions {

       public static int sumDigit(int num) {

              int sum = 0;

              while (num > 0) {

                     int lastDigit = num % 10;

                     sum += lastDigit;

                     num /= 10;
              }

              return sum;
       }

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int num = sc.nextInt();

              System.out.println(sumDigit(num));

              sc.close();
       }
}


