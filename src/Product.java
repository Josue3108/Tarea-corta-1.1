import javax.xml.namespace.QName;

public abstract class Product {

    private double price;
    private String name;

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}
