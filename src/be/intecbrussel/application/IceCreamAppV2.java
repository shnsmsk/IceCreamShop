package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) throws SoldOutException {
        PriceList priceList = new PriceList(1.5, 2, 2.5);
        Stock stock = new Stock(3, 3, 2, 3);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);
        Cone cone = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE});
        Cone cone1 = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE});
        Cone cone3 = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE});
        //Exception Handling part -------->
        try {
            Cone cone2 = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE});
        } catch (SoldOutException soldOutException) {
            System.err.println(soldOutException);
        }
        Magnum magnum = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        Magnum magnum1 = iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        Magnum magnum3 = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        try {
            Magnum magnum2 = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        } catch (SoldOutException soldOutException) {
            System.err.println(soldOutException);
        }
        IceRocket iceRocket = iceCreamSeller.orderIceRocket();
        IceRocket iceRocket1 = iceCreamSeller.orderIceRocket();
        IceRocket iceRocket2 = iceCreamSeller.orderIceRocket();
        try {
            IceRocket iceRocket3 = iceCreamSeller.orderIceRocket();
        } catch (SoldOutException soldOutException) {
            System.err.println(soldOutException);
        }
        Eatable[] iceCreams = {magnum,magnum1,magnum3, iceRocket, iceRocket1,iceRocket2, cone,cone1,cone3};
        for (Eatable iceCream:iceCreams
             ) {
            iceCream.eat();
        }
        System.out.println("Total profit " + iceCreamSeller.getProfit());
    }
}
