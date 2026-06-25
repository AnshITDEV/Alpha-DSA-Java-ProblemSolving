/* 

Pass or Fail using Ternary Operator

TC:O(1)Reason:Only one comparison and one print operation.
SC:O(1)Reason:Uses only a constant number of variables.



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



Calculator using Switch Case

TC:O(1)    
Reason: Executes only one switch case.

SC: O(1)   
Reason: Uses only a fixed number of variables.



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




Check Positive, Negative or Zero

TC: O(1)
Reason: Performs only a few comparisons.

SC: O(1)
Reason: Uses only one variable.




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


Check if Number is Greater than or Equal to 100

TC: O(1)
Reason: Performs only one comparison.

SC: O(1)
Reason: Uses only one variable.




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

Print Day of Week using Switch Case

TC:O(1)
Reason: Executes only one switch case.

SC: O(1)
Reason: Uses only one variable.

import java.util.Scanner;

public class conditional {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              System.out.println("Enter a number (1-7)");
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



Check Leap Year

TC:O(1)
Reason: Performs only a few arithmetic and logical operations.

SC: O(1)
Reason: Uses only one variable.




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