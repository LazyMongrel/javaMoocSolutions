import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        // Title: To Kill a Mockingbird
        // Pages: 281
        // Publication year: 1960
        Scanner scanner=new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        while(true){
            System.out.print("Title:");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.print("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());

            book.add(new Book(title,pages,year));
        }

        System.out.print("What information will be printed?");
        String info = scanner.nextLine();

        for(Book buk:book){
            if(info.equals("everything")){
                System.out.println(buk);
            }
            if(info.equals("name")){
                System.out.println(buk.getTitle());
            }
        }
    }
}
