package Concrete;

import Abstract.ICustomerService;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class CustomerCheckManager implements IPersonCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
