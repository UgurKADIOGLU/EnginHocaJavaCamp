public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        product.id = 1;
        product.name = "Bilgisayar";
        product.price = -10000;
        ProductValidator productValidator = new ProductValidator();
        productValidator.isValid(product);
        ProductManager productManager = new ProductManager(productValidator,product);
        productManager.add();
    }
}
