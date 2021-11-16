package Adapters;

import Abstract.ICustomerCheckService;
import Entity.Customer;
import tcDogrulamaService.JGAKPSPublicSoap;


public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        JGAKPSPublicSoap jgakpsPublicSoap=new JGAKPSPublicSoap();
        return jgakpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.NationalityId),customer.firstName, customer.lastName,1983 );

    }
}
