/*

## OOPS - Index

| Sr. No. | Program                                        | Time Complexity | Space Complexity |
| :-----: | ---------------------------------------------- | :-------------: | :--------------: |
|    1    | Object Creation & Method Invocation            |     **O(1)**    |     **O(1)**     |
|    2    | Encapsulation (Private Members)                |     **O(1)**    |     **O(1)**     |
|    3    | Getters & Setters                              |     **O(1)**    |     **O(1)**     |
|    4    | Default Constructor                            |     **O(1)**    |     **O(1)**     |
|    5    | Parameterized Constructor                      |     **O(1)**    |     **O(1)**     |
|    6    | Constructor Overloading                        |     **O(1)**    |     **O(1)**     |
|    7    | Shallow Copy Constructor                       |     **O(1)**    |     **O(1)**     |
|    8    | Deep Copy Constructor                          |     **O(N)**    |     **O(N)**     |
|    9    | Single Inheritance                             |     **O(1)**    |     **O(1)**     |
|    10   | Multilevel Inheritance                         |     **O(1)**    |     **O(1)**     |
|    11   | Hierarchical Inheritance                       |     **O(1)**    |     **O(1)**     |
|    12   | Hybrid Inheritance (Using Interface)           |     **O(1)**    |     **O(1)**     |
|    13   | Multiple Inheritance (Using Interfaces)        |     **O(1)**    |     **O(1)**     |
|    14   | Compile-Time Polymorphism (Method Overloading) |     **O(1)**    |     **O(1)**     |
|    15   | Run-Time Polymorphism (Method Overriding)      |     **O(1)**    |     **O(1)**     |
|    16   | Packages (Inbuilt & User Defined)              |     **O(1)**    |     **O(1)**     |
|    17   | Abstraction (Abstract Class)                   |     **O(1)**    |     **O(1)**     |
|    18   | Static Variables                               |     **O(1)**    |     **O(1)**     |
|    19   | `super` Keyword                                |     **O(1)**    |     **O(1)**     |
|    20   | Runtime Polymorphism (Vehicle–Car Example)     |     **O(1)**    |     **O(1)**     |
|    21   | Static Variable Example (Book Count)           |     **O(1)**    |     **O(1)**     |
|    22   | Static Variable Example (Marks)                |     **O(1)**    |     **O(1)**     |
|    23   | Static Methods                                 |     **O(1)**    |     **O(1)**     |

---

## Complexity Summary

| Complexity     | Programs                                                                                                                                                                                                                                                                                                                                                                                                               |
| -------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **O(1)**       | Object Creation, Encapsulation, Getters & Setters, Constructors, Constructor Overloading, Shallow Copy Constructor, Single Inheritance, Multilevel Inheritance, Hierarchical Inheritance, Hybrid Inheritance, Multiple Inheritance, Compile-Time Polymorphism, Run-Time Polymorphism, Packages, Abstraction, Static Variables, `super` Keyword, Runtime Polymorphism Example, Static Variable Examples, Static Methods |
| **O(N)**       | Deep Copy Constructor (copies array elements)                                                                                                                                                                                                                                                                                                                                                                          |
| **O(1) Space** | All programs except Deep Copy Constructor                                                                                                                                                                                                                                                                                                                                                                              |
| **O(N) Space** | Deep Copy Constructor (creates a new array and copies all elements)                                                                                                                                                                                                                                                                                                                                                    |


// ------------------------------------------------------------
// OOPS | Object Creation & Method Invocation
//
// TC: O(1)
// Reason: Object creation and method calls take constant time.
//
// SC: O(1)
// Reason: Uses only one object and primitive variables.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Pen p1 = new Pen();

              p1.setColor("Blue");
              System.out.println(p1.color);

              p1.setTip(5);
              System.out.println(p1.tip);

              p1.setColor("Yellow");
              System.out.println(p1.color);
       }
}

class Pen {

       String color;
       int tip;

       void setColor(String newColor) {
              color = newColor;
       }

       void setTip(int newTip) {
              tip = newTip;
       }
}

class Student {

       String name;
       int age;
       float percentage;

       void calcPercentage(int p, int c, int m) {

              percentage = (p + c + m) / 3.0f;
       }
}


// ------------------------------------------------------------
// OOPS | Encapsulation (Private Members)
//
// TC: O(1)
// Reason: Setting values through methods takes constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              BankAccount myAcc = new BankAccount();

              myAcc.username = "shraddha_khapra";

              myAcc.setPassword("abcde");
       }
}

class BankAccount {

       public String username;

       private String password;

       public void setPassword(String pwd) {
              password = pwd;
       }
}


// ------------------------------------------------------------
// OOPS | Getters & Setters
//
// TC: O(1)
// Reason: Getter and setter methods execute in constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Pen p1 = new Pen();

              p1.setColor("Blue");

              System.out.println(p1.getColor());
       }
}

class Pen {

       private String color;

       String getColor() {
              return this.color;
       }

       void setColor(String newColor) {
              this.color = newColor;
       }
}


// ------------------------------------------------------------
// OOPS | Default Constructor
//
// TC: O(1)
// Reason: Constructor executes once during object creation.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Student s1 = new Student();
       }
}

class Student {

       String name;
       int roll;

       Student() {
              System.out.println("This is constructor");
       }
}


// ------------------------------------------------------------
// OOPS | Parameterized Constructor
//
// TC: O(1)
// Reason: Initializes object using constructor parameters.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Student s1 = new Student("Shraddha");

              System.out.println(s1.name);
       }
}

class Student {

       String name;
       int roll;

       Student(String name) {
              this.name = name;
       }
}


// ------------------------------------------------------------
// OOPS | Constructor Overloading
//
// TC: O(1)
// Reason: Constructor selection is done at compile time.
//
// SC: O(1)
// Reason: Uses only object variables.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Student s1 = new Student();

              Student s2 = new Student("Ansh");

              Student s3 = new Student(84);
       }
}

class Student {

       String name;
       int roll;

       Student() {
              System.out.println("Constructor called...");
       }

       Student(String name) {
              this.name = name;
       }

       Student(int roll) {
              this.roll = roll;
       }
}


// ------------------------------------------------------------
// OOPS | Shallow Copy Constructor
//
// TC: O(1)
// Reason: Copies only reference and primitive variables.
//
// SC: O(1)
// Reason: No new array or collection is created.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Student s1 = new Student();

              s1.name = "Ansh";
              s1.roll = 34;
              s1.password = "abcd1234";

              Student s2 = new Student(s1);

              s2.password = "xyz123";
       }
}

class Student {

       String name;
       int roll;
       String password;

       Student() {
       }

       Student(Student s1) {

              this.name = s1.name;
              this.roll = s1.roll;
              this.password = s1.password;
       }
}


// ------------------------------------------------------------
// OOPS | Deep Copy Constructor
//
// TC: O(N)
// Reason: Copies every element of the marks array.
//
// SC: O(N)
// Reason: Creates a new array for copying.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Student s1 = new Student();

              s1.name = "Ansh";
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

       Student() {
              marks = new int[3];
       }

       Student(Student s1) {

              marks = new int[3];

              this.name = s1.name;
              this.roll = s1.roll;
              this.password = s1.password;

              for(int i = 0; i < marks.length; i++) {
                     this.marks[i] = s1.marks[i];
              }
       }
}


// ------------------------------------------------------------
// OOPS | Single Inheritance
//
// TC: O(1)
// Reason: Method calls and object creation take constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Fish shark = new Fish();

              shark.eat();
              shark.sleep();
              shark.swim();
       }
}

class Animal {

       String color;

       void eat() {
              System.out.println("Eats");
       }

       void sleep() {
              System.out.println("Sleeps");
       }
}

class Fish extends Animal {

       int fins;

       void swim() {
              System.out.println("Swims in water");
       }
}


// ------------------------------------------------------------
// OOPS | Multilevel Inheritance
//
// TC: O(1)
// Reason: Method calls and member access take constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Dog dobby = new Dog();

              dobby.eat();

              dobby.legs = 4;

              System.out.println(dobby.legs);
       }
}

class Animal {

       void eat() {
              System.out.println("Eats");
       }
}

class Mammal extends Animal {

       int legs;
}

class Dog extends Mammal {

       String breed;
}


// ------------------------------------------------------------
// OOPS | Hierarchical Inheritance
//
// TC: O(1)
// Reason: Method calls execute in constant time.
//
// SC: O(1)
// Reason: Uses only object references.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Dog dog = new Dog();
              dog.eat();
              dog.bark();

              Cat cat = new Cat();
              cat.eat();
              cat.meow();
       }
}

class Animal {

       void eat() {
              System.out.println("Eats");
       }
}

class Dog extends Animal {

       void bark() {
              System.out.println("Barks");
       }
}

class Cat extends Animal {

       void meow() {
              System.out.println("Meows");
       }
}


// ------------------------------------------------------------
// OOPS | Hybrid Inheritance (Using Interface)
//
// TC: O(1)
// Reason: Interface method calls execute in constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Child c = new Child();

              c.eat();
              c.walk();
              c.fly();
       }
}

class Animal {

       void eat() {
              System.out.println("Eats");
       }
}

class Mammal extends Animal {

       void walk() {
              System.out.println("Walks");
       }
}

interface Bird {

       void fly();
}

class Child extends Mammal implements Bird {

       public void fly() {
              System.out.println("Flies");
       }
}


// ------------------------------------------------------------
// OOPS | Multiple Inheritance (Using Interfaces)
//
// TC: O(1)
// Reason: Interface method invocation is constant time.
//
// SC: O(1)
// Reason: Uses only object references.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Queen q = new Queen();

              q.move();
       }
}

interface Herbivore {
}

interface Carnivore {
}

class Bear implements Herbivore, Carnivore {
}

interface ChessPlayer {

       void move();
}

class Queen implements ChessPlayer {

       public void move() {
              System.out.println("Left, Right, Up, Down, Diagonal");
       }
}

class Rook implements ChessPlayer {

       public void move() {
              System.out.println("Up, Down, Left, Right");
       }
}


// ------------------------------------------------------------
// OOPS | Compile-Time Polymorphism (Method Overloading)
//
// TC: O(1)
// Reason: Method selection is resolved at compile time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Calculator calc = new Calculator();

              System.out.println(calc.sum(1, 2));
              System.out.println(calc.sum(1.5f, 2.5f));
              System.out.println(calc.sum(1, 2, 3));
       }
}

class Calculator {

       int sum(int a, int b) {
              return a + b;
       }

       float sum(float a, float b) {
              return a + b;
       }

       int sum(int a, int b, int c) {
              return a + b + c;
       }
}


// ------------------------------------------------------------
// OOPS | Run-Time Polymorphism (Method Overriding)
//
// TC: O(1)
// Reason: Overridden method invocation takes constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Deer d = new Deer();

              d.eat();
       }
}

class Animal {

       void eat() {
              System.out.println("Eats anything");
       }
}

class Deer extends Animal {

       @Override
       void eat() {
              System.out.println("Eats grass");
       }
}



// ------------------------------------------------------------
// OOPS | Packages (Inbuilt & User Defined)
//
// TC: O(1)
// Reason: Importing and creating Scanner object takes constant time.
//
// SC: O(1)
// Reason: Uses only one Scanner object.
// ------------------------------------------------------------

package myPackage;

import java.util.*;

public class OOPS {

       public static void main(String args[]) {

              Scanner sc = new Scanner(System.in);

              int a = sc.nextInt();

              System.out.println(a);

              sc.close();
       }
}


// ------------------------------------------------------------
// OOPS | Abstraction (Abstract Class)
//
// TC: O(1)
// Reason: Method calls execute in constant time.
//
// SC: O(1)
// Reason: Uses only object references.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Cheetah c = new Cheetah();
              c.eat();
              c.walk();

              Chicken ch = new Chicken();
              ch.eat();
              ch.walk();
       }
}

abstract class Animal {

       void eat() {
              System.out.println("Animal Eats");
       }

       abstract void walk();
}

class Cheetah extends Animal {

       void walk() {
              System.out.println("Walks on 4 legs");
       }
}

class Chicken extends Animal {

       void walk() {
              System.out.println("Walks on 2 legs");
       }
}


// ------------------------------------------------------------
// OOPS | Multiple Inheritance Using Interfaces
//
// TC: O(1)
// Reason: Interface method invocation takes constant time.
//
// SC: O(1)
// Reason: Uses only object references.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Queen q = new Queen();

              q.move();
       }
}

interface Herbivore {
}

interface Carnivore {
}

class Bear implements Herbivore, Carnivore {
}

interface ChessPlayer {

       void move();
}

class Queen implements ChessPlayer {

       public void move() {
              System.out.println("Left, Right, Up, Down, Diagonal");
       }
}

class Rook implements ChessPlayer {

       public void move() {
              System.out.println("Up, Down, Left, Right");
       }
}


// ------------------------------------------------------------
// OOPS | Static Variables
//
// TC: O(1)
// Reason: Accessing static variables is constant time.
//
// SC: O(1)
// Reason: Uses only object references.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Student s1 = new Student();
              s1.schoolName = "JMV";

              Student s2 = new Student();

              Student s3 = new Student();
              s3.schoolName = "ABC";

              System.out.println(s2.schoolName);
       }
}

class Student {

       String name;
       int roll;

       static String schoolName;

       void setName(String name) {
              this.name = name;
       }

       String getName() {
              return this.name;
       }
}


// ------------------------------------------------------------
// OOPS | super Keyword
//
// TC: O(1)
// Reason: Parent constructor and variable access are constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Horse h = new Horse();

              System.out.println(h.color);
       }
}

class Animal {

       String color;

       Animal() {
              System.out.println("Animal Constructor Called");
       }
}

class Horse extends Animal {

       Horse() {

              super.color = "Brown";

              System.out.println("Horse Constructor Called");
       }
}


// ------------------------------------------------------------
// OOPS | Runtime Polymorphism (Vehicle - Car)
//
// TC: O(1)
// Reason: Dynamic method dispatch takes constant time.
//
// SC: O(1)
// Reason: Uses only one object reference.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Vehicle obj1 = new Car();
              obj1.print();

              Vehicle obj2 = new Vehicle();
              obj2.print();
       }
}

class Vehicle {

       void print() {
              System.out.println("Base Class (Vehicle)");
       }
}

class Car extends Vehicle {

       @Override
       void print() {
              System.out.println("Derived Class (Car)");
       }
}


// ------------------------------------------------------------
// OOPS | Static Variable Example (Book Count)
//
// TC: O(1)
// Reason: Object creation and static variable update are constant time.
//
// SC: O(1)
// Reason: Uses only object references.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              System.out.println(Book.count);

              Book b1 = new Book(150);
              Book b2 = new Book(250);

              System.out.println(Book.count);
       }
}

class Book {

       int price;
       static int count = 0;

       Book(int price) {

              this.price = price;
              count++;
       }
}


// ------------------------------------------------------------
// OOPS | Static Variable Example (Marks)
//
// TC: O(1)
// Reason: Static variable assignment takes constant time.
//
// SC: O(1)
// Reason: Uses only one object.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              TestMarks t = new TestMarks();

              t.setMarks(45);

              System.out.println(TestMarks.marks);
       }
}

class TestMarks {

       static int marks;

       void setMarks(int marks) {
              TestMarks.marks = marks;
       }
}


// ------------------------------------------------------------
// OOPS | Static Methods
//
// TC: O(1)
// Reason: Static method execution performs constant-time operations.
//
// SC: O(1)
// Reason: Uses only static variables.
// ------------------------------------------------------------

public class OOPS {

       public static void main(String args[]) {

              Test.changeB();

              System.out.println(Test.a * Test.b);
       }
}

class Test {

       static int a = 10;
       static int b;

       static void changeB() {

              b = a * 3;
       }
}




 */