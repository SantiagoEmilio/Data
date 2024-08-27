import java.util.ArrayList;
import java.util.List;

public class Data {
    public static ArrayList listaDeAlumnos (){
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        alumnos.add(new Alumnos("Diego", "Villatorro",15));
        alumnos.add(new Alumnos("Pedro", "Giron",16));
        alumnos.add(new Alumnos("Santiago","López", 17));
        alumnos.add(new Alumnos("André","Calderon",18));
        alumnos.add(new Alumnos("Fernando","Orellana",17));
        return alumnos;

    }
}