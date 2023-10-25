package homework2;

//17.1 Declare your city as instance variables.
// 17.2 Declare your country as static variables.
// 17.3 Declare one instance method and call static variable in print statement
// 17.4 Declare static method and call instance variable in print Statement.
// 17.5 Call both user defined methods into main method.
public class Que17 {
    String cityname = "London";// instance variable
    static String countryname = "UK";// static variable
    // instance method & call static variable
    public void m1(){
        System.out.println(countryname);
    }
    // static method & call instance variable
    public static void m2(){
        Que17 q = new Que17();
        System.out.println(q.cityname);

    }
    // main method and call both method
    public static void main(String[] args) {
        m2();
        Que17 q = new Que17();
        q.m1();
    }
}
