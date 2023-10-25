package homework2;

//Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output:
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5
public class Que14 {
    public static void main(String[] args) {
        Que14 q = new Que14();
        q.calculation(125,24);

    }
    //instance method with parameter
    public void calculation (int a , int b){
        System.out.println("Expected output");
        System.out.println("sum of a+b = " + (a+b));
        System.out.println("sub of a-b = " + (a-b));
        System.out.println("multiplication of a*b = " + (a*b));
        System.out.println("division of a/b = " + (a/b));
        System.out.println("modulation of |a/b| = " + (a/b));
    }
}
