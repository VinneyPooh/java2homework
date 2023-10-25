package strings;
//Write a Java program print your full name on screen and then print your surname on a separate line.

public class Que1 {


     public static void main (String [] args){
         String name = "Zarana Soni";
         System.out.println(name);
         System.out.println(name.substring(7,11)); //print the surname in new line
         System.out.println(name.substring(0,6));

     }

}
