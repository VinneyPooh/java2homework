package homework2;
/* Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C). */

public class Que7 {
    public static void main(String [] args){
        temp(30.56f);
    }
    // Declare the static method
    public static void temp(float f){
        System.out.println(" temp in celcius =  " + ((f-32) * 5/9) );
    }
}
