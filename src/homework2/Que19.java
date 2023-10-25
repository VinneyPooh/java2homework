package homework2;

/*19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
public class Que19 {
    // Global declaration part
    String name1 = "Ayan"; // instance variable
    static String name2 = "Pankti"; // static variable
    //instance method by group name & call both global variable
    public void code2(){
        String name3 = "Miten"; // local variable
        System.out.println(name3); // print the variable
        System.out.println(name1);
        System.out.println(name2);
    }
    //static method name agile() and call both variable
    public static void agile(){
         String name4 = "Sonal";//local variable
        System.out.println(name4);// print the variable
        System.out.println(name2);
        Que19 q = new Que19();
        System.out.println(q.name1);
    }

    //main method and call both method
    public static void main(String[] args) {

        agile();
        Que19 q = new Que19();
        q.code2();
    }
}
