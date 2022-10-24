package Clases;

/**
 *
 * @author Augusto Ana
 */
public class ErrorObjeto extends Exception{
    String clase;
    public ErrorObjeto(String clase) {
        this.clase=clase;
    }
    public void Error(){
        System.out.println("Error: no se pueden crear más de 2 instancias de " + clase);
    }
    
}
