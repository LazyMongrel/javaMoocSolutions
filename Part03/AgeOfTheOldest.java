import java.util.Scanner;

public class AgeOfTheOldest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        
        while(true) {
            String text = scanner.nextLine();
            if(text.equals("")) {
                break;
            }
            
            String[] parts = text.split(",");
            // parts[0] = name, parts[1] = age
            int age = Integer.valueOf(parts[1]);
            
            if(age > greatest) {
                greatest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + greatest);
    }
}