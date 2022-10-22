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

    public Car(int registrationNo, String model, int year, int licenseNumber, Engine engine, Body body, GearBox gearBox, LinkedHashSet<Suspension> suspension, LinkedHashSet<Brake> brake) {
        this.registrationNo = registrationNo;
        this.model = model;
        this.year = year;
        this.licenseNumber = licenseNumber;
        this.engine = engine;
        this.body = body;
        this.gearBox = gearBox;
        this.suspension = suspension;
        this.brake = brake;
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
