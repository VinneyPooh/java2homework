package homework2;

/* Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r). */
public class Que6 {
    public static void main(String [] args){
        Que6 q = new Que6();
        q.Area(3.14f,2);
        q.Area(3.14f, 2.5f);

    }
    // Instance method with parameters
    public void Area(float PI , float r){
        System.out.println("Area of circle PI*r*r = "+ (PI*r*r));


    }
}
