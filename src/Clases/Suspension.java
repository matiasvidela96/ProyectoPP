package Clases;

public class Suspension {
    private float springRate;
    private Wheel wheel;

    public Suspension(float springRate, Wheel wheel) {
        this.springRate = springRate;
        this.wheel = wheel;
        System.out.println("Se creo una instancia de Suspension");
    }
    
}
