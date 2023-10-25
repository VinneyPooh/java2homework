package homework2;

//20.1 Declare your Spain as static variable.
//20.2 Declare your United Kingdom as instance variable.
//20.3 Declare instance method name homeCountry()and call static variable.
//20.4 Declare static method name holidays() and call instance variable
//20.5 Call both methods in main method.
public class Que20 {
    static String country1 = "Spain";// static variable
    String country2 = "United Kingdom";// instance variable

    // instance method homecountry and call static variable
    public void homecountry(){
        System.out.println(country1);
    }

    // static method holiday and call instance variable
    public static void holiday() {
        Que20 q = new Que20();
        System.out.println(q.country2);
    }

    public static void main(String[] args) {
        holiday();
        Que20 q = new Que20();
        q.homecountry();
    }
}
