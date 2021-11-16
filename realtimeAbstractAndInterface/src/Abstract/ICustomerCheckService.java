package Abstract;

import Entity.Customer;

public interface ICustomerCheckService {
    public boolean CheckIfRealPerson(Customer customer) throws Exception;
}
