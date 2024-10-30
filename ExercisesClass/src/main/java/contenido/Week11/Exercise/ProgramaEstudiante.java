package contenido.Week11.Exercise;

public class ProgramaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.agregarEstudianteArrayList
                (new Estudiante(123, "Pablo", 13));
        estudiante.agregarEstudianteArrayList
                (new Estudiante(456, "Israel", 14));
        estudiante.agregarEstudianteArrayList
                (new Estudiante(789, "Martin", 14));

        estudiante.agregarEstudianteHashMap(new Estudiante(654,"Josecito",19));
        estudiante.agregarEstudianteHashMap(new Estudiante(789,"Jota",17));
        estudiante.agregarEstudianteHashMap(new Estudiante(321,"Sebastian",13));

        //System.out.println(estudiante.mostrarEstudiantesArrayList());
        //System.out.println(estudiante.mostrarEstudiantesHashMap());

        //estudiante.eliminarEstudianteArrayList(123);
        //estudiante.eliminarEstudianteHashMap(654);

        //System.out.println(estudiante.buscarEstudianteArrayList(123));
        System.out.println(estudiante.buscarEstudianteHashMap(654));
    }
}
