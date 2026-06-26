/* 

# Conditional Statements - Index

| Sr. No. | Program                                         | Time Complexity | Space Complexity |
| :-----: | ----------------------------------------------- | :-------------: | :--------------: |
|    1    | Pass or Fail using Ternary Operator             |     **O(1)**    |     **O(1)**     |
|    2    | Calculator using Switch Case                    |     **O(1)**    |     **O(1)**     |
|    3    | Check Positive, Negative or Zero                |     **O(1)**    |     **O(1)**     |
|    4    | Check if Number is Greater than or Equal to 100 |     **O(1)**    |     **O(1)**     |
|    5    | Print Day of Week using Switch Case             |     **O(1)**    |     **O(1)**     |
|    6    | Check Leap Year                                 |     **O(1)**    |     **O(1)**     |

---

# Complexity Summary

| Complexity     | Programs                                                                                                                                                                                                   |
| -------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**       | Pass or Fail using Ternary Operator, Calculator using Switch Case, Check Positive, Negative or Zero, Check if Number is Greater than or Equal to 100, Print Day of Week using Switch Case, Check Leap Year |
| **O(1) Space** | Pass or Fail using Ternary Operator, Calculator using Switch Case, Check Positive, Negative or Zero, Check if Number is Greater than or Equal to 100, Print Day of Week using Switch Case, Check Leap Year |




// ------------------------------------------------------------
// Conditional Statements | Pass or Fail using Ternary Operator
//
// TC: O(1)
// Reason: Performs one comparison and one assignment.
//
// SC: O(1)
// Reason: Uses only a constant number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class conditional {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int marks = sc.nextInt();

              String result = (marks >= 35) ? "Pass" : "Fail";

              System.out.println(result);

              sc.close();
       }
}


// ------------------------------------------------------------
// Conditional Statements | Calculator using Switch Case
//
// TC: O(1)
// Reason: Performs one arithmetic operation based on the selected operator.
//
// SC: O(1)
// Reason: Uses only a fixed number of variables.
// ------------------------------------------------------------

import java.util.Scanner;

public class conditional {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              float A = sc.nextFloat();
              float B = sc.nextFloat();
              char op = sc.next().charAt(0);

              float result;

              switch (op) {

                     case '+':
                            result = A + B;
                            System.out.println(result);
                            break;

                     case '-':
                            result = A - B;
                            System.out.println(result);
                            break;

                     case '*':
                            result = A * B;
                            System.out.println(result);
                            break;

                     case '/':
                            result = A / B;
                            System.out.println(result);
                            break;

                     case '%':
                            result = A % B;
                            System.out.println(result);
                            break;

                     default:
                            System.out.println("Enter a valid operator.");
              }

              sc.close();
       }
}


// ------------------------------------------------------------
// Conditional Statements | Check Positive, Negative or Zero
//
// TC: O(1)
// Reason: Performs only a few comparisons.
//
// SC: O(1)
// Reason: Uses only one variable.
// ------------------------------------------------------------

import java.util.Scanner;

public class conditional {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int num = sc.nextInt();

              if (num > 0) {
                     System.out.println("Positive");
              } else if (num < 0) {
                     System.out.println("Negative");
              } else {
                     System.out.println("Neither Positive nor Negative");
              }

              sc.close();
       }
}


// ------------------------------------------------------------
// Conditional Statements | Check if Number is Greater than or Equal to 100
//
// TC: O(1)
// Reason: Performs only one comparison.
//
// SC: O(1)
// Reason: Uses only one variable.
// ------------------------------------------------------------

import java.util.Scanner;

public class conditional {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int num = sc.nextInt();

              if (num >= 100) {
                     System.out.println("Number is Greater than or Equal to 100");
              } else {
                     System.out.println("Number is Less than 100");
              }

              sc.close();
       }
}


// ------------------------------------------------------------
// Conditional Statements | Print Day of Week using Switch Case
//
// TC: O(1)
// Reason: Executes one switch case based on the input.
//
// SC: O(1)
// Reason: Uses only one variable.
// ------------------------------------------------------------

import java.util.Scanner;

public class conditional {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter a number (1-7): ");
              int weekNum = sc.nextInt();

              switch (weekNum) {

                     case 1:
                            System.out.println("Monday");
                            break;

                     case 2:
                            System.out.println("Tuesday");
                            break;

                     case 3:
                            System.out.println("Wednesday");
                            break;

                     case 4:
                            System.out.println("Thursday");
                            break;

                     case 5:
                            System.out.println("Friday");
                            break;

                     case 6:
                            System.out.println("Saturday");
                            break;

                     case 7:
                            System.out.println("Sunday");
                            break;

                     default:
                            System.out.println("Enter a valid number.");
              }

              sc.close();
       }
}


// ------------------------------------------------------------
// Conditional Statements | Check Leap Year
//
// TC: O(1)
// Reason: Performs a constant number of arithmetic and logical operations.
//
// SC: O(1)
// Reason: Uses only one variable.
// ------------------------------------------------------------

import java.util.Scanner;

public class conditional {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int year = sc.nextInt();

              if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                     System.out.println("Leap Year");
              } else {
                     System.out.println("Not a Leap Year");
              }

              sc.close();
       }
}




*/