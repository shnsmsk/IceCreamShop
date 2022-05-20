package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList(){}
    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
        System.out.println("--------------------------------------------");
        System.out.println("Price List ");
        System.out.println("Magnums");
        System.out.println("Magnum Milkchocolade :"+getMagnumPrice(Magnum.MagnumType.MILKCHOCOLATE));
        System.out.println("Magnum Blackchocolade :"+getMagnumPrice(Magnum.MagnumType.BLACKCHOCOLATE));
        System.out.println("Magnum Whitechocolade :"+getMagnumPrice(Magnum.MagnumType.WHITECHOCOLATE));
        System.out.println("Magnum Romanticstrawberries :"+getMagnumPrice(Magnum.MagnumType.ROMANTICSTRAWBERRIES));
        System.out.println("Magnum Alpinenuts :"+getMagnumPrice(Magnum.MagnumType.ALPINENUTS));
        System.out.println("--------------------------------------------");
        System.out.println("Rocket");
        System.out.println("Rocket Price :"+getRocketPrice());
        System.out.println("--------------------------------------------");
        System.out.println("Ball ");
        System.out.println("Ball Price"+getBallPrice());
        System.out.println("--------------------------------------------");
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {

        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        double totalPrice=0;
        if(type.equals(Magnum.MagnumType.ALPINENUTS)){
            totalPrice+=magnumStandardPrice*1.5;
        }
        else if(type.equals(Magnum.MagnumType.BLACKCHOCOLATE)){
            totalPrice+=magnumStandardPrice*1.6;
        }
        else if(type.equals(Magnum.MagnumType.MILKCHOCOLATE)){
            totalPrice+=magnumStandardPrice*1.7;
        }
        else if(type.equals(Magnum.MagnumType.ROMANTICSTRAWBERRIES)){
            totalPrice+=magnumStandardPrice*1.8;
        }
        else{
            totalPrice+=magnumStandardPrice*1.9;
        }
        return totalPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
