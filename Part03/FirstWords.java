import java.util.Scanner;

public class FirstWords{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        while(true){
            String words = read.nextLine();
            if(words.equals("")){
                break;
            }
            String[] word = words.split(" ");
            System.out.println(word[0]);
        }
    }

}