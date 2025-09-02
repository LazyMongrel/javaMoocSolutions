
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum = 0;
        while(true){
            
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num==0){
                break;
            }
            if (num<0){
                continue;
            }
            sum = num+sum;
            count+=1;
        }
        double avg = (double)sum/count;
        if(avg>0){
            System.out.println(avg);
            scanner.close();
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
