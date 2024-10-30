package contenido.Week11.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private int codigo;
    private String nombre;
    private int edad;

    ArrayList<Estudiante> estudiantes;
    HashMap<Integer ,Estudiante> mapaEstudiantes = new HashMap<>();

    //#region Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //#endregion

    public Estudiante
            (int codigo, String nombre, int edad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
        this.estudiantes = new ArrayList<>();
        this.mapaEstudiantes = new HashMap<>();
    }

    //Agregar estudiante
    public void agregarEstudianteArrayList(Estudiante e){
        this.estudiantes.add(e);
    }
    public void agregarEstudianteHashMap(Estudiante e){
        this.mapaEstudiantes.put(e.getCodigo(), e);
    }

    //Eliminar estudiante
    public void eliminarEstudianteArrayList(Integer codigoAlumno){

        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCodigo() == codigoAlumno){
                estudiantes.remove(i);
            }
        }
    }
    public void eliminarEstudianteHashMap(Integer codigoAlumno){
        this.mapaEstudiantes.remove(codigoAlumno);
    }

    //Buscar estudiante
    public String buscarEstudianteArrayList(Integer codigoAlumno){
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCodigo() == codigoAlumno){
                return String.format("Se encontró elalumno\n %s",
                        estudiantes.get(i).toString());
            }
        }
        return "No se econtró el alumno";
    }
    public String buscarEstudianteHashMap(Integer codigoAlumno){
        if (this.mapaEstudiantes.containsKey(codigoAlumno)) {
            return "Se encontro el alumno: " + mapaEstudiantes.get(codigoAlumno).toString();
        }
        else {
            return "No se encuentró el alumno";
        }
    }

    //Mostrar todos los alumnos
    public String mostrarEstudiantesArrayList(){

        StringBuilder sb = new StringBuilder();
        for(Estudiante estudiante: estudiantes){
            sb.append(String.format("%s\n", estudiante.toString()));
        }
        return sb.toString();
    }
    public String mostrarEstudiantesHashMap(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Estudiante> entry : mapaEstudiantes.entrySet()) {
            sb.append(String.format("%s\n",entry));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format
                ("Codigo <%d> del alumno %s tiene la edad de [%d] años",
                        codigo, nombre, edad);
    }
}
