import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.StarBucksCustomerManager;
import Entity.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "UĞUR";
        customer.lastName = "KADIOĞLU";
        customer.DateOfBirth = LocalDate.parse("1983-03-07");
        customer.NationalityId="43771598666";

        BaseCustomerManager baseCustomerManager=new StarBucksCustomerManager(new MernisServiceAdapter());
        baseCustomerManager.Save(customer);
    }
}
