package EX7;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static class Item {
        private String name;
        private double prize;

        Item(String name, double prize) {
            this.name = name;
            this.prize = prize;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrize() {
            return prize;
        }

        public void setPrize(double prize) {
            this.prize = prize;
        }
    }

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " has been added!");
    }

    public double getTotal() {
        double total = 0;

        if (items.isEmpty()) {
            System.out.println("There aren't any items in the shopping cart!");
            return 0;
        }

        for (Item item : items) {
            total += item.getPrize();
        }
        return total;
    }
}