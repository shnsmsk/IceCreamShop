package be.intecbrussel.eatables;

public class Cone implements Eatable{
    private Flavor [] balls;

    public Cone(){}

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("eating cone with");
        for (Flavor ball:balls
             ) {
            System.out.println(ball);
        }
    }
    public enum Flavor{
        STRAWBERRY,BANANA,CHOCOLATE,VANILLA,LEMON,STRACIATELLA,MOKKA,PISTACHE
    }

}
