public class Main {

    public static void main(String[] args) {
        /*ICustomerDal iCustomerDal = new MySqlCustomerDal();
        iCustomerDal.add();*/
        CustomerManager customerManager=new CustomerManager(new SqlServerDal());
        customerManager.add();
    }
}
