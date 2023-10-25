package homework2;

//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and run the programme.
public class Que1 {
    String name = "Zarana"; // Instance variable
    String surname = "Soni"; // Instance variable
    public void m1(){ // Instance method
        // print the instance variables
        System.out.println(name);
        System.out.println(surname);

    }
    // Declare the main method
    public static void main(String[]args){
        Que1 q = new Que1(); // create an object for instance method
        q.m1();            // call the instance method into main method
    }
}
