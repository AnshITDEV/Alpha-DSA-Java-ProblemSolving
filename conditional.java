// import java.util.Scanner;

// public class conditional {
//        public static void main(String args[])
//        { 
//               Scanner sc = new Scanner(System.in);
//               int marks = sc.nextInt();

//               String Result = (marks >= 35)? "Pass" : "Fail";

//               System.out.println(Result);
//               sc.close();     
//        }
// }


// import java.util.Scanner;

// public class conditional {
//        public static void main(String args[]) {
//               Scanner sc = new Scanner(System.in);
//               float A = sc.nextFloat();
//               float B = sc.nextFloat();
//               float R;
//               char Op = sc.next().charAt(0);
              
//               switch(Op)
//               {
//               case '+' : 
//               R = A+B;
//               System.out.println("SUM OF A AND B: "+R);
//               break;
//               case '-' : 
//               R = A-B;
//               System.out.println(R);
//               break;
//               case '*' : 
//               System.out.println(A*B);
//               break;
//               case '/':
//               R = (A / B);
//               System.out.println(R);
//               break;
//               case '%':
//               R = A % B;
//               System.out.println(R);
//               break;
//               default : System.out.println("Enter a valid choice:");
//               }
//               sc.close();
//        }
// }



// number from user
// print
// if > 0 
// else if < 0
// else neither positive nor negative



// if >= 100
// else 


// import java.util.Scanner;

// public class conditional
// {
//        public static void main(String args[])
//        {
//               Scanner sc = new Scanner(System.in);

//               System.out.println("enter a number 1-7");
//               int weeknum = sc.nextInt(); 

//               switch(weeknum)
//               {
//                      case 1:
//                      System.out.println("Monday");
//                      break;

//                      case 2:
//                      System.out.println("Tues");
//                      break;

//                      case 3:
//                      System.out.println("wed");
//                      break;

//                      case 4:
//                      System.out.println("thurs");
//                      break;

//                      case 5:
//                      System.out.println("friday");
//                      break;

//                      case 6:
//                      System.out.println("sat");
//                      break;

//                      case 7:
//                      System.out.println("sun");
//                      break;

//                      default:
//                      System.out.println("enter a valid number!!");
              
//                      sc.close();

//               }
//        }
// }



import java.util.Scanner;

public class conditional {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int year = sc.nextInt();

if((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0))
{
       System.out.println("leap year");
}

else
{
       System.out.println("not a leap year");
}


sc.close();
}
}



