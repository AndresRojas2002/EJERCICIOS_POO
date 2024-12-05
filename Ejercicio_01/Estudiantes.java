 

public class Estudiantes {

    String nombre;
    int edad;
    double promedio;

    

    public Estudiantes() {
    }



    public Estudiantes(String nombre, int edad,double promedio) {
        this.nombre = nombre;
        this.edad = edad;
      this.promedio = promedio;
    }

    public void mostrarDetalles(){
       System.out.println("Nombre : " + nombre + ", Edad : " + edad);

    }


    
public void esPromedio (){
if (promedio >= 3.0) {
    System.out.println("el estudiante " + nombre + " esta aprobado ");
    
}
else if (promedio < 3.0) {
    System.out.println("el estudiante " + nombre + " NO esta aprobado ");
} 
    
}
}
