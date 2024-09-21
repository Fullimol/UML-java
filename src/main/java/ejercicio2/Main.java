/*
Clase Círculo:
o Define una clase Círculo con un atributo radio de tipo double.
o Crea métodos para calcular el área y la circunferencia del círculo.
o Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un
porcentaje dado
 */
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("Circunferencia: " + circulo1.calcularCircunferencia());
        
        circulo1.escalarCirculo(20);
        System.out.println("Circulo escalado: ");
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("Circunferencia: " + circulo1.calcularCircunferencia());
        
    }
}
