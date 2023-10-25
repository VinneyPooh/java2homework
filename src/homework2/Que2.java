package homework2;
//2.1 Declare two static variables.
//2.2 Declare one static method.
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and run the programme.
public class Que2 {
    static String color = "Red";// static variable
    static String animal= "Cow";// static variable
    public static void m1(){ // static method
        // call static variable into the static method
        System.out.println(color);
        System.out.println(animal);
    }
    // Declare the main method
    public static void main(String [] args){
        m1(); // call the static method into main method
    }
}
