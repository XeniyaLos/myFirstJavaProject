package groceryStore;

public class Shopping {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();
        /*buyer.fullName = "James Bond";
        buyer.address = "123 Main St";
        buyer.isResident = true;
        buyer.age = 43;*/

        buyer.enterInfo("James", "123 Main St", 31, true);
        buyer.updateResidency(false);
        buyer.display();

        String word = buyer.search();
        System.out.println("Searching for " + word);

        buyer.addToCart("Milk");

        buyer.updateProfile("Xeniya", "134 Main St", 25, false);
        buyer.display();
    }
}
