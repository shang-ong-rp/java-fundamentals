package Project2;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Item> products = new ArrayList<Item>();

    public Products () {
        this.initStoreItems();
    }
    
    public List<Item> getProducts() {
        return products;
    }
    
    public void initStoreItems() {
        String [] productNames = {"Lux Soap", "Fair n Lovely", "MTR"};
        Double [] productPrice = {40.00d, 60.00d, 30.00d};
        Integer [] stock = {10, 6, 10};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Item(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}