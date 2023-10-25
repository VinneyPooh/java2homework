package homework2;

/* Write a Java program to print the area and perimeter of a rectangle.
Test Data:

Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */
public class Que13 {
    public static void main(String[] args) {
        area(5.6f, (float) 8.5f);
    }

    // static method with parameter
    public static void area(float w , float h){
        System.out.println("Area of rectangle = " + (w*h));
        System.out.println("Perimeter = "+ (2*(w+h)));
    }


}
