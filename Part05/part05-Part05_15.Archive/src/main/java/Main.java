
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Archive> arch = new ArrayList<>();

        while(true){

            System.out.println("Identifier? (empty will stop)");
            String identifier = scan.nextLine();
            if(identifier.isEmpty()){
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            Archive check = new Archive(identifier,name);
            if(!(arch.contains(check))){
                arch.add(check);
            }
        }
        System.out.println("==Items==");
        for(Archive each : arch){
            System.out.println(each);
        }
    }
}
