package be.intecbrussel.eatables;

public class Magnum implements Eatable {
    private MagnumType type;

    public Magnum(){

    }
    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("eating "+getType());
    }

    public MagnumType getType() {
        return  this.type;
    }
    public enum MagnumType{
        MILKCHOCOLATE, WHITECHOCOLATE,BLACKCHOCOLATE,ALPINENUTS, ROMANTICSTRAWBERRIES
    }
}
