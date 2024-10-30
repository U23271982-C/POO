package contenido.Week06.Exercise03;

import java.util.ArrayList;

public class Clinic {
    private ArrayList<Person> person;

    public Clinic() {
        person = new ArrayList<>();
    }

    public void registrerPerson(Person newPerson){
        person.add(newPerson);
     }
}
