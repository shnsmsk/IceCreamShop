package be.intecbrussel.sellers;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public interface IceCreamSeller extends Profitable {
    Cone orderCone(Cone.Flavor[] flavors) throws SoldOutException;

    IceRocket orderIceRocket()throws SoldOutException;

    Magnum orderMagnum(Magnum.MagnumType magnumType)throws SoldOutException;
}




