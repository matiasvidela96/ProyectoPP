package Clases;

public class Wheel {
    private float diameter;
    private Brake brake;
    private Suspension suspension;
    private Tire tire;

    public Wheel(float diameter, Brake brake, Suspension suspension, Tire tire) {
        this.diameter = diameter;
        this.brake = brake;
        this.suspension = suspension;
        this.tire = tire;
    }
    
    
    
}
