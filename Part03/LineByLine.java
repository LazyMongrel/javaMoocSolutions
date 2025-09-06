import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()) {
            String text = sc.nextLine();
            String[] words = text.split(" ");
            for(String word : words) {
                System.out.println(word);
            }
        }
    }
}