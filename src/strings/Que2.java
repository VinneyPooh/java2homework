package strings;
//Write a java program which remove extra space from both side “ I love java ”
//Expected output: “I love java”

public class Que2 {
    public static void main(String[] args) {
        String name = " I love java ";
        System.out.println("input:" + name);
        System.out.println("Expected output:" + name.trim());
    }
}
