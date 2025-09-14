public class MainProgram {

    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // Initial meals
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul tops up, Matt eats heartily
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul eats twice, Matt tops up
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
