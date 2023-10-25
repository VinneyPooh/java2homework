package homework2;
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.
public class Que3 {
    static String distance = "20KM";// static variable
    String vehicle = "Bicycle";// Instance variable
    public static void m1(){ // Declared static method
        System.out.println(distance); // Call and print static variable
        Que3 q = new Que3();
        System.out.println(q.vehicle);
    }
    public void m2() {
        System.out.println(vehicle); // Call and print Instance variable
        System.out.println(distance); // call and print static variable
    }
    // main method
    public static void main (String [] args){
        m1();// call the static method
        Que3 q = new Que3(); // create an object
        q.m2();// call the instance method

    }
}
