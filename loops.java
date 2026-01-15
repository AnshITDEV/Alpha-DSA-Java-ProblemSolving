// public class loops {
//        public static void main(String args[])
//        {      
//               int i = 1;

//               while(i<=10)
//               {
//                      System.out.println(i);
//                      i++;
//               }
//        }
       
// }

// import java.util.Scanner;

// public class loops {
//        public static void main(String args[])
//        {      
//               int i = 1;

//               try (Scanner s = new Scanner(System.in))
//               {
//               int n = s.nextInt();
//               int sum = 0;

//                while(i<=n)
//                {     
//                      sum += i;
//                      i++;
//                }
//                System.out.print(sum);
//               }
//        }
       
// }




// public class loops {
//        public static void main(String args[]) 
//        {
//               for(int i=0; i<10; i++)
//               {
//                      System.out.println("Hello world");
//               }   
//        }

// }


// public class loops {
//        public static void main(String args[]) {
//               for (int i = 0; i < 4; i++) {
//                      System.out.println("* * * *");
//               }
//        }
// }



// public class loops {
//        public static void main(String args[]) {
//               int i = 0;
//               while(i<4)
//               {
//                      System.out.println("* * * *");
//                      i++;
//               }
//        }
// }




// import java.util.Scanner;

// public class loops {
//        public static void main(String args[]) {
//               Scanner sc = new Scanner(System.in);
//               System.out.println("Enter the Number to be Reversed: ");


//               int x = sc.nextInt();
//               while(x>0)
//               {
//                      int lastDigit = x % 10;
//                      System.out.print(lastDigit);
//                      x = x / 10;
                     

//               }
//               System.out.println();
//               sc.close();
//        }
// }



// import java.util.Scanner;

// public class loops {
//        public static void main(String args[]) {
//               Scanner sc = new Scanner(System.in);
//               System.out.println("Enter the Number to be Reversed: ");

//               int rev = 0;
//               int x = sc.nextInt();

//               while (x > 0) 
//               {
//                      int lastDigit = x % 10;
//                      rev = (rev * 10) + lastDigit;
//                      x = x / 10;
                     

//               }
//               System.out.println(rev);
//               sc.close();
//        }
// }


// import java.util.Scanner;

// public class loops 
// {
//        public static void main(String args[])
//        {
//               int i = 1;
//               do
//               {
//                      System.out.println("Hello world");
//                      i++;
//               }
//               while(i<=2);
//        }
// }
// 


// import java.util.*;

// public class loops 
// {
//        public static void main(String args[])
//        {


//               try(Scanner sc = new Scanner(System.in))
//               {
//               while (true)
//               {
//               int x = sc.nextInt();

//               if(x % 10 == 0)
//               {
//                      continue;
//               }

//               if(x == -1)
//               {
//                      break;
//               }

//               System.out.println(x);
//               }
//        }

              


//        }
// }


// import java.util.*;

// public class loops {
//        public static void main(String args[]) {

//               try (Scanner sc = new Scanner(System.in)) 
//               {
//                      int x = sc.nextInt();

              
//                      if(x == 0 || x == 1)
//                      {
//                             System.out.println(x + " is Not a Prime number:");
//                      }
//                      else
//                      {
//                             boolean isPrime = true;
//                             for (int i = 2; i*i<=x ; i++) {

//                                    if (x % i == 0) 
//                                    {
//                                           isPrime = false;
//                                           break;
//                                    }

//                             }

//                             if(isPrime == true)
//                             {
//                                    System.out.println(x+" is a Prime number:");
//                             }
//                             else
//                             {
//                                    System.out.println(x+" is Not a Prime number:");
//                             }
//                      }
                     
               

//        }
// }






// import java.util.*;

// public class loops 
// {
//        public static void main(String args[]) 
//        {
//               Scanner sc = new Scanner(System.in);

//               int n = sc.nextInt();

//               int evenSum = 0, oddSum = 0;

//               for(int i=0; i < n; i++)
//               {
//                      int x = sc.nextInt();

//                      if(x % 2 == 0)
//                      {
//                             evenSum = evenSum + x;
//                      }
//                      else 
//                      {
//                             oddSum = oddSum + x;
//                      }
                     


                     
//               }
//               sc.close();

//               System.out.println("Sum of even numbers = " + evenSum);
//               System.out.println("Sum of odd numbers = " + oddSum);







//        }
// }




// ✅ Question 3

// Write a program to find the factorial of a number entered by the user.

// import java.util.*;

// public class loops 
// {
// public static void main(String[] args) 
// {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long fact = 1;

//        for(int i = 1; i <= n; i++)
//        {
//               fact = fact * i;
//        }
//        System.out.println("Factorial = " + fact);
//        sc.close();

// }
// }


// ✅ Question 4
// Write a program to print the multiplication table of a number N entered by the user.

// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         long multi = 1;

//         for(int i = 1; i <= 10; i++)
//         {
//               multi = n * i;
//               System.out.println(n+" * "+i+" = "+multi);
//         }
//         sc.close();
//          }
// }


// ❌ Question 5

// What is wrong in the following program?

// Given code (problematic part)

// for(int i = 0; i <= 5; i++) {
//     System.out.println("i = " + i);
// }

// System.out.println("i after the loop = " + i);
