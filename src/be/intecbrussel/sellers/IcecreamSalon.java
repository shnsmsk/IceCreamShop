package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;


public class IcecreamSalon implements IceCreamSeller{
    private PriceList priceList;
    private double totalProfit;

    public IcecreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone=new Cone(flavors);
        totalProfit+=priceList.getBallPrice()*flavors.length;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket=new IceRocket();
        totalProfit+=priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum=new Magnum(magnumType);
        totalProfit+=priceList.getMagnumPrice(magnumType);
        return magnum;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "IcecreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
