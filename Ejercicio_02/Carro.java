package Ejercicio_02;

public class Carro extends Vehiculo {
    int numPuertas;

    public Carro() {

    }

    public Carro(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Carro(String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "\nCarro [marca = " + marca + ", numPuertas = " + numPuertas + ", modelo = " + modelo + ", velocidadMaxima = "
                + velocidadMaxima + "]";
    }

   

   

    

}
