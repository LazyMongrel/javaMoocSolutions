
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();

        System.out.println("Enter numbers:");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number==-1){
                break;
            }
            if(number%2==0){
                statistics2.addNumber(number);
            }else{
                statistics3.addNumber(number);
            }
            statistics.addNumber(number);
        }
        System.out.println("Sum:"+statistics.sum());
        System.out.println("Sum of even numbers:"+statistics2.sum());
        System.out.println("Sum of odd numbers:"+statistics3.sum());


        
    }
}
