package contenido.Week06.Exercise03;

import java.util.Date;

public class Employee extends Person{
    private Date clinicalAdmision;
    private double salary;

    public Employee(String name, String paternalSurname, String maternalSurname,
                    Date birthdate, char gender, String address, int telephone,
                    String mail, Date clinicalAdmision, double salary) {
        super(name, paternalSurname, maternalSurname, birthdate, gender, address, telephone, mail);
        this.clinicalAdmision = clinicalAdmision;
        this.salary = salary;
    }
}
