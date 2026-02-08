/* OOPS | Object Creation & Method Invocation 
TC: O(1)
SC: O(1)


public class OOPS 
{
       public static void main(String args[])
       {
              pen p1 = new pen();
              
              p1.setColor("Blue");
              System.out.println(p1.Color);

              p1.setTip(5);
              System.out.println(p1.tip);

              p1.setColor("Yellow");
              System.out.println(p1.Color);
       }
}

class pen
{
       String Color;
       int tip;

       void setColor(String newColor)
       {
              Color = newColor;
       }

       void setTip(int newTip)
       {
              tip = newTip;
       }
}

class Student
{
       String name;
       int age;
       float percentage;

       void calcPercentage(int p, int c, int m)
       {
              p = 30;
              c = 60;
              m = 50;

              percentage = (p+c+m)/3;
       }
}

*/


/* OOPS | Encapsulation (Data Hiding using Private Members) 

public class OOPS
{
       public static void main(String args[])
       {
              BankAccount myAcc = new BankAccount();

              myAcc.username = "shraddha_khapra";

              // myAcc.password = "abcde"

              myAcc.setPassword("abcde");
       }
}

class BankAccount 
{
       public String username;

       private String password;

       public void setPassword(String pwd) {
              password = pwd;
       }
}

*/


/* OOPS | Getters & Setters with this keyword for Encapsulation 

public class OOPS
{
       public static void main(String args[])
       {
              Pen p1 = new Pen();

              p1.setColor("Blue");

              System.out.println(p1.getColor());
       }

}

class Pen
{
       private String color;

       // getter
       String getColor() 
       {
              return this.color;
       }

       // setter
       void setColor(String newColor) 
       {
              this.color = newColor;
       }
}

*/

/* OOPS | Constructor – Automatically invoked during object creation 

public class OOPS
{
       public static void main(String args[])
       {
              Student s1 = new Student();
       }
}


class Student
{
       String name;
       int roll;

       //constructor
       Student()
       {
              System.out.println("This is constructor");
       }
}


*/ 


/* OOPS | Parameterized Constructor using this keyword 

public class OOPS
{
       public static void main(String args[])
       {
              Student s1 = new Student("Shraddha");
              System.out.println(s1.name);
       }
}

class Student
{
       String name;
       int roll;

       Student(String name)
       {
              this.name = name;
       }
}

*/

/* Constructor Overloading Parameterized Non-Parameterized Constructors 

public class OOPS
{
       public static void main(String args[])
       {
              Student s1 = new Student();

              Student s2 = new Student("ansh");

              Student s3 = new Student(84);
       }

}

class Student
{
       String name;
       int roll;

       // Non-parameterized constructor
       Student()
       {
              System.out.println("Constructor is called...");
       }

       // Parameterized constructors (String)
       Student(String name) 
       {
              this.name = name;
       }

       // Parameterized constructor (int)
       Student(int roll)
       {
              this.roll = roll;
       }

}

*/





/* Code 1: Shallow Copy Constructor 

public class OOPS
{
       public static void main(String args[])
       {
              Student s1 = new Student();
              s1.name = "ansh";
              s1.roll = 34;
              s1.pass = "abcd1234";

              Student s2 = new Student(s1);

              s2.pass = "xyz123";
       }
}

class Student
{
       String name;
       int roll;
       String pass;

       Student(Student s1)
       {
              this.name = s1.name;
              this.roll = s1.roll;
       }

       Student()
       {

       }
}

*/





/* Code 2: Deep Copy 

// Main class
public class OOPS {
       public static void main(String args[]) 
       {
              Student s1 = new Student();

              s1.name = "ansh";
              s1.roll = 35;
              s1.password = "abcd";
              s1.marks[0] = 25;
              s1.marks[1] = 35;
              s1.marks[2] = 45;

              Student s2 = new Student(s1);

              s2.marks[0] = 80;

              System.out.println(s1.marks[0]);
              System.out.println(s2.marks[0]);

       }
}

class Student {

       String name;
       int roll;
       String password;
       int marks[];

       Student()
       {
              marks = new int[3];
       }

       Student(Student s1)
       {
              marks = new int[3];

              this.name = s1.name;
              this.roll = s1.roll;

              for(int i = 0; i < marks.length; i++)
              {
                     this.marks[i] = s1.marks[i];

              }
       }
}

*/

/* OOPS | Inheritance (Single Inheritance) 


public class OOPS 
{
       public static void main(String args[]) 
       {
              Fish shark = new Fish();

              shark.eat();
       }
}


class Animal 
{
       String color;

       void eat()
       {
              System.out.println("eats");
       }

       void sleep()
       {
              System.out.println("Sleeps");
       }
}


class Fish extends Animal
{
       int fins;

       void swim()
       {
              System.out.println("Swims in water");
       }
}
*/




/* OOPS | Multilevel Inheritance 

// Main class
public class OOPS {
       public static void main(String args[]) 
       {
              Dog dobby = new Dog();

              dobby.eat();

              dobby.legs = 4;

              System.out.println(dobby.legs);

              
       }
}


class Animal {

       String color;

       void eat() {
              System.out.println("eats");
       }
}

class Mammal extends Animal
{
       int legs;
}

class Dog extends Mammal
{
       String breed;
}

*/






/* OOPS | Hierarchical Inheritance 

public class OOPS
{
       public static void main(String args[]) 
       {

              Dog dog = new Dog();
              dog.eat();
              dog.bark();

              
              Cat cat = new Cat();
              cat.eat();
              cat.meow();
       }
}

// Base class (Parent)
class Animal
{
       void eat()
       {
              System.out.println("eats");
       }
}

// Child class 1
class Dog extends Animal 
{
       void bark() 
       {
              System.out.println("barks");
       }
}

// Child class 2
class Cat extends Animal 
{

       void meow() 
       {
              System.out.println("meows");
       }
}

*/



/* OOPS | Hybrid Inheritance (Using Interface in Java) 

public class OOPS {
       public static void main(String args[]) {

              // Creating object of Child class
              Child c = new Child();

              c.eat(); // from Animal class
              c.walk(); // from Mammal class
              c.fly(); // from Bird interface
       }
}


class Animal {
       void eat() {
              System.out.println("eats");
       }
}


class Mammal extends Animal {
       void walk() {
              System.out.println("walks");
       }
}


interface Bird {
       void fly();
}


class Child extends Mammal implements Bird {

       public void fly() {
              System.out.println("flies");
       }
}

*/




/* OOPS | Multiple Inheritance (Using Interfaces in Java) */




/* OOPS | Compile-Time Polymorphism (Method Overloading)

// Main class
public class OOPS
{
       public static void main(String args[])
       {
              Calculator calc = new Calculator();

              System.out.println(calc.sum(1, 2));

              System.out.println(calc.sum(1.5f, 2.5f));

              System.out.println(calc.sum(1, 2, 3));
       }
}

class Calculator
{
       int sum(int a, int b)
       {
              return a + b;
       }

       float sum(float a, float b)
       {
              return a + b;
       }

       int sum(int a, int b, int c)
       {
              return a + b + c;
       }
}
*/


/* OOPS | Run-Time Polymorphism (Method Overriding) 

public class OOPS
{
       public static void main(String args[]) 
       {

              Deer d = new Deer();

              d.eat();
       }
}

class Animal
{
       void eat()
       {
              System.out.println("eats anything");
       }
}

class Deer extends Animal
{
       void eat()
       {
              System.out.println("eats grass");
       }
}

*/



/* OOPS | Packages (Inbuilt & User-Defined) 


package myPackage;

import java.util.*;

public class OOPS
{
       public static void main(String args[])
       {

              Scanner sc = new Scanner(System.in);

              int a = sc.nextInt();

              System.out.println(a);
       }
}
*/


/* OOPS | Abstraction using Abstract Class 


public class OOPS
{
       public static void main(String args[])
       {
              // Creating object of Horse class
              Cheetah h = new Cheetah();
              h.eat();     // concrete method from Animal
              h.walk();    // implemented by Horse

              // Creating object of Chicken class
              Chicken c = new Chicken();
              c.eat();     // concrete method from Animal
              c.walk();    // implemented by Chicken
       }
}

// Abstract base class
abstract class Animal
{
       // Concrete method
       void eat()
       {
              System.out.println("animal eats");
       }

       // Abstract method (no body)
       abstract void walk();
}

// Horse class implements abstract method
class Cheetah extends Animal
{
       void walk()
       {
              System.out.println("walks on 4 legs");
       }
}

// Chicken class implements abstract method
class Chicken extends Animal
{
       void walk()
       {
              System.out.println("walks on 2 legs");
       }
}

*/

/* OOPS | Multiple Inheritance using Interfaces (Java)  

public class OOPS
{
       public static void main(String args[])
       {
              // Creating object of Queen
              Queen q = new Queen();

              // Calling overridden method
              q.move();
       }
}

// Interface 1
interface Herbivore
{
}

// Interface 2
interface Carnivore
{
}

// Class implementing multiple interfaces
class Bear implements Herbivore, Carnivore
{
       // Bear can be both herbivore and carnivore
}

// Interface for chess pieces
interface ChessPlayer
{
       void move();
}

// Queen implements ChessPlayer interface
class Queen implements ChessPlayer
{
       public void move()
       {
              System.out.println("left, right, up, down, diagonal");
       }
}

// Rook implements ChessPlayer interface
class Rook implements ChessPlayer
{
       public void move()
       {
              System.out.println("up, down, left, right");
       }
}

*/




/* OOPS | Static Variables (Shared Across Objects) 

public class OOPS
{
       public static void main(String args[])
       {
              Student s1 = new Student();
              s1.schoolName = "JMV";

              Student s2 = new Student();

              Student s3 = new Student();
              s3.schoolName = "ABC";

              System.out.println(s2.schoolName);

       }
}

class Student
{
       String name;
       int roll;

       // Static variable (shared by all objects)
       static String schoolName;

       void setName(String name)
       {
              this.name = name;
       }

       String getName()
       {
              return this.name;
       }
}

*/




/* OOPS | super Keyword (Accessing Parent Class Members) 


public class OOPS
{
       public static void main(String args[])
       {
              Horse h = new Horse();

              // Accessing parent class variable set using super
              System.out.println(h.color);
       }
}

class Animal
{
       String color;

       Animal()
       {
              System.out.println("animal constructor is called");
       }
}

class Horse extends Animal 
{
       

       Horse()
       {
              // Using super to access parent class variable
              super.color = "brown";
              System.out.println("horse constructor is called");
       }

}


*/


/* (Runtime Polymorphism) 

public class OOPS
{
       public static void main(String args[])
       {
              Vehicle obj1 = new Car();
              obj1.print();

              Vehicle obj2 = new Vehicle();
              obj2.print();
       }
}

class Vehicle
{
       void print()
       {
              System.out.println("Base class (Vehicle)");
       }
}

class Car extends Vehicle
{
       void print()
       {
              System.out.println("Derived class (Car)");
       }
}

*/


/* OOPS | Runtime Polymorphism — Correct Method Access 

public class OOPS
{
       public static void main(String args[])
       {
              Vehicle obj1 = new Car();
              obj1.print();   // Calls Car's method at runtime
       }
}

class Vehicle
{
       void print()
       {
              System.out.println("Base class (Vehicle)");
       }
}

class Car extends Vehicle
{
       void print()
       {
              System.out.println("Derived class (Car)");
       }
}

*/




/* Static variables belong to the class, not to objects 

class Book
{
       int price;
       static int count

       Public Book(int Price)
       {
              this.price = price;
              count++;
       }
}

public class OOPS
{
       public static void main(String args[])
       {
              System.out.println(Book.count + " ");

              Book b1 = new Book(150);
              Book b2 = new Book(250);

              System.out.println(Book.count);
       }
}

*/


/* Static variable is shared among all objects. 

public class OOPS
{
       public static void main(String args[])
       {
              testMarks t = new testMarks();

              t.setMarks(45);

              System.out.println(testMarks.marks);
       }
}

class testMarks
{
       static int marks;
       
       void setMarks(int marks)
       {
              testMarks.marks = marks;
       }
}

*/



/* Static methods work on static data only. 

public class OOPS
{
       public static void main(String args[])
       {
              Test.changeB();
              System.out.println(Test.a*Test.b);
       }
}

class Test
{
       static int a = 10;
       static int b;

       static void changeB()
       {
              b = a * 3;
       }
}

*/


