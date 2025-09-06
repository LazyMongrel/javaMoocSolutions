
import java.util.ArrayList;
import java.util.Scanner;

// sebastian,2017
// lucas,2017
// lily,2017
// hanna,2014
// gabriel,2009
// Longest name: sebastian
// Average of the birth years: 2014.8
public class PersonalDetails {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest=0;
        int sum =0;
        int count=0;
        String longest="";
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }

            String[] parts = text.split(",");
            if(greatest<parts[0].length()){
                greatest=parts[0].length();
                longest=parts[0];
            }

            sum = sum + Integer.valueOf(parts[1]);
            count=count+1;


        }
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years: "+ 1.0*sum/count);


    }
}
