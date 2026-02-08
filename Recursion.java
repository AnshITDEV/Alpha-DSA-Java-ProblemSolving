/* Print numbers in decreasing order from n to 1 using recursion. 
TC: O(n)
SC: O(n)

public class Recursion
{
       public static void printDec(int n)
       {
              if(n == 1)
              {
                     System.out.println(1);
                     return;
              }
              
              System.out.print(n+" ");

              printDec(n-1);
       }
       public static void main(String args[])
       {
              int n = 10;
              printDec(n);
       }
}

*/