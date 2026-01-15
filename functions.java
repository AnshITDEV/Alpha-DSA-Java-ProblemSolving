// import java.util.Scanner;

// public class functions 
// {
       
//        public static void hello()
//        {
//               System.out.println("hello");
//               System.out.println("hello");
//               System.out.println("hello");
//               return;
//        }
       
//        public static int Sum(int a, int b)
//        {
             
//               int sum = a + b;

//               System.out.println("sum is : " + sum);
//               return sum;   
              
//        }
       
       
//        public static void main(String args[])
//        {


//               Scanner sc = new Scanner(System.in);
//               int a = sc.nextInt();
//               int b = sc.nextInt();
//               hello();
//               int sumAB = Sum(a,b);
//               sc.close();

//               System.out.println("sum is : " + sumAB);
              

//        }
       
// }



// import java.util.Scanner;

// public class functions {

//        public static void hello() {
//               System.out.println("hello");
//               System.out.println("hello");
//               System.out.println("hello");
//               return;
//        }

//        public static int Sum(int a, int b) {

//               int sum = a + b;

//               System.out.println("sum is : " + sum);
//               return sum;

//        }

//        public static void main(String args[]) {

//               try(Scanner sc = new Scanner(System.in))
//               {int a = sc.nextInt();
//               int b = sc.nextInt();

//               //swap 
//               int temp = a;
//               a = b;
//               b = temp;

//               System.out.println(a);
//               System.out.println(b);

//               }
//        }

// }





// import java.util.Scanner;

// public class functions {



//        public static int swap(int a, int b)
//        {

//               // swap
//               int temp = a;
//               a = b;
//               b = temp;

//               return a;
//               return b;
              

//        }



//        public static void main(String args[]) {

              
//                      int a;
//                      int b;

//                      int result = swap(5,10);    

//                      System.out.println(result);
                     

              
//        }

// }



// import java.util.Scanner;

// public class functions {

//        public static void change(int x)
//        {
//               x = 20;
//               System.out.println(x);

//        }


//        public static void main(String args[]){
//               int a = 10;
//               change(a);
//               System.out.println(a);

//        }      

// }


// import java.util.Scanner;

// public class functions {

//        public static int multiply(int x, int y) {
//               int multiply = x * y;
//               System.out.println(multiply);
//               return multiply;
//        }

//        public static void main(String args[]) {
       

//               int result = multiply(10,6);

              
//               System.out.println(result);

//        }

// }


// import java.util.Scanner;

// public class functions {

//        public static int factorial(int n){

//               int fact = 1;

//               for(int i = 1; i <= n; i++)
//               {
//               fact = fact * i;

//               }
//               return fact;

//        }

//        public static void main(String args[]) {

//               int result = factorial(6);

//               System.out.println(result);

//        }

// }


// import java.util.Scanner;

// public class functions {

//        public static int factorial(int n) {

//               int fact = 1;

//               for (int i = 1; i <= n; i++) {
//                      fact = fact * i;

//               }
//               return fact;

//        }


//        public static int binocoeff(int n, int r)
//        {
//               int a = factorial(n);
//               int b = factorial(r);

//               int c = factorial(n-r);

//               int BC = a/(b*c);

//               System.out.println(BC);
//               return BC;
//        }





//        public static void main(String args[]) {

//               int result = binocoeff(5, 2);

//               System.out.println(result);

              

              
              
//        }

// }




// import java.util.Scanner;

// public class functions {


//               //sum of two 
//               public static int sum(int a, int b)
//               {
//                      return a+b;
//               }


//               public static float sum(float a, float b) {
//                      return a + b ;
//               }

//               public static void main(String args[])
//               {
                     
                     

//                      System.out.println(sum(10,20));
//                      System.out.println(sum(10.5f, 20.8f));


                     
//               }
       
             

// }



// import java.util.Scanner;

// public class functions {

//        public static boolean isPrime(int n)
//        {
              

//               if(n < 2)
//               {
//                      return false  ;
       
//               }
              
              
//                      for(int i = 2; i*i <= n; i++)
//                      {
//                             if(n % i == 0)
//                             {
//                                    return false;
                                   

//                             }
//                      }
//               return true;
                     
//               }

              
       

       

//        public static void main(String args[]) {

//               int n = 7;

//               boolean result = isPrime(n);

//               System.out.println(result);


//        }

// }








// import java.util.Scanner;

// public class functions {

//        public static boolean isPrime(int n) {

//               if (n < 2) {
//                      return false;

//               }

//               for (int i = 2; i * i <= n; i++) {
//                      if (n % i == 0) {
//                             return false;
//                      }
//               }
              
//               return true;

//        }

//        public static void PrintPrime(int n)
//        {
//               for (int i = 2; i <= n; i++) 
//               {
                     
//                      if(isPrime(i))
//                      {
//                             System.out.println(i+" ");
                            
//                      }
                     
                     
//               }


//        }

//        public static void main(String args[]) {

//               int n = 9;

//               PrintPrime(n);

              

//        }

// }




// import java.util.*;

// public class functions 
// {
//        public static int Convert(int bin)
//        {

//               int POW = 0;
//               int dec = 0;


//               while(bin != 0)
//               {      
//                      int LD = bin % 10;
//                      dec = dec + (LD * (int)Math.pow(2,POW));

//                      POW++;
//                      bin = bin / 10;

//               }
//               System.out.println("decimal number of bin num" + " " + bin);
//               return dec;
              
              
//        }


//        public static void main(String args[]) 
//        {
//               try(Scanner sc = new Scanner(System.in))
//               {
//                      int bin,dec;

//                      System.out.println("Enter a binary number");

//                      bin = sc.nextInt();

//                      dec = Convert(bin);

//                      System.out.println(dec);

//               }
              
//        }

// }



// public class functions 
// {
//        public static void decToBin(int n)
//        {      
//               int pow = 0;
//               int bin = 0;
//               int myNum = n;
              
//               while (n>0)
//               {      
//                      int rem = n % 2;
//                      bin = bin + (rem * (int)Math.pow(10,pow));
//                      pow++;
//                      n = n / 2;

//               }
//               System.out.println("Binary form of " + myNum + " = " + bin);
//        }
//        public static void main(String args[])
//        {
//               decToBin(7);
//               decToBin(12);
//               decToBin(15);
//        }
// }     




// Question 1: Average of three numbers (method)


// public class functions
// {

//        public static double average(int a, int b, int c )
//        {
//               double average = (a + b + c)/3.0;
//               return average;
//        }

//        public static void main(String args[])
//        {
//               System.out.println(average(10, 20, 32));
//        }
// }


// Question 2: isEven method + test program

// public class functions
// {

//        public static boolean isEven(int n)
//        {
//               if (n % 2 == 0) {
//                      return true;
//               } else {
//                      return false;
//               }

//        }


//        public static void main(String args[])
//        {
//               System.out.println(isEven(10));
//               System.out.println(isEven(7));
//        }
// }



// Question 3: Palindrome number check

// import java.util.Scanner;

// public class functions
// {
//        public static boolean isPalindrome(int num)
//        {      

//               int og = num;
//               int rev = 0;



//               while(num != 0)
//               {
//               int LD = num % 10;
//               rev = rev*10 + LD;
//               num = num / 10;
//               }

//               if(og == rev)
//               {
//                      return true;
//               }
//               else
//               {
//                      return false;
//               }

//        }
       
       
       
       
//        public static void main(String args[])
//        {
//               Scanner sc = new Scanner(System.in);
//               int num = sc.nextInt();

//               System.out.println(isPalindrome(num));

//               sc.close();
//        }
// }



// Question 5: Sum of digits of an integer

// import java.util.Scanner;

// public class functions
// {

//        public static int sumDigit(int num)
//        {
//               int sum = 0;
              
//               while(num>0)
//               {
//               int LD = num % 10;
//               sum = sum + LD;
//               num = num / 10;
              
//               }
              
//               return sum;
//        }


//        public static void main(String args[])
//        {
//               Scanner sc = new Scanner(System.in);
//               int num = sc.nextInt();

//               System.out.println(sumDigit(num));
//               sc.close();
//        }
// }




