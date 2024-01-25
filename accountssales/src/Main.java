import static com.zeni.accountssale.datageneration.GenerateCustomer.generateCustomers;
import static com.zeni.accountssale.presistance.JsonDataManager.createJsonFile;
import static java.lang.System.out;

import com.zeni.accountssale.presistance.entity.impl.Customer;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    
    public static void main(String[] args) {
        Set<Customer> customers = generateCustomers(10);
        
        for (Customer customer : customers) {
            out.println(customer);
        }
        
        createJsonFile("Customer", customers);
//        deleteFromJsonFileByIndex("Customer.json", 2);
//        Set<Customer> customers1 = readFromFile("Customer.json", Customer.class);
//
//        if (customers1 != null) {
//            for (Customer customer : customers1) {
//                System.out.println("Read customer: " + customer);
//            }
//        }
//        filterByPaymentMethod(customers, "PayPal");
//        filterAndPrintByEmail(customers, "da");
//        searchAndPrintInJsonFile("Customer.json", Customer.class, "hufdsf");
        
    }
}
