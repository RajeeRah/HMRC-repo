// Chart Test
public class ShoppingCartTest {

    ShoppingCart cart;
    Fruit orange;
    Fruit apple;


    public void insertTestData(){
        cart = new ShoppingCart();
        orange = new Fruit();
        orange.setFruit("Orange");
        orange.setPrice(0.25);

        apple = new Fruit();
        apple.setFruit("Apple");
        apple.setPrice(0.6);

    }

    @Test
    public void addOneItemToCart() {
        cart.add(orange);
        assertThat(cart.getTotalItems(), is(1));
        assertThat(cart.items.get(0).getFruit().equals("Orange"), is(true));
    }

    @Test
    public void addTwoItemsToCart(){
        cart.add(orange);
        cart.add(apple);
        assertThat(cart.getTotalItems(), is(2));
    }

    @Test
    public void addApplesToCart(){
        cart.add(apple);
        cart.add(apple);
        cart.add(apple);
        cart.add(apple);
        cart.add(apple);
        assertThat(cart.getTotalItems(), is(6));
        assertThat(cart.Checkout() == 3.00, is(true));   
    }

    @Test
    public void addApplesToCartWithOffers(){
        cart.add(apple);
        cart.add(apple);
        cart.add(apple);
        cart.add(apple);
        cart.add(apple);
        cart.add(apple);
        assertThat(cart.getTotalItems(), is(6));
        assertThat(cart.CheckoutWithOffers()== 2.40, is(true));   
    }

    @Test
    public void addItemsToCart(){
        cart.add(orange);
        cart.add(orange);
        cart.add(orange);
        cart.add(orange);
        cart.add(apple);
        cart.add(apple);
        assertThat(cart.getTotalItems(), is(6));
        assertThat(cart.Checkout() == 2.20, is(true));   
    }

    @Test
    public void addItemsToCartWithOffers(){
        cart.add(orange);
        cart.add(orange);
        cart.add(orange);
        cart.add(orange);
        cart.add(apple);
        cart.add(apple);
        assertThat(cart.getTotalItems(), is(6));
        assertThat(cart.CheckoutWithOffers()== 1.35, is(true));   
    }
}