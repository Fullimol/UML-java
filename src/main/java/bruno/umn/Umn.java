
package bruno.umn;


public class Umn {

    public class Circulo {
        //Atributos

        private double radio;

        //Metodos
        public Circulo(double radio) {
            this.radio = radio;
        }

        public double calcularArea(double radio) {
            return Math.PI * Math.pow(radio, 2);
        }

        public double calcularCircunferencia(double radio) {
            return 2 * Math.PI * radio;
        }
    }
}
