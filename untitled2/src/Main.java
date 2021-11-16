import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
import mernis.PDVKPSPublicSoap;
import mernis.PDVKPSPublicSoap;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
        Customer customer=new Customer();
        customer.firstName="Uğur";
        customer.dateOfBirth= LocalDate.parse("2002-09-01");
        customer.id=1;
        customer.nationalityId="43771598666";
        System.out.println(customer.dateOfBirth);
        baseCustomerManager.Save(customer);


        PDVKPSPublicSoap tiekpsPublicSoap=new PDVKPSPublicSoap();
        boolean dogruMu=tiekpsPublicSoap.TCKimlikNoDogrula(Long.parseLong("43771598666"),"UĞUR","KADIOĞLU",1983);
        if (dogruMu){
            System.out.println("Kimliğiniz doğru");
        }else {
            System.out.println("Kimliğiniz yanlış");
        }
    }
}
