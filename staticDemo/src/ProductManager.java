public class ProductManager {


    Product product;

    ProductManager(Product product){

        this.product=product;
    }

    public void add(){
        if(ProductValidator.isValid(product)){
            System.out.println("Girilen değerler doğru ürün eklendi");
        }else{
            System.out.println("girilen değelerde bir yanlışlık var. lütfen tekrar deneyiniz");
        }
    }
}
