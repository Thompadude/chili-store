package shop;

import java.util.Arrays;

public class GetCartInfo {

    GetChiliesInCart cfcic = new GetChiliesInCart();
    CartManager cm = new CartManager();
            
    /**
     * @param cart is the current customer cart.
     * @return a String with complete info about the cart content.
     */
    public String getCartInfo(Cart cart) {

        String cartList = "";
        int totalPrice = cm.getTotalPrice(cart);
        
        if (!(cart == null)) {
            cartList += cfcic.getBellsInCart(cart);
            cartList += cfcic.getPimentoInCart(cart);
            cartList += cfcic.getPoblanoInCart(cart);
            cartList += cfcic.getJalapenoInCart(cart);
            cartList += cfcic.getCayenneTabascoInCart(cart);
            cartList += cfcic.getThaiInCart(cart);
            cartList += cfcic.getJamaicanInCart(cart);
            cartList += cfcic.getDevilsTongueInCart(cart);
            cartList += cfcic.getGhostInCart(cart);
            cartList += cfcic.getTrinidadInCart(cart);
            cartList += cfcic.getCarolinaInCart(cart);
            cartList += "\n\nTotal Price: " + totalPrice;
            if (cartList.equals("") || totalPrice == 0) {
                return "Cart is empty.";
            } else {
                return cartList;
            }
        }
        return null;
    }

}
