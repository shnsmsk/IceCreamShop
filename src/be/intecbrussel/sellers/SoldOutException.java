package be.intecbrussel.sellers;

public class SoldOutException extends Exception{
    public SoldOutException(String message){
        super(message);
    }
}
