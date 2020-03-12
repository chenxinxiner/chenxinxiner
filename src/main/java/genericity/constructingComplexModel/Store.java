package genericity.constructingComplexModel;

import genericity.Generator;
import genericity.Generators;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 10745
 * @date 2020/2/22 11:01
 **/
public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStand> checkoutStands = new ArrayList<CheckoutStand>();
    private Office office = new Office();

    public Store(int nAisles, int nShelves, int nProductions) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nAisles));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle aisle : this) {
            for (Shelf s : aisle) {
                for (Product p : s) {
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // System.out.println( new Store(14,5,10));
        final Class<? extends ArrayList> aClass = new ArrayList<Integer>().getClass();
        final Class<? extends ArrayList> aClass1 = new ArrayList<String>().getClass();
        System.out.println(aClass.equals(aClass1));
    }

}

class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + " : " + description + ", price: $" + price;
    }

    public void changePrice(double change) {
        this.price = change;
    }

    public static Generator<Product> generator = new Generator<Product>() {
        final Random random = new Random(47);

        public Product next() {
            return new Product(random.nextInt(1000), "Test", Math.round(random.nextDouble() * 1000.0) + 0.99);
        }
    };
}

class Shelf extends ArrayList<Product> {
    public Shelf(int nProduction) {
        Generators.fill(this, Product.generator, nProduction);
    }
}

class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(nProducts));
        }
    }
}

class CheckoutStand {
}

class Office {
}
