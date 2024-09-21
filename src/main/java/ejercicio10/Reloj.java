package ejercicio10;

public class Reloj {

    //atributos:
    private int hora;
    private int minuto;
    private int segundo;

    //constructor
    public Reloj() {
        hora = 00;
        minuto = 00;
        segundo = 00;
    };

    //metodos
    public void ajustarHora(int hora) {
        if (hora <= 24) {
            this.hora = hora;
        } else {
            this.hora = 24;
        };
    }

    public void ajustarMinuto(int minuto) {
        if (minuto <= 60) {
            this.minuto = minuto;
        } else {
            this.minuto = 60;
        };
    }

    public void ajustarSegundo(int segundo) {
        if (segundo <= 60) {
            this.segundo = segundo;
        } else {
            this.segundo = 60;
        };
    }

    public void avanzarUnSegundo() {
        this.segundo++;

        if (this.segundo > 60) {
            this.segundo = 0;
            this.minuto++;
        }
        if (this.minuto > 60) {
            this.minuto = 0;
            this.hora++;
        }
        if (this.hora > 24) {
            this.hora = 0;
        }
    }

    //getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
}
