
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1=Integer.valueOf(sc.nextLine());

        System.out.println("Give the second number:");
        int num2=Integer.valueOf(sc.nextLine());

        System.out.println("Give the third number:");
        int num3=Integer.valueOf(sc.nextLine());

       
        double num4= 1.0*(num3+num1+num2)/3;
        System.out.println("The average is "+num4);


    }
}
