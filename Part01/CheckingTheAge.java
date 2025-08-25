/*How old are you? 10
OK

Sample output
How old are you? 55
OK

Sample output
How old are you? -3
Impossible!

Sample output
How old are you? 150
Impossible! */
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        if(age<0 || age>120){
            System.out.println("Impossible!");
        }else{
            System.out.println("OK");
        }
    }
}
