import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Datos:");

        ArrayList alumnos = Data.listaDeAlumnos();

        for (Object cadaObjeto : alumnos){
            System.out.println(cadaObjeto
            );
        }
    }

}
