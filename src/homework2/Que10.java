package homework2;

/* Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8 */
public class Que10 {
    public static void main(String [] args){
        table(8);
        Que10 q = new Que10();
        q.table2(8);

    }
    // static method
    public static void table(int n){
        System.out.println("Test data: Input a number : 8");
        System.out.println(n + "x1 = " + (n*1));
        System.out.println(n + "x2 = " + (n*2));
        System.out.println(n + "x3 = " + (n*3));
        System.out.println(n + "x4 = " + (n*4));
        System.out.println(n + "x5 = " + (n*5));
        System.out.println(n + "x6 = " + (n*6));
        System.out.println(n + "x7 = " + (n*7));
        System.out.println(n + "x8 = " + (n*8));
        System.out.println(n + "x9 = " + (n*9));
        System.out.println(n + "x10 = " + (n*10));
    }
    // instance method using for loop
    public void table2(int n){
        System.out.println("Test data: Input a number : 8");
        for(int i=1; i<=10; i++){
            System.out.println(n +"x"+i + "=" +(n*i) );
        }
    }

}
