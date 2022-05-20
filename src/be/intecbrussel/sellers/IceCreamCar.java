package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) throws SoldOutException {
        Cone cone = prepareCone(flavors);
        profit += priceList.getBallPrice() * flavors.length;
        return cone;
    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws SoldOutException {
        if (stock.getCones() < 0) {
            throw new SoldOutException("Sold Out :/ No More Cones");
        }
        if(stock.getBalls()< flavors.length){
            throw new SoldOutException("Sold Out :/ No more Cones(balls)");
        }
        int newStock = stock.getCones();
        newStock--;
        stock.setCones(newStock);
        int newStockballs=stock.getBalls()-flavors.length;
        stock.setBalls(newStockballs);
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() throws SoldOutException {
        IceRocket iceRocket = prepareIceRocket();
        profit += priceList.getRocketPrice();
        return iceRocket;
    }

    private IceRocket prepareIceRocket() throws SoldOutException {
        if (stock.getIceRockets() <= 0) {
            throw new SoldOutException("Sold Out :/ No more Ice Rockets");
        }
        int newStock = stock.getIceRockets();
        newStock--;
        stock.setIceRockets(newStock);
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) throws SoldOutException {
        Magnum magnum = prepareMagnum(magnumType);
        profit += priceList.getMagnumPrice(magnumType);
        return magnum;
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) throws SoldOutException {
        if (stock.getMagni() < 0) {
            throw new SoldOutException("Sold Out :/ No more Magnum");
        }
        int newStock = stock.getMagni();
        newStock--;
        stock.setMagni(newStock);
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return profit;
    }

}
