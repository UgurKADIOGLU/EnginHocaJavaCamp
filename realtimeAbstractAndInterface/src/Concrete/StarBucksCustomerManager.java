package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entity.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager {

    ICustomerCheckService iCustomerCheckService;

    public StarBucksCustomerManager(ICustomerCheckService iCustomerCheckManager) {
        this.iCustomerCheckService = iCustomerCheckManager;
    }


    @Override
    public void Save(Customer customer) throws Exception {
        if (iCustomerCheckService.CheckIfRealPerson(customer)) {
            System.out.println("Kişi başarıyla kayıt edildi...");
        }else {
            System.out.println("Geçerli bir kişi değil...");
        }

    }
}
