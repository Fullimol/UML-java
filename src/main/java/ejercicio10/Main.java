/*
10. Clase Reloj:
o Diseña una clase Reloj con atributos hora, minuto, y segundo.
o Implementa métodos para ajustar la hora, minuto y segundo.
o Crea un método que permita avanzar el reloj un segundo, asegurando que los valores de hora, minuto
y segundo se mantengan correctos.
 */
package ejercicio10;

public class Main {

    public static void main(String[] args) {

        Reloj reloj1 = new Reloj();

        reloj1.ajustarHora(18);
        reloj1.ajustarMinuto(60);
        reloj1.ajustarSegundo(59);

        System.out.println(reloj1.getHora() + " : " + reloj1.getMinuto() + " : " + reloj1.getSegundo());
        
        reloj1.avanzarUnSegundo();
        System.out.println("AVANZO 1 SEGUNDO:");
        
        System.out.println(reloj1.getHora() + " : " + reloj1.getMinuto() + " : " + reloj1.getSegundo());
    }
}
