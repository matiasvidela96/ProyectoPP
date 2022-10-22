package Clases;

public class GearBox {
    private String gearBoxType;
    private String gearRatio;
    private String Currentgear;
    private Car car;

    public GearBox(String gearBoxType, String gearRatio, String Currentgear, Car car) {
        this.gearBoxType = gearBoxType;
        this.gearRatio = gearRatio;
        this.Currentgear = Currentgear;
        this.car = car;
        System.out.println("Se creo una instancia de GearBox");
    }
    
    
    
    public void shiftUp(){
        
    }
    public void shiftDown(){
        
    }
}
