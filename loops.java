
/* 

Loops chapter from Apna College

The complete list is:

1. ✅ Print Numbers from 1 to 10 (While Loop)
2. ✅ Sum of First N Natural Numbers (While Loop)
3. ✅ Print "Hello World" 10 Times (For Loop)
4. ✅ Print 4×4 Star Pattern (For Loop)
5. ✅ Print 4×4 Star Pattern (While Loop)
6. ✅ Reverse Digits of a Number
7. ✅ Reverse a Number
8. ✅ Do-While Loop
9. ✅ Break and Continue
10. ✅ Prime Number Check
11. ✅ Sum of Even and Odd Numbers
12. ✅ Factorial of a Number
13. ✅ Multiplication Table
14. ✅ Variable Scope in For Loop




Print Numbers from 1 to 10 using While Loop

TC: O(N)
Reason: The while loop runs N times (here N = 10).

SC: O(1)
Reason: Uses only one loop variable.

```java
public class loops {
       public static void main(String args[]) {

              int i = 1;

              while(i <= 10) {
                     System.out.println(i);
                     i++;
              }
       }
}
```

------------------------------------------------------------

Sum of First N Natural Numbers using While Loop

TC: O(N)
Reason: The loop runs N times to calculate the sum.

SC: O(1)
Reason: Uses only a constant number of variables.

```java
import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();
              int i = 1;
              int sum = 0;

              while(i <= n) {
                     sum += i;
                     i++;
              }

              System.out.println(sum);

              sc.close();
       }
}
```

------------------------------------------------------------

Print "Hello World" 10 Times using For Loop

TC: O(N)
Reason: The for loop runs N times (here N = 10).

SC: O(1)
Reason: Uses only one loop variable.

```java
public class loops {
       public static void main(String args[]) {

              for(int i = 0; i < 10; i++) {
                     System.out.println("Hello World");
              }
       }
}
```

------------------------------------------------------------

Print a 4 × 4 Star Pattern using For Loop

TC: O(N)
Reason: The for loop runs N times (here N = 4).

SC: O(1)
Reason: Uses only one loop variable.

```java
public class loops {
       public static void main(String args[]) {

              for(int i = 0; i < 4; i++) {
                     System.out.println("* * * *");
              }
       }
}
```

------------------------------------------------------------

Print a 4 × 4 Star Pattern using While Loop

TC: O(N)
Reason: The while loop runs N times (here N = 4).

SC: O(1)
Reason: Uses only one loop variable.

```java
public class loops {
       public static void main(String args[]) {

              int i = 0;

              while(i < 4) {
                     System.out.println("* * * *");
                     i++;
              }
       }
}
```

------------------------------------------------------------

Reverse Digits of a Number (Without Storing)

TC: O(D)
Reason: The loop runs once for every digit of the number.

SC: O(1)
Reason: Uses only a constant number of variables.

```java
import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter the Number to be Reversed: ");
              int x = sc.nextInt();

              while(x > 0) {
                     int lastDigit = x % 10;
                     System.out.print(lastDigit);
                     x = x / 10;
              }

              System.out.println();

              sc.close();
       }
}
```

------------------------------------------------------------

Reverse a Number

TC: O(D)
Reason: The loop runs once for every digit of the number.

SC: O(1)
Reason: Uses only a constant number of variables.

```java
import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter the Number to be Reversed: ");
              int x = sc.nextInt();

              int rev = 0;

              while(x > 0) {
                     int lastDigit = x % 10;
                     rev = (rev * 10) + lastDigit;
                     x = x / 10;
              }

              System.out.println(rev);

              sc.close();
       }
}
```




// ------------------------------------------------------------
// Print "Hello World" using Do-While Loop
//
// TC: O(N)
// Reason: The do-while loop runs N times (here N = 2).
//
// SC: O(1)
// Reason: Uses only one loop variable.
// ------------------------------------------------------------

public class loops {
       public static void main(String args[]) {

              int i = 1;

              do {
                     System.out.println("Hello World");
                     i++;
              } while (i <= 2);
       }
}

// ------------------------------------------------------------
// Use Continue and Break in a Loop
//
// TC: O(N)
// Reason: The loop processes N user inputs until -1 is entered.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              while (true) {

                     int x = sc.nextInt();

                     if (x % 10 == 0) {
                            continue;
                     }

                     if (x == -1) {
                            break;
                     }

                     System.out.println(x);
              }

              sc.close();
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

import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int x = sc.nextInt();

              if (x == 0 || x == 1) {
                     System.out.println(x + " is Not a Prime Number");
              } else {

                     boolean isPrime = true;

                     for (int i = 2; i * i <= x; i++) {

                            if (x % i == 0) {
                                   isPrime = false;
                                   break;
                            }
                     }

                     if (isPrime) {
                            System.out.println(x + " is a Prime Number");
                     } else {
                            System.out.println(x + " is Not a Prime Number");
                     }
              }

              sc.close();
       }
}

// ------------------------------------------------------------
// Find Sum of Even and Odd Numbers
//
// TC: O(N)
// Reason: The loop runs once for each input number.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();

              int evenSum = 0;
              int oddSum = 0;

              for (int i = 0; i < n; i++) {

                     int x = sc.nextInt();

                     if (x % 2 == 0) {
                            evenSum += x;
                     } else {
                            oddSum += x;
                     }
              }

              System.out.println("Sum of even numbers = " + evenSum);
              System.out.println("Sum of odd numbers = " + oddSum);

              sc.close();
       }
}

// ------------------------------------------------------------
// Find the Factorial of a Number
//
// TC: O(N)
// Reason: The loop runs N times to calculate the factorial.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();
              long fact = 1;

              for (int i = 1; i <= n; i++) {
                     fact *= i;
              }

              System.out.println("Factorial = " + fact);

              sc.close();
       }
}

// ------------------------------------------------------------
// Print Multiplication Table of a Number
//
// TC: O(1)
// Reason: The loop always runs exactly 10 times.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class loops {
       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();

              for (int i = 1; i <= 10; i++) {
                     System.out.println(n + " * " + i + " = " + (n * i));
              }

              sc.close();
       }
}

// ------------------------------------------------------------
// Variable Scope in For Loop
//
// TC: O(1)
// Reason: The explanation does not involve any algorithmic computation.
//
// SC: O(1)
// Reason: No extra memory is used.
// ------------------------------------------------------------

public class loops {
       public static void main(String args[]) {

              for (int i = 0; i <= 5; i++) {
                     System.out.println("i = " + i);
              }

              // System.out.println(i); ❌ Error
       }
}

/*
 * Reason:
 * The variable 'i' is declared inside the for loop.
 * Its scope is limited to that loop only.
 * After the loop ends, 'i' no longer exists.
 * Therefore, using 'i' outside the loop causes a compilation error.
 */


*/















































































































































































