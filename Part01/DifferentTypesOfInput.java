/*Give a string:
bye-bye
Give an integer:
11
Give a double:
4.2
Give a boolean:
true
You gave the string bye-bye
You gave the integer 11
You gave the double 4.2
You gave the boolean true */
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();

        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());


        System.out.println("You gave the string "+text);
        System.out.println("You gave the integer "+integer);
        System.out.println("You gave the double "+floatingPoint);
        System.out.println("You gave the boolean "+trueOrFalse);


    }
}
