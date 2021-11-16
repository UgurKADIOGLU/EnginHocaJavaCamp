package Abstract;

import Entity.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    @Override
    public void Save(Customer customer) {
        System.out.println("Save to db..."+customer.firstName);
    }
}
