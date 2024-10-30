package contenido.Week06.Exercise03;

import java.util.Date;

public class Doctor extends Medic {
    private String specialty;

    public Doctor(String name, String paternalSurname, String maternalSurname, Date birthdate, char gender, String address, int telephone, String mail, Date clinicalAdmision, double salary, String specialty) {
        super(name, paternalSurname, maternalSurname, birthdate, gender, address, telephone, mail, clinicalAdmision, salary);
        this.specialty = specialty;
    }
}
