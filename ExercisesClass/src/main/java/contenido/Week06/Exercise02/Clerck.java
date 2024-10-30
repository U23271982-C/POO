package contenido.Week06.Exercise02;

public class Clerck extends Employee{
    private String speciatly;

    public Clerck(String lastName, String name,
                  String DNI, String address, String speciatly) {
        super(lastName, name, DNI, address);
        this.speciatly = speciatly;
    }
}
