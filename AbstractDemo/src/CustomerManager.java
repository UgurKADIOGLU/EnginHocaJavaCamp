public class CustomerManager {

    BaseDataBaseMAnager baseDataBaseMAnager;

    CustomerManager(BaseDataBaseMAnager baseDataBaseMAnager){
        this.baseDataBaseMAnager=baseDataBaseMAnager;
    }

    public void getCustomer(){
        baseDataBaseMAnager.getData();
    }
}
