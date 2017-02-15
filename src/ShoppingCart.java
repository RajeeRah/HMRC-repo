
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{

    List<Fruit> items;
    
    public ShoppingCart(){
        items = new ArrayList<Fruit>();
    }
    
    public void add(Fruit item) {
        items.add(item);
    }

    public int getTotalItems() {
        return items.size();
    }
    
    public Double Checkout() {
        
        double total = 0;
        
        for(Fruit item : items){            
            total += item.getPrice();
        }
        
        return total;
    }
    
    public Double CheckoutWithOffers() {
        
        double total = 0;
        int appleCounter = 0;
        int orangeCounter = 0;
        
        for(Fruit item : items) {

            switch(item.getFruit()) {
                
                case "Apple": 
                    appleCounter += 1;
                    
                case "Orange": 
                    orangeCounter += 1;
            }
        }
        
        if (appleCounter%2 == 0) {
            // buy one, get one free
            total += (appleCounter / 2) * 0.6;
        } else {
            // buy one, get one free + rest of 1 price / here can be displayed a message, that she/he can get onother one for free
            total += (((appleCounter - 1) / 2) * 0.6) + 0.6;
        }
        
        if (orangeCounter%3 == 0) {
            // 3 for the price of 2
            total += ((orangeCounter / 3) * 2 ) * 0.25;
        } else {
            // 3 for the price of 2 + rest with normal Pirce
            total += (((orangeCounter / 3) * 2 ) + (orangeCounter % 3)) * 0.25;
        }   
        
        return total;
    }
}
