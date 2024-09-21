/*
Clase Rectángulo:
o Crea una clase Rectángulo con atributos ancho y alto de tipo double.
o Implementa métodos para calcular el área y el perímetro del rectángulo.
o Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si ancho
y alto son iguales
*/

package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("ANCHO: " + rectangulo.getAncho() + " ALTO: " + rectangulo.getAlto());
        
        System.out.println("El area es: " + rectangulo.calcularArea());
        System.out.println("El perimetro es: " + rectangulo.calcularPerimetro());
        
        if(rectangulo.esCuadrado()){
            System.out.println("Es un cuadrado");
        } else {
            System.out.println("Es un rectangulo");
        }
    }
}