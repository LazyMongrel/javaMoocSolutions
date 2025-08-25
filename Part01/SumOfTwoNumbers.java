
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int num1=Integer.valueOf(sc.nextLine());

        System.out.println("Give the second number:");
        int num2=Integer.valueOf(sc.nextLine());

        int num3= num1+num2;
        System.out.println("The sum of the numbers is "+num3);
        /*System.out.println("Give the first number:");
int first = Integer.valueOf(scanner.nextLine());
System.out.println("Give the second number:");
int second = Integer.valueOf(scanner.nextLine());
 */

    }
}
