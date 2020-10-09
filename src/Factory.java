public class Factory {

    public Product makeProduct (String newProduct){
        Product productBought = null;

        if(newProduct.equals("A")){
            return new Apple();
        }else {
            if(newProduct.equals("B")){
                return new Blueberry();
            }else {
                if(newProduct.equals("C")){
                    return new Cheese();
                }else return null;
            }
        }
    }
}
