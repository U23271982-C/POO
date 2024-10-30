package contenido.Week06.Exercise03;

import java.util.Date;

public class Patient extends Person{
    private int historyNumber;
    private Date registrationDate;
    private TownOfOrigin townOfOrigin;

    public Patient(String name, String paternalSurname, String maternalSurname,
                   Date birthdate, char gender, String address, int telephone,
                   String mail, int historyNumber, Date registrationDate,
                   TownOfOrigin townOfOrigin) {

        super(name, paternalSurname, maternalSurname, birthdate, gender,
                address, telephone, mail);

        this.historyNumber = historyNumber;
        this.registrationDate = registrationDate;
        this.townOfOrigin = townOfOrigin;
    }
}
