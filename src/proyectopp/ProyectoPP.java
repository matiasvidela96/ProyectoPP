package proyectopp;

import Clases.*;

    
public class ProyectoPP {

    public static void main(String[] args) {
        try{
        Car c1 = new Car(1,"Toro",2022,123456);
        Car c2 = new Car(1,"Hilux",2023,987654);
        Car c3 = new Car(1,"Palio",2020,654321);
        }
        catch(ErrorObjeto ex){
            ex.Error();
        }
        
    }
    
}
