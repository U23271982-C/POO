package contenido.Week06.Exercise02;

public class Employee {
    private String lastName;
    private String name;
    private String DNI;
    private String address;
    public Employee(String lastName, String name, String DNI, String address) {
        this.lastName = lastName;
        this.name = name;
        this.DNI = DNI;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDNI() {
        return DNI;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
