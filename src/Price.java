public class Price {

    private double money;

    public void canPay(double priceObj, double newMoney){

        this.money = newMoney;
        if(this.money >= priceObj){
            this.money = this.money - priceObj;
            Bill();
        }else {
            System.out.println("The price of the product is higher than the money that you gave us");
        }

    }
    public void Bill(){
        System.out.println("Purchase is complete");
        System.out.println("Your change is " + this.money);
    }

}
