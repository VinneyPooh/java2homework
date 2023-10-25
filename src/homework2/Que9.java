package homework2;

/* Write a program to convert the upper case to lower case */
public class Que9 {
    public static void main(String [] args){
     Que9 q = new Que9();
     q.m1();

    }
    // instance method
    public void m1 (){
        String name = "ZARANASONI";
        System.out.println(name);
        String ZARANASONINameTolowercase=name.toLowerCase(); // change it to lowercase
        System.out.println(ZARANASONINameTolowercase);
    }
}
