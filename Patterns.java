/* 

## Patterns - Index

| Sr. No. | Pattern                            | Time Complexity | Space Complexity |
| :-----: | ---------------------------------- | :-------------: | :--------------: |
|    1    | Inverted Star Pattern              |    **O(N²)**    |     **O(1)**     |
|    2    | Character Pattern                  |    **O(N²)**    |     **O(1)**     |
|    3    | Hollow Rectangle Pattern           |   **O(R × C)**  |     **O(1)**     |
|    4    | Rotated Half Pyramid               |    **O(N²)**    |     **O(1)**     |
|    5    | Inverted Half Pyramid with Numbers |    **O(N²)**    |     **O(1)**     |
|    6    | Floyd's Triangle                   |    **O(N²)**    |     **O(1)**     |
|    7    | 0-1 Triangle                       |    **O(N²)**    |     **O(1)**     |
|    8    | Butterfly Pattern                  |    **O(N²)**    |     **O(1)**     |
|    9    | Solid Rhombus                      |    **O(N²)**    |     **O(1)**     |
|    10   | Hollow Rhombus                     |    **O(N²)**    |     **O(1)**     |
|    11   | Diamond Pattern                    |    **O(N²)**    |     **O(1)**     |

---

### Complexity Summary

| Complexity   | Patterns                                                                                                                                                                                      |
| ------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(N²)**    | Inverted Star, Character Pattern, Rotated Half Pyramid, Inverted Half Pyramid with Numbers, Floyd's Triangle, 0-1 Triangle, Butterfly Pattern, Solid Rhombus, Hollow Rhombus, Diamond Pattern |
| **O(R × C)** | Hollow Rectangle Pattern                                                                                                                                                                      |








// ------------------------------------------------------------
// Inverted Star Pattern
//
// TC: O(N²)
// Reason: Two nested loops print approximately N × N characters.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class pattern {
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter number of rows: ");
              int n = sc.nextInt();

              for(int i = 1; i <= n; i++) {

                     for(int j = 0; j <= n - i; j++) {
                            System.out.print("* ");
                     }

                     System.out.println();
              }

              sc.close();
       }
}

// ------------------------------------------------------------
// Character Pattern
//
// TC: O(N²)
// Reason: Nested loops print characters in triangular form.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class pattern {
       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter number of rows: ");
              int n = sc.nextInt();

              char ch = 'A';

              for (int i = 1; i <= n; i++) {

                     for (int j = 1; j <= i; j++) {
                            System.out.print(ch + " ");
                            ch++;
                     }

                     System.out.println();
              }

              sc.close();
       }
}

// ------------------------------------------------------------
// Hollow Rectangle Pattern
//
// TC: O(R × C)
// Reason: Every cell of the rectangle is visited once.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void pattern(int r, int c) {

              for (int i = 1; i <= r; i++) {

                     for (int j = 1; j <= c; j++) {

                            if (i == 1 || i == r || j == 1 || j == c) {
                                   System.out.print("* ");
                            } else {
                                   System.out.print("  ");
                            }
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              pattern(10, 8);
       }
}

// ------------------------------------------------------------
// Rotated Half Pyramid
//
// TC: O(N²)
// Reason: Two nested loops print spaces and stars.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void pattern(int r) {

              for (int i = 1; i <= r; i++) {

                     for (int j = 1; j <= r - i; j++) {
                            System.out.print(" ");
                     }

                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              pattern(4);
       }
}

// ------------------------------------------------------------
// Inverted Half Pyramid with Numbers
//
// TC: O(N²)
// Reason: Nested loops print numbers and spaces.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void pattern(int r) {

              for (int i = 1; i <= r; i++) {

                     for (int j = 1; j <= r - i + 1; j++) {
                            System.out.print(j + " ");
                     }

                     if (i != 1) {

                            for (int j = 1; j <= i - 1; j++) {
                                   System.out.print(" ");
                            }
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              pattern(5);
       }
}

// ------------------------------------------------------------
// Floyd's Triangle
//
// TC: O(N²)
// Reason: Nested loops print consecutive numbers.
//
// SC: O(1)
// Reason: Uses only one extra counter variable.
// ------------------------------------------------------------

public class Patterns {

       public static void pattern(int n) {

              int counter = 1;

              for (int i = 1; i <= n; i++) {

                     for (int j = 1; j <= i; j++) {

                            System.out.print(counter + " ");
                            counter++;
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              pattern(5);
       }
}



// ------------------------------------------------------------
// 0-1 Triangle
//
// TC: O(N²)
// Reason: Two nested loops print one value for every position.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void pattern(int n) {

              for (int i = 1; i <= n; i++) {

                     for (int j = 1; j <= i; j++) {

                            if ((i + j) % 2 == 0) {
                                   System.out.print("1 ");
                            } else {
                                   System.out.print("0 ");
                            }
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              pattern(5);
       }
}

// ------------------------------------------------------------
// Butterfly Pattern
//
// TC: O(N²)
// Reason: Four nested-loop sections together print O(N²) characters.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void butterfly(int n) {

              // Upper Half
              for (int i = 1; i <= n; i++) {

                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }

                     for (int j = 1; j <= 2 * (n - i); j++) {
                            System.out.print(" ");
                     }

                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }

                     System.out.println();
              }

              // Lower Half
              for (int i = n; i >= 1; i--) {

                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }

                     for (int j = 1; j <= 2 * (n - i); j++) {
                            System.out.print(" ");
                     }

                     for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              butterfly(5);
       }
}

// ------------------------------------------------------------
// Solid Rhombus
//
// TC: O(N²)
// Reason: Two nested loops print all rows and columns.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void solidRhombus(int n) {

              for (int i = 1; i <= n; i++) {

                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }

                     for (int j = 1; j <= n; j++) {
                            System.out.print("*");
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              solidRhombus(5);
       }
}

// ------------------------------------------------------------
// Hollow Rhombus
//
// TC: O(N²)
// Reason: Every position inside the rhombus is visited once.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void hollowRhombus(int n) {

              for (int i = 1; i <= n; i++) {

                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }

                     for (int j = 1; j <= n; j++) {

                            if (i == 1 || i == n || j == 1 || j == n) {
                                   System.out.print("*");
                            } else {
                                   System.out.print(" ");
                            }
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              hollowRhombus(5);
       }
}

// ------------------------------------------------------------
// Diamond Pattern
//
// TC: O(N²)
// Reason: Upper and lower halves together print O(N²) characters.
//
// SC: O(1)
// Reason: Uses only loop variables.
// ------------------------------------------------------------

public class Patterns {

       public static void diamond(int n) {

              // Upper Half
              for (int i = 1; i <= n; i++) {

                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }

                     for (int j = 1; j <= (2 * i) - 1; j++) {
                            System.out.print("*");
                     }

                     System.out.println();
              }

              // Lower Half
              for (int i = n; i >= 1; i--) {

                     for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                     }

                     for (int j = 1; j <= (2 * i) - 1; j++) {
                            System.out.print("*");
                     }

                     System.out.println();
              }
       }

       public static void main(String args[]) {

              diamond(5);
       }
}




*/