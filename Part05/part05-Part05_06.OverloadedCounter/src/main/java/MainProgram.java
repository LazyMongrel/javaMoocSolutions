
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c1 = new Counter(50);
        System.out.println(c1.value());
        c1.decrease(0);
        System.out.println("dec 0");
        System.out.println(c1.value());
        c1.decrease(11);
        System.out.println(c1.value());


        
    }
}
