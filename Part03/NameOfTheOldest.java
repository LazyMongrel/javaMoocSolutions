
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        String name = "";
        while(true){
            String line = scanner.nextLine();

            if(line.equals("")){
                break;
            }

            String[] parts = line.split(",");

            int temp = Integer.valueOf(parts[1]);
            if(temp>greatest){
                greatest = temp;
                name = parts[0];

            }
        }
        System.out.println("Name of the oldest: "+name);
        


    }
}
