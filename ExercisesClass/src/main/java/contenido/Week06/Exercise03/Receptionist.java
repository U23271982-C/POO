package contenido.Week06.Exercise03;

import java.util.Date;

public class Receptionist extends Administrative{
    public Receptionist(String name, String paternalSurname, String maternalSurname, Date birthdate, char gender, String address, int telephone, String mail, Date clinicalAdmision, double salary) {
        super(name, paternalSurname, maternalSurname, birthdate, gender, address, telephone, mail, clinicalAdmision, salary);
    }
}
