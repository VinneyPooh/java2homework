package strings;
// Write a java program which replace a “I@love@java” to “we love java”
//Expected output: We love java
public class Que6 {
    String a = "I@love@java";

    public static void main(String[] args) {
        Que6 q = new Que6();
        System.out.println(q.a);
        String a = q.a.replace("I@love@java", "we love java");
        System.out.println("Expected data : " + a);
    }
}
