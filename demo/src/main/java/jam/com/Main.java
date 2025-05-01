package jam.com;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wassup welcome to my basic addition app brotha, enter first number to be added");
        int num1 = scan.nextInt();
        System.out.println("add ur second num brodie");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("your sum is " + sum + " dudetee");
        scan.close();
    }
}