import java.util.Scanner;

public class Facade {

    private double money;
    private String productType;

    Welcome welcome;
    Factory factory;
    Price price;

    public void Facade (Double newMoney){

        money = newMoney;

        Product newProduct = null;

        welcome = new Welcome();
        factory = new Factory();
        price = new Price();
        welcome.Entry();

        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextLine()){
            productType = userInput.nextLine();
            newProduct = factory.makeProduct(productType);
            price.canPay(newProduct.getPrice(),money);
        }





    }
}
