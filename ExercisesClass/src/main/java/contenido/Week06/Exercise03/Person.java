package contenido.Week06.Exercise03;

import java.util.Date;

public class Person {
    private String name;
    private String paternalSurname;
    private String maternalSurname;
    private Date birthdate;
    private char gender;
    private String address;
    private int telephone;
    private String mail;

    public Person(String name, String paternalSurname, String maternalSurname,
                  Date birthdate, char gender, String address, int telephone, String mail) {
        this.name = name;
        this.paternalSurname = paternalSurname;
        this.maternalSurname = maternalSurname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.address = address;
        this.telephone = telephone;
        this.mail = mail;
    }
}
