package EX7;

public class Main {
    public static void main(String[] args) {

//        Train myTrain = new Train();
//        myTrain.addWagons("Wagon1");
//        myTrain.addWagons("Wagon2");
//        myTrain.removeWagons();
//        myTrain.removeWagons();
//        myTrain.removeWagons();

//        BookShelf books = new BookShelf();
//        books.addBook("Book1");
//        books.addBook("Book2");
//        books.takeBook();

//        HashTable userTable = new HashTable(50);
//        userTable.add("Krasimir", "krasi@gmail.com");
//        userTable.add("Georgi", "gogo@abv.bg");
//        System.out.println(userTable.get("user1"));
//        System.out.println(userTable.get("user2"));
//        System.out.println(userTable.get("user3"));

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new ShoppingCart.Item("Milk", 2.99));
        cart.addItem(new ShoppingCart.Item("Bread", 1.49));
        cart.addItem(new ShoppingCart.Item("Eggs", 3.29));
        System.out.println("Total: $" + String.format("%.2f", cart.getTotal()));
    }
}
