package ejercicio2;

public class Circulo {

    //atributos.
    private double radio;

    //constructor
    public Circulo() {
        radio = 10;
    }

    public double calcularArea() {
        return Math.PI + radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public void escalarCirculo(double porcentaje) {
        radio += radio * (porcentaje / 100);
    }
}
