public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("blue");
        // p1.setTip(5);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        // p1.setColor("yellow");
        // System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.userName = "Kuldeepsinh Jhala";
        // myAcc.setPassword("abcdef");

        // Student s1 = new Student();
        // Student s2 = new Student("Kuldeep");
        // Student s3 = new Student(99);
        // System.out.println(s2.name);

        // Student c1 = new Student();
        // c1.name = "kuldeep";
        // c1.rollNo = 99;
        // c1.marks[0] = 100;
        // c1.marks[1] = 90;
        // c1.marks[2] = 99;
        // Student c2 = new Student(c1);
        // c2.password = "xyz";

        // for (int i = 0; i < 3; i++) {
        // System.out.println(c2.marks[i]);
        // }

        // c1.marks[1] = 50;
        // System.out.println(c2.marks[1]);

        // Fish shark = new Fish();
        // shark.eat();
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum(1.5f, 2.5f));
        // System.out.println(calc.sum(1, 2, 3));

        // Deer d1 = new Deer();
        // d1.eat();

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);
        // c.changeColor();
        // System.out.println(c.color);

        // Queen q = new Queen();
        // q.moves();
        // Bear b = new Bear();
        // b.eatGrass();
        // b.eatMeat();

        // StudentStatic s1 = new StudentStatic();
        // s1.setSchool("BHS");
        // System.out.println(s1.getSchool());
        // StudentStatic s2 = new StudentStatic();
        // System.out.println(s2.getSchool());
        // StudentStatic s3 = new StudentStatic();
        // s3.setSchool("Alkapuri");
        // System.out.println(s1.getSchool());
        // System.out.println(s2.getSchool());
        // System.out.println(s3.getSchool());
        // System.out.println(s1.returnPercentage(90, 89, 70));
        // System.out.println(s2.returnPercentage(90, 90, 79));
        // System.out.println(s3.returnPercentage(90, 99, 87));

        HorseSuper hs = new HorseSuper();
    }
}

class AnimalSuper {
    String color;

    AnimalSuper() {
        System.out.println("animal constructor is called");
    }
}

class HorseSuper extends AnimalSuper {
    HorseSuper() {
        super();
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}

class StudentStatic {
    int name;
    int rollNo;
    static String school;

    void setSchool(String school) {
        this.school = school;
    }

    String getSchool() {
        return school;
    }

    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }
}

interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {

    public void eatGrass() {
        System.out.println("Bear eats Grass");
    }

    public void eatMeat() {
        System.out.println("Bear eats Meat");
    }

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (by one step)");
    }
}

abstract class AnimalAbstract {

    String color;

    AnimalAbstract() {
        System.out.println("AnimalAbstract constructor called.");
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends AnimalAbstract {

    Horse() {
        System.out.println("Horse constructor called.");
    }

    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends AnimalAbstract {

    Chicken() {
        System.out.println("Chicken constructor called.");
    }

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Walks on two legs");
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // default constructor
    Student() {
        marks = new int[3];
        System.out.println("Non-parameterized");
    }

    // parameterized constructor
    Student(String name) {
        marks = new int[3];
        System.out.println("String Parameterized");
        this.name = name;
    }

    // parameterized constructor
    Student(int rollNo) {
        marks = new int[3];
        System.out.println("int Parameterized");
        this.rollNo = rollNo;
    }

    // copy constructor (shallow-copy)
    // Student(Student c) {
    // this.name = c.name;
    // this.rollNo = c.rollNo;
    // this.marks = c.marks;
    // }

    // copy constructor (Deep-copy)
    Student(Student c) {
        marks = new int[3];
        this.name = c.name;
        this.rollNo = c.rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = c.marks[i];
        }
    }

}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Child {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;

    void walks() {
        System.out.println("Walks");
    }
}

class Dog extends Mammal {
    String breed;
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Animal {
    void flys() {
        System.out.println("Flys");
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

class Animals {
    void eat() {
        System.out.println("eats animal");
    }
}

class Deer extends Animals {
    void eat() {
        System.out.println("eats grass");
    }
}