package homework2;

//18.1 Declare your council name as static variables.
//18.2 Declare your house number as instance variables.
//18.3 Declare one instance method name borough() and call Static variable
//18.4 Declare static method name address() and call instance variable
//18.5 Call both user defined methods into main method.
public class Que18 {
    static String councilname = "Harrow Council";//static variable
    int housenumber = 51;// instance variable
    // instance method borough & call static variable
    public void borough(){
        System.out.println(councilname);

    }
    // static method address & call instance variable
    public static void address(){
        Que18 q = new Que18();
        System.out.println(q.housenumber);
    }
    // main method and call both method
    public static void main(String[] args) {
        address();
        Que18 q = new Que18();
        q.borough();
    }

}
