package Ejercicio_02;

public class Moto extends Vehiculo{
boolean tieneSidecar;




public Moto() {
}



public Moto(boolean tieneSidecar) {
    this.tieneSidecar = tieneSidecar;
}



public Moto(String marca, String modelo, int velocidadMaxima, boolean tieneSidecar) {
    super(marca, modelo, velocidadMaxima);
    this.tieneSidecar = tieneSidecar;
}



public boolean isTieneSidecar() {
    return tieneSidecar;
}

public void setTieneSidecar(boolean tieneSidecar) {
    this.tieneSidecar = tieneSidecar;
}



@Override
public String toString() {
    return "\nMoto [marca = " + marca + ", tieneSidecar = " + tieneSidecar + ", modelo = " + modelo + ", velocidadMaxima = "
            + velocidadMaxima + "]";
}







}
