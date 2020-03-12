package genericity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author 10745
 * @date 2020/2/22 10:30
 **/
public class Customer {

    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next() {
                return new Customer();
            }
        };
    }

}

class Teller {
    private static long counter = 1;
    private final long id = counter++;

    private Teller() {

    }

    @Override
    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator() {
        return new Generator<Teller>() {
            public Teller next() {
                return new Teller();
            }
        };
    }


}

class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> customers = new LinkedList<Customer>();
        Generators.fill(customers, Customer.generator(), 15);

        ArrayList<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator(), 4);
        for (Customer customer : customers) {
            serve(tellers.get(random.nextInt(tellers.size())), customer);
        }
    }
}
