
import java.util.ArrayList;
import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // Try your method here
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println(sum(list));
    }
    public static int sum(ArrayList<Integer> num){
        int summation = 0;
        for(int numbers:num){
            summation= summation + numbers;
        }
        return summation;
    }
}
