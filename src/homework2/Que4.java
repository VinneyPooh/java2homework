package homework2;
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
public class Que4 {
    int a=5; // declare instance variable
    int b=6; //declare instance variable
    static int c=7; //declare static variable
    static int d= 8; //declare static variable
    // Declare instance method
    public void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    // Declare static variable
    public static void m2(){
        System.out.println(c);
        System.out.println(d);
        Que4 q = new Que4();
        System.out.println(q.a);
        System.out.println(q.b);
    }
    // declare main method
    public static void main(String [] args){
        m2();// call the static method
        Que4 q = new Que4(); // create an object
        q.m1();// call the instance method
    }



}
