
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter username:");
        String name = sc.nextLine();

        System.out.print("Enter password:");
        String passWord = sc.nextLine();

        if((name.equals("alex") && passWord.equals("sunshine")) || name.equals("emma") && passWord.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
