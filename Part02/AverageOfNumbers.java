
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            sum = num+sum;
            if(num==0){
                break;
            }
            count+=1;
        }
        double avg = (double)sum/count;
        System.out.println("Average of the numbers: "+ avg);
        scanner.close();

    }
}