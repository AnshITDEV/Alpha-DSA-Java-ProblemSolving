/*Bit Manipulation | Odd or Even | Least Significant Bit
TC: O(1)
SC: O(1)



public class bitManipulation
{
       public static void oddOrEven(int n)
       {
              int bitMask = 1;
              

              if((n & bitMask) == 0)
              {
                     System.out.println("even number");
              }
              else
              {
                     System.out.println("odd number");
              }
       }


       public static void main(String[] args)
       {
              int n;
              oddOrEven(10);
              oddOrEven(7);
       }
}
*/


