// import java.util.Scanner;

// public class pattern 
// {
//        public static void main(String[] args) 
//        {
//               try(Scanner sc = new Scanner(System.in))
//               {

//               System.out.print("Enter number of rows: ");
//               int n = sc.nextInt();

//               for(int i = 1; i <= n; i++)
//               {
//                      for(int j = 0; j <= n-i; j++)
//                      {
//                             System.out.print("* ");
//                      }
//                      System.out.println();
//               }

//        }

//        }

       
// }


// import java.util.Scanner;

// public class pattern 
// {
//        public static void main(String[] args) 
//        {
//               try (Scanner sc = new Scanner(System.in)) 
//               {

//                      System.out.print("Enter number of rows: ");
//                      int n = sc.nextInt();

//                      char ch = 'A';

//                      for (int i = 1; i <= n; i++) 
//                      {
//                             for (int j = 1; j <= i; j++) 
//                             {
//                                    System.out.print(ch+" ");
//                                    ch++;
//                             }
//                             System.out.println();
//                      }

//               }

//        }

// }




// import java.util.Scanner;

// public class pattern {
//        public static void main(String[] args) {
//               try (Scanner sc = new Scanner(System.in)) {

//                      System.out.print("Enter number of rows: ");
//                      int n = sc.nextInt();

//                      char ch = 'A';

//                      for (int i = 1; i <= n; i++) {
//                             for (int j = 1; j <= i; j++) {
//                                    System.out.print(ch + " ");
//                                    ch++;
//                             }
//                             System.out.println();
//                      }

//               }

//        }

// }



// public class Patterns
// {

//        public static void Pattern(int r, int c)
//        {
//               for(int i = 1; i<=r; i++)
//               {
//                      for(int j=1; j<=c; j++)
//                      {
//                             if(i == 1 || i == r || j == 1 || j == c)
//                             {
//                                    System.out.print("* ");
//                             }
//                             else
//                             {
//                                    System.out.print("  ");
//                             }

                            

//                      }
//                      System.out.println();
//               }

              



              
//        }

//        public static void main(String args[])
//        {
//               Pattern(10,8);

//        }
       
// }


// public class Patterns
// {
//        public static void pattern(int r)
//        {
//               for(int i = 1; i <= r; i++)
//               {
//                      for(int j = 1; j <= r-i ; j++)
//                      {
//                             System.out.print(" ");
//                      }
//                      for(int j = 1; j <= i ; j++)
//                      {
//                             System.out.print("*");
//                      }
//                      System.out.println();
//               }

//        }

//        public static void main(String args[])
//        {
//               pattern(4);

//        }


// }



// public class Patterns {
//        public static void pattern(int r) {
//               for (int i = 1; i <= r; i++) {
//                      for (int j = 1; j <= r-i+1; j++) {
//                             System.out.print(j+" ");
//                      }
//                      if(i != 1)
//                      {
//                             for(int j = 1; j <= i-1; j++) 
//                             {
//                             System.out.print(" ");
//                             }
//                      }
//                      System.out.println();
//               }

//        }

//        public static void main(String args[]) {
//               pattern(5);

//        }

// }



//floyd triangle

public class Patterns 
{
       public static void pattern(int n) 
       {
              int counter = 1;

              for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <= i; j++) 
                     {

                            System.out.print(counter+" ");
                            counter++;
                     }
                     
                     System.out.println();
              }

       }

       public static void main(String args[]) {
              pattern(5);

       }

}