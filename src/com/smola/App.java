package com.smola;

public class App {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item buty = new Item("1234",10);
        Item kurtka = new Item("5678",40);
        shoppingCart.addItem(buty);
        shoppingCart.addItem(kurtka);
        shoppingCart.pay(new PayPalStrategy("marcin@gmail.com","haslo"));
        shoppingCart.pay(new CreditCardStrategy("Jan Kowalski","11","123","12/12"));
    }
}
