package strings;
//Write a java program which replace a “I love java” to “we love java”
//Expected output: We love java

public class Que3
{
    public static void main(String[] args) {
        String a = "I love java";
        System.out.println(a);
        String amend = a.replace("I" ,"We");
        System.out.println(amend);
    }
}
