import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Estudiantes> listaEstudiante = new ArrayList<>();
        Estudiantes estudiante1 = new Estudiantes("Andres", 22,5.0);
        Estudiantes estudiante2 = new Estudiantes("luis", 20,2.0);

        listaEstudiante.add(estudiante1);
        listaEstudiante.add(estudiante2);

        for (Estudiantes estudiante : listaEstudiante) {
            estudiante.mostrarDetalles();
        }

        estudiante1.esPromedio();
        estudiante2.esPromedio();

    }

}
