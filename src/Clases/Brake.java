package Clases;

public class Brake {
    
    private String type;
    private Car car;
    private Wheel wheel;

    public Brake(String type, Car car) {
        this.type = type;
        this.car = car;
        System.out.println("Se creo una instancia de Brake");
    }
    
    
    
    public void apply(){
        
    }
    
}
