import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Customer> customers=new ArrayList<>();

        // Tilføj kunder (enten med variabler eller direkte i listen)
        customers.add(new Customer("Anja", "Hansen", "Anjah"));
        customers.add(new Customer("Maria", "Jensen", "mariaj"));
        customers.add(new Customer("Jonas", "Nielsen", "jonasn"));

        // Kald printCustomers-metoden
        printCustomers(customers);

    }
    // Statisk metode til at printe kunder
    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println("ID: " + c.getId() +
                    ", Name: " + c.getFirstName() + " " + c.getLastName() +
                    ", Username: " + c.getUsername());
        }
    }

}
