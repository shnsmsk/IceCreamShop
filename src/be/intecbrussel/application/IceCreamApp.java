package be.intecbrussel.application;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.IcecreamSalon;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.SoldOutException;

public class IceCreamApp {
    public static void main(String[] args) throws SoldOutException {
        PriceList priceList = new PriceList(1.5, 2, 2.5);
        IceCreamSeller iceCreamSeller = new IcecreamSalon(priceList);
        Magnum magnum = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        IceRocket iceRocket = iceCreamSeller.orderIceRocket();
        Cone cone = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE, Cone.Flavor.BANANA, Cone.Flavor.PISTACHE});
        Eatable[] iceCreams = {magnum, cone, iceRocket};
        for (Eatable iceCream : iceCreams
        ) {
            iceCream.eat();
        }
        System.out.println("Total Profit = " + iceCreamSeller.getProfit());
    }
}
