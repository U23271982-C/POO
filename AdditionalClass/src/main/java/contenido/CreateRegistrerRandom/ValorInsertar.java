package contenido.CreateRegistrerRandom;

public class ValorInsertar {
    public String[] nombres = {"Carlos", "Ana", "Luis", "José", "María", "Juan", "Laura", "Sofía", "Pedro", "Lucía"};
    public String[] apellidos = {"García", "López", "Martínez", "Ramírez", "Fernández", "Hernández", "Gómez", "Pérez"};
    public String[] numDepartamento;
    public ValorInsertar() {
    }

    public String registroDepartamento(){
        return String.format("%.0f", Math.random()*10000);
    }

}
