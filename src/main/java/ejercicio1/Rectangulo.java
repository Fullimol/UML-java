
package ejercicio1;


public class Rectangulo {
    //atributos:
    private double ancho;
    private double alto;
    
    //constructor
    public Rectangulo(){
        ancho = 15;
        alto = 15;
    }
    
    //metodos
    public double calcularArea(){
        return ancho * alto;
    }
    
    public double calcularPerimetro(){
        return 2 * (ancho + alto);
    }
    
    public boolean esCuadrado(){
        return ancho == alto;
    }
    
    //getters
    public double getAncho(){
        return ancho;
    }
    
    public double getAlto(){
        return alto;
    }
    
   
}
