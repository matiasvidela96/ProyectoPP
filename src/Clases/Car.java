package Clases;

import java.util.LinkedHashSet;

public class Car {
    private int registrationNo;
    private String model;
    private int year;
    private int licenseNumber;
    private Engine engine;
    private Body body;
    private GearBox gearBox;
    private LinkedHashSet<Suspension> suspension;
    private LinkedHashSet<Brake> brake;
    static int contador = 0;
   
    public Car(int registrationNo, String model, int year, int licenseNumber) throws ErrorObjeto{
        this.registrationNo = registrationNo;
        this.model = model;
        this.year = year;
        this.licenseNumber = licenseNumber;
        contador++;
        if (contador>2) {
            throw new ErrorObjeto(this.getClass().getName());
        }
        System.out.println("Se creo una instancia de Car");
        
    }
    
    
    
    
    public void moveForward(){
        
    }
    public void moveBackward(){
        
    }
    public void stop(){
        
    }
    public void turnRight(){
        
    }
    public void turnLeft(){
        
    }
}
