package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class StarbuksCustomerManager extends BaseCustomerManager {

    IPersonCheckService iPersonCheckService;

    StarbuksCustomerManager(IPersonCheckService iPersonCheckService){
        this.iPersonCheckService=iPersonCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (iPersonCheckService.CheckIfRealPerson(customer))
        {
            System.out.println("Save to db : " + customer.firstName);
        }

    }




}
