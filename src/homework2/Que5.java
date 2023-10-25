package homework2;

/* Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.) */
public class Que5 {
    public static void main(String [] args){
        Sum(12,11);
        Sub(25,10);
        Que5 q=new Que5();
        q.Division(25, 5);
        q.Multiplication(2,5);

    }
// static methods with parameters
    public static void Sum(int x ,int y){

        System.out.println("x+y = " + (x+y));// concatenation
    }
    public static void Sub (int x ,int y){
        System.out.println("x-y = " +(x-y));
    }
    // Instance method with parameters
    public void Multiplication(int x ,int y){
        System.out.println("x*y = "+(x*y));
    }
    public void Division(int x ,int y){
        System.out.println("x/y = "+ (x/y));
    }
}
