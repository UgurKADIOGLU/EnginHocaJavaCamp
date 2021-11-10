public class CustomerManager {

    private ICustomerDal iCustomerDal;

    CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal=iCustomerDal;
    }

    public void add(){
        System.out.println("Kişi eklendi");
        iCustomerDal.add();
    };
}
