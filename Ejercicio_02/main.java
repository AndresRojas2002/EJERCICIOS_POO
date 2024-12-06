package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
    

    Carro carro1 = new Carro("Ferrari", "SF90 Stradale" ,340, 2);
    Carro carro2 = new Carro("Lamborghini", "Huracan EVO", 325 ,2);
    Moto moto1 = new Moto("kawasaki", "Ninja H2", 400, false);
    Moto moto2 = new Moto("Ural", "Gear Up 2WD", 105, true);
    Carro carro3 = new Carro("Ferrari", "SF90 Stradale" ,340, 2);

    List<Vehiculo> listaVehiculos = new ArrayList<>();
    listaVehiculos.add(carro1);
    listaVehiculos.add(carro2);
    listaVehiculos.add(moto1);
    listaVehiculos.add(moto2);
    listaVehiculos.add(carro3);

 
    System.out.println(listaVehiculos.toString());
    System.out.println("\nlos vehiculos son iguales = "+ carro1.equals(carro3));
    System.out.println("los vehiculos son iguales = "+ carro2.equals(carro3));
   
}


}



