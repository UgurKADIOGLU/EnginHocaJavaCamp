public class ProductManager {

    ProductValidator productValidator;
    Product product;

    ProductManager(ProductValidator productValidator,Product product){
        this.productValidator=productValidator;
        this.product=product;
    }

    public void add(){
        if(productValidator.isValid(product)){
            System.out.println("Girilen değerler doğru ürün eklendi");
        }else{
            System.out.println("girilen değelerde bir yanlışlık var. lütfen tekrar deneyiniz");
        }
    }
}
